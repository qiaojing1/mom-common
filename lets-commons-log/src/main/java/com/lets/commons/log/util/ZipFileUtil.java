package com.lets.commons.log.util;

import cn.hutool.core.collection.CollUtil;
import com.lets.platform.model.common.entity.CommonFile;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 */
@Log4j2
public class ZipFileUtil {
    public static void downloadFiles(List<CommonFile> files, String zipFileName, HttpServletResponse response) {
        if (CollUtil.isEmpty(files)) {
            throw new IllegalArgumentException("文件列表不能为空");
        }

        if (StringUtils.isBlank(zipFileName)) {
            zipFileName = String.valueOf(System.currentTimeMillis());
        }

        String downloadName = zipFileName + ".zip";

        try {
            response.reset();
            response.setCharacterEncoding(StandardCharsets.UTF_8.name());
            response.setContentType("application/zip");

            String encodedFilename = URLEncoder.encode(downloadName, StandardCharsets.UTF_8.name()).replaceAll("\\+", "%20");
            String contentDisposition = "attachment; filename*=UTF-8''" + encodedFilename;
            response.setHeader("Access-Control-Expose-Headers", "Content-Disposition");
            response.setHeader("Content-Disposition", contentDisposition);

            try (
                    OutputStream rawOut = response.getOutputStream();
                    BufferedOutputStream bufferedOut = new BufferedOutputStream(rawOut);
                    ZipOutputStream zipOut = new ZipOutputStream(bufferedOut)
            ) {
                zipOut.setMethod(ZipOutputStream.DEFLATED);
                Set<String> usedFileNames = new HashSet<>();

                for (CommonFile commonFile : files) {
                    String url = commonFile.getUrl();
                    String originalName = commonFile.getName();
                    String fileName = ensureUniqueFileName(originalName, usedFileNames);
                    String fileType = getFileTypeByUrl(url);

                    File file = getFileByUrl(url, fileType, fileName);
                    if (file == null || !file.exists()) {
                        log.warn("文件未找到或无法访问: {}", url);
                        continue;
                    }

                    zipOut.putNextEntry(new ZipEntry(fileName));
                    try (InputStream is = Files.newInputStream(file.toPath())) {
                        byte[] buffer = new byte[4096];
                        int len;
                        while ((len = is.read(buffer)) != -1) {
                            zipOut.write(buffer, 0, len);
                        }
                    } catch (IOException e) {
                        log.warn("读取文件出错: {}", file.getAbsolutePath(), e);
                    } finally {
                        zipOut.closeEntry();
                    }

                    if (isTempFile(file) && !file.delete()) {
                        log.warn("临时文件删除失败: {}", file.getAbsolutePath());
                    }
                }

                zipOut.flush();
            }

        } catch (IOException e) {
            log.error("下载压缩包失败: {}", zipFileName, e);
            throw new RuntimeException("压缩文件下载失败", e);
        }
    }

    private static String ensureUniqueFileName(String fileName, Set<String> usedNames) {
        String baseName = FilenameUtils.getBaseName(fileName);
        String extension = FilenameUtils.getExtension(fileName);
        String finalName = fileName;
        int counter = 1;

        while (usedNames.contains(finalName)) {
            finalName = baseName + "(" + counter + ")." + extension;
            counter++;
        }
        usedNames.add(finalName);
        return finalName;
    }

    private static boolean isTempFile(File file) {
        return file.getPath().contains("temp") || file.getName().startsWith("temp_");
    }

    /**
     * url转file
     */
    public static File getFileByUrl(String fileUrl, String suffix, String fileName) {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        BufferedOutputStream stream = null;
        InputStream inputStream = null;
        File file = null;
        try {
            URL imageUrl = new URL(fileUrl);
            HttpURLConnection conn = (HttpURLConnection) imageUrl.openConnection();
            conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
            inputStream = conn.getInputStream();
            byte[] buffer = new byte[1024];
            int len;
            while ((len = inputStream.read(buffer)) != -1) {
                outStream.write(buffer, 0, len);
            }
            file = File.createTempFile(fileName, suffix);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            stream = new BufferedOutputStream(fileOutputStream);
            stream.write(outStream.toByteArray());
        } catch (Exception e) {
        } finally {
            try {
                if (inputStream != null)
                    inputStream.close();
                if (stream != null)
                    stream.close();
                outStream.close();
            } catch (Exception e) {
            }
        }
        return file;
    }

    /**
     * 根据获取文件后缀
     */
    public static String getFileTypeByUrl(String url) {
        String suffixes = "3fr|arw|bmp|cr2|crw|dcr|dng|eps|erf|gif|icns|ico|jpeg|jpg|mos|mrw|nef|odd|orf|pdf|pef|png|ppm|ps|psd|raf|raw|svg|svgz|tif|tiff|webp|x3f|xcf|xps|		7z|ace|alz|arc|arj|bz|bz2|cab|cpio|deb|dmg|eml|gz|img|iso|jar|lha|lz|lzma|lzo|rar|rpm|rz|tar|tar.7z|tar.bz|tar.bz2|tar.gz|tar.lzo|tar.xz|tar.Z|tbz|tbz2|tgz|tZ|tzo|xz|z|zip|aac|ac3|aif|aifc|aiff|amr|caf|flac|m4a|m4b|mp3|oga|ogg|sf2|sfark|voc|wav|weba|wma|		3g2|3gp|3gpp|avi|cavs|dv|dvr|flv|gif|m2ts|m4v|mkv|mod|mov|mp4|mpeg|mpg|mts|mxf|ogg|rm|rmvb|swf|ts|vob|webm|wmv|wtv|		abw|djvu|doc|docm|docx|html|lwp|md|odt|pages|pages.zip|pdf|rst|rtf|sdw|tex|txt|wpd|wps|zabw|eps|html|key|key.zip|odp|pdf|pps|ppsx|ppt|pptm|pptx|ps|sda|swf|		csv|html|numbers|numbers.zip|ods|pdf|sdc|xls|xlsm|xlsx|azw|azw3|azw4|cbc|cbr|cbz|chm|docx|epub|fb2|htm|html|htmlz|lit|lrf|mobi|odt|oeb|pdb|pdf|pml|prc|rb|rtf|snb|tcr|txt|txtz|eot|otf|ttf|woff|dwg|dxf|ai|cdr|cgm|emf|eps|pdf|ps|sk|sk1|svg|svgz|vsd|wmf|website";
        // 正则判断
        Pattern pat = Pattern.compile("[\\w]+[\\.](" + suffixes + ")");
        // 条件匹配
        Matcher mc = pat.matcher(url);
        String substring = "";
        while (mc.find()) {
            // 截取文件名后缀名
            substring = mc.group();
        }
        return substring;
    }
}
