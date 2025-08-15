package com.lets.platform.model.base;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 实体类 通用基类
 *
 * @author fzy
 */
@Getter
@Setter
public class BaseTreeEntity extends BaseEntity {
    private String parentId;
    @TableField(exist = false)
    private boolean leafNode;
    @TableField(exist = false)
    private List<? extends BaseTreeEntity> children;
}
