package com.lets.platform.client.uc.client;

import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.common.vo.MaterialExtAttrUpdateVO;
import com.lets.platform.model.psi.entity.PsiOrderCategoryOrderNature;
import com.lets.platform.model.uc.entity.SysMenu;
import com.lets.platform.model.uc.entity.SysMenuFieldPermission;
import com.lets.platform.model.uc.vo.MenuDateConfigVO;
import io.swagger.annotations.ApiParam;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 菜单 Feign接口
 **/
@FeignClient(value = "uc", qualifier = "menuClient")
public interface MenuClient {

    @GetMapping("/sysMenuDataPermissionConfig/getMenuDataConfigByRoleId")
    RespMsgBean<MenuDateConfigVO> getRoleFieldPermission(@ApiParam(name = "tenancyId", value = "租户ID", required = true) @RequestParam("tenancyId") String tenancyId,
                                                         @ApiParam(name = "menuCode", value = "菜单编码") @RequestParam(value = "menuCode") String menuCode,
                                                         @ApiParam(name = "roleId", value = "角色ID") @RequestParam(value = "roleId") String roleId,
                                                         @ApiParam(name = "tabIndex", value = "tab页序号") @RequestParam(value = "tabIndex") Integer tabIndex);

    @GetMapping("/sysMenuFieldPermission/getRoleField")
    RespMsgBean<List<SysMenuFieldPermission>> getRoleField(@ApiParam(name = "menuCode", value = "菜单编码") @RequestParam(value = "menuCode") String menuCode,
                                                           @ApiParam(name = "tabIndex", value = "tab页序号") @RequestParam(value = "tabIndex") Integer tabIndex);

    @GetMapping("/sysMenuFieldPermission/getUserField")
    RespMsgBean<List<SysMenuFieldPermission>> getUserField(@ApiParam(name = "menuCode", value = "菜单编码") @RequestParam(value = "menuCode") String menuCode,
                                                           @ApiParam(name = "tabIndex", value = "tab页序号") @RequestParam(value = "tabIndex") Integer tabIndex);

    @GetMapping("/sysMenu/getDirectoryTree")
    RespMsgBean<List<SysMenu>> getDirectoryTree(@RequestParam(value = "menuCodes") List<String> menuCodes, @RequestParam(value = "type") Integer type);

    @PostMapping("/sysMenu/getMenuByCodes")
    RespMsgBean<List<SysMenu>> getMenuByCodes(@RequestBody List<String> menuCodes);

    @GetMapping("/sysMenu/getPermissionMenuListWithTenancy")
    RespMsgBean<List<SysMenu>> getPermissionMenuListWithTenancy(@RequestParam(value = "tenancyId") String tenancyId);

    @GetMapping("/sysMenu/getByCode")
    RespMsgBean<SysMenu> getByCode(@RequestParam(value = "menuCode") String menuCode);

    @GetMapping("/sysMenu/getMenuCodesByParentMenuCodes")
    RespMsgBean<List<String>> getMenuCodesByParentMenuCodes(@RequestParam(value = "parentCodes") List<String> parentCodes);

    @GetMapping("/sysMenu/getMenuCodesByMenuName")
    RespMsgBean<List<String>> getMenuCodesByMenuName(@RequestParam(value = "menuName") String menuName);

    @PostMapping("/sysMenuFieldPermission/updateMaterialExtAttrName")
    RespMsgBean<List<SysMenuFieldPermission>> updateMaterialExtAttrName(@RequestBody MaterialExtAttrUpdateVO materialExtAttrUpdateVO);

    @PostMapping("/sysMenu/findOrderNature")
    RespMsgBean<List<PsiOrderCategoryOrderNature>> findOrderNature(@RequestBody List<PsiOrderCategoryOrderNature> orderNatures);

    @PostMapping("/sysMenu/findByCodes4Map")
    RespMsgBean<Map<String, SysMenu>> findByCodes4Map(@RequestBody Collection<String> codes);

    @GetMapping("/sysMenu/getMenuListByCodesWithPermission")
    RespMsgBean<List<SysMenu>> getMenuListByCodesWithPermission(@RequestParam(value = "menuCodes") Collection<String> menuCodes);

    @GetMapping("/sysMenu/findMainCodeByDetailCode")
    RespMsgBean<SysMenu> findMainCodeByDetailCode(@RequestParam(value = "detailOrderCode") String detailOrderCode);
}
