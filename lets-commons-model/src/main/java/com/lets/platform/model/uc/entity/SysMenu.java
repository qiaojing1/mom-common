package com.lets.platform.model.uc.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import com.lets.platform.model.uc.vo.ButtonAndFieldPermissionVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * <p>
 * 菜单
 * </p>
 *
 * @author FZY
 * @since 2023-04-12
 */
@Getter
@Setter
@TableName("sys_menu")
@ApiModel(value = "SysMenu对象", description = "菜单")
public class SysMenu extends BaseEntity {

    @ApiModelProperty("菜单编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("父级编码")
    @TableField("parent_code")
    private String parentCode;

    @ApiModelProperty("菜单名称")
    @TableField("name")
    private String name;
    @TableField(exist = false)
    private String menuName;
    @TableField(exist = false)
    private CommonFile iconPathFile;

    @ApiModelProperty("菜单显示名称")
    @TableField(exist = false)
    private String displayName;

    @ApiModelProperty("排序")
    @TableField("sort")
    private Integer sort;

    @ApiModelProperty("路由")
    @TableField("router_path")
    private String routerPath;

    @ApiModelProperty("路由重定向")
    @TableField("router_redirect")
    private String routerRedirect;

    @ApiModelProperty("文件路径")
    @TableField("component_path")
    private String componentPath;

    @ApiModelProperty("图标路径")
    @TableField("icon_path")
    private String iconPath;
    @ApiModelProperty("图标具体地址")
    @TableField(exist = false)
    private CommonFile iconFile;

    @ApiModelProperty("tab页签是否可删除[0:否;1:是]")
    @TableField("tab_deletable")
    private Integer tabDeletable;

    @ApiModelProperty("模块名")
    @TableField("module_name")
    private String moduleName;

    @ApiModelProperty("状态[0:停用;1:启用]")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("菜单类型[0:web 1:小程序 2:工位机 3:PDA]")
    @TableField("type")
    private Integer type;

    @ApiModelProperty("是否详情页[0:否 1:是]")
    @TableField("is_details")
    private Integer isDetails;

    @ApiModelProperty("是否包含详情页[0:否 1:是]")
    @TableField("is_include_details")
    private Integer isIncludeDetails;

    @ApiModelProperty("是否启用数据权限[0:否;1:是]")
    @TableField("data_permissions")
    private Integer dataPermissions;

    @ApiModelProperty("是否是目录[0:否;1:是]")
    @TableField("is_directory")
    private Integer isDirectory;

    @ApiModelProperty("是否超级管理员菜单[0否,1是]")
    @TableField("is_admin")
    private Integer isAdmin;

    @ApiModelProperty("描述")
    @TableField("description")
    private String description;

    @ApiModelProperty("是否隐藏[0:否;1:是]")
    @TableField("is_hide")
    private Integer isHide;

    @ApiModelProperty("是否缓存[0:否;1:是]")
    @TableField("is_cache")
    private Integer isCache;

    @ApiModelProperty("页面名称")
    @TableField("page_name")
    private String pageName;

    @ApiModelProperty("是否可异步追加")
    @TableField("async_append")
    private String asyncAppend;

    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("是否支持工作流[0:否;1:是]")
    @TableField("flowable")
    private Integer flowable;

    @ApiModelProperty("是否支持打包 Y是N否")
    @TableField("support_package")
    private String supportPackage;

    @ApiModelProperty("打包所需前置菜单编码")
    @TableField("pre_menu_code")
    private String preMenuCode;

    @ApiModelProperty("打包所需前置菜单名称")
    @TableField(exist = false)
    private String preMenuName;

    @ApiModelProperty("打包所需当前菜单前缀请求地址")
    @TableField("prefix_base_url")
    private String prefixBaseUrl;

    @ApiModelProperty("菜单数据来源")
    @TableField("menu_data_source")
    private String menuDataSource;
    @ApiModelProperty("sql数据源")
    @TableField("sql_datasource")
    private String sqlDatasource;
    @ApiModelProperty("SQL")
    @TableField("execute_sql")
    private String executeSql;

    @ApiModelProperty("是否供应商协同[0:否;1:是]")
    @TableField("is_supplier_collaboration")
    private String isSupplierCollaboration;

    /**
     * 父级名称
     */
    @TableField(exist = false)
    private String parentName;

    @TableField(exist = false)
    private boolean checked;
    @TableField(exist = false)
    @ApiModelProperty("是否收藏")
    private boolean commoned;
    @TableField(exist = false)
    @ApiModelProperty("是否收藏")
    private Integer commonSort;
    @ApiModelProperty("图标(一二级目录的图标)")
    @TableField("photo_path")
    private String photoPath;
    @TableField(exist = false)
    private List<SysMenu> children;

    @TableField(exist = false)
    private ButtonAndFieldPermissionVO permission;

    @TableField(exist = false)
    @ApiModelProperty("业务对象菜单id")
    private String topLevelMenuId;
    @TableField(exist = false)
    @ApiModelProperty("业务对象菜单编码")
    private String topLevelMenuCode;
    @TableField(exist = false)
    @ApiModelProperty("业务对象菜单名称")
    private String topLevelMenuName;
    @TableField(exist = false)
    @ApiModelProperty("单据类别id")
    private String orderCategoryId;
    @TableField(exist = false)
    @ApiModelProperty("单据类别编码")
    private String orderCategoryCode;
    @TableField(exist = false)
    @ApiModelProperty("单据类别名称")
    private String orderCategoryName;
    @TableField(exist = false)
    @ApiModelProperty("配置的打印模板id")
    private String templateId;
    @TableField(exist = false)
    @ApiModelProperty("配置的打印模板名称")
    private String templateName;

    @TableField(exist = false)
    private List<SysMenuFieldPermission> fields;

    public void copy(SysMenu source) {
        this.parentCode = source.getParentCode();
        this.name = source.getName();
        this.sort = source.getSort();
        this.routerPath = source.getRouterPath();
        this.routerRedirect = source.getRouterRedirect();
        this.componentPath = source.getComponentPath();
        this.iconPath = source.getIconPath();
        this.status = source.getStatus();
        this.description = source.getDescription();
        this.isHide = source.getIsHide();
        this.isCache = source.getIsCache();
    }
}
