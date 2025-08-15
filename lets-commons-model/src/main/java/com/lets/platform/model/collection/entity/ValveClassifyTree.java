package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

/**
 * <p>
 * 试压数据字典
 * </p>
 *
 * @author csy
 * @since 2024-01-08
 */
@Getter
@Setter
@TableName("collection_detect_dict")
@ApiModel(value = "CollectionDetectDict对象", description = "试压数据字典")
public class ValveClassifyTree extends BaseEntity {

    private String id;
    private String name;
    private String code;
    private String level;
    private String parentId;
    private String standardId;
    private String standardName;
    private List<ValveClassifyTree> children;

}
