/*
 * csy
 */

package com.lets.platform.common.pojo.util;

import com.lets.platform.common.pojo.exception.LetsException;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @ClassName MultiFileUtil
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2024/11/5
 */
public class MultipartFileUtil {

        private static final Logger log = LoggerFactory.getLogger(MultipartFileUtil.class);

        private MultipartFileUtil() { }


        public static MultipartFile toMultipartFile(byte[] bytes, String fileName) {
            final FileItem fileItem = createFileItem(new ByteArrayInputStream(bytes), fileName);
            return new CommonsMultipartFile(fileItem);
        }

        private static FileItem createFileItem(InputStream is, String fileName) {
            return createFileItem(is, "file", fileName);
        }

        private static FileItem createFileItem(InputStream is, String fieldName, String fileName) {
            final DiskFileItemFactory fac = new DiskFileItemFactory(10240, null);
            FileItem fileItem = fac.createItem(fieldName, "multipart/form-data", true, fileName);
            final OutputStream fileItemOutStream;
            try {
                fileItemOutStream = fileItem.getOutputStream();
            } catch (IOException e) {
                log.error("获取FileItem输出流异常：{}", e.getMessage(), e);
                throw new LetsException(0,"文件转换异常");
            }

            try {
                IOUtils.copy(is, fileItemOutStream);
            } catch (IOException e) {
                log.error("写入FileItem异常：{}", e.getMessage(), e);
                throw new LetsException(0,"文件转换异常");
            }
            return fileItem;
        }
}
