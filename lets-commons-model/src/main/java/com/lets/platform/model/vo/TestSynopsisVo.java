/*
 * csy
 */

package com.lets.platform.model.collection.vo;

import com.lets.platform.model.common.entity.CommonFile;
import lombok.Data;
import org.springframework.http.ResponseEntity;

import java.io.OutputStream;
import java.io.Serializable;
import java.util.List;

/**
 * @ClassName TestSynopsisVo
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2024/10/31
 */
@Data
public class TestSynopsisVo implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<CommonFile> files;
    private String richText;
}
