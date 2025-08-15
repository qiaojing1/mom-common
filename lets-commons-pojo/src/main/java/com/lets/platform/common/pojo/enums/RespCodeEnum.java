package com.lets.platform.common.pojo.enums;

/**
 * 浏览器错误响应
 * @Author DING WEI
 * @Date 2021/04/23 13:50
 * @Version 1.0
 **/
public enum RespCodeEnum {
    /**
     * 操作成功
     */
    SUCCESS(200,"操作成功！"),

    /**
     * 操作失败
     */
    FAILURE(0,"操作失败！"),

	/**
	 * 系统数据异常
	 * */
	SYSTEM_ERROR(100,"系统数据异常，请联系管理员"),

	UPM_ERROR(403,"权限不足"),

	SYSTEM_DIRECTORY_ERROR(1000,"系统目录不能删除"),
    //*********************************用户模块**************************
	/**
	 * 用户登陆 -- 帐号密码登陆\找回密码
	 */
    UNREGISTERED(110700,"手机号未注册！"),
    /**
	 * 用户登陆 -- 帐号密码登陆
	 */
    ACCOUNT_PASSWORD_ERROR(110701,"帐号密码输入错误！"),
    /**
   	 * 用户登陆 -- 帐号密码登陆
   	 */
    FORMAT_ERROR(110702,"手机号码格式不正确！"),
    /**
   	 * 用户登陆 -- 退出登录
   	 */
    KICK(110703,"被人踢下线 ，定向到登录页面！"),
    /**
     * 用户登陆 -- 用户注册
     */
    REGISTERED(110704,"手机号码已注册！"),
    /**
     * 用户登陆 -- 用户注册/找回密码
     */
    IDENT_CODE_ERROR(110705,"手机验证码错误！"),
    /**
     * 用户登陆 -- 用户注册/找回密码
     */
    PUT_PASSWORD_DIFFER(110706,"2次密码输入不一致！"),
    /**
     * 用户登陆 -- 用户注册/找回密码
     */
    PASSWORD_FORMAT_ERROR(110707,"密码格式输入错误，请输入8-18位字母+数字！"),
    /**
     * 用户登陆 -- 用户注册/找回密码
     */
    PASSWORD_ERROR(110708,"输入密码位数不对，密码需8-18个字符！"),
    /**
     * 用户登陆 -- 用户注册/找回密码
     */
    PASSWORD_EMPTY(110709,"密码不能为空！"),
    /**
     * 用户登陆 -- 重置密码时获取验证码/验证码登录时获取验证码/注册时获取验证码
     */
    GAIN_IDENT_CODE(110711,"获取验证码失败！"),
    /**
     * 用户登陆 -- 修改个人资料
     */
    USERNAME_EMPTY(110712,"用户名不能为空！"),
    /**
     * 用户登陆 -- 修改个人资料
     */
    USERNAME_FORMAT_ERROR(110713,"用户名格式不正确！"),
    /**
     * 用户登陆 -- 修改个人资料
     */
    USERNAME_EXCEED_LENGTH(110714,"用户名字符超出限制！"),
    /**
     * 用户登陆 -- 修改个人资料
     */
    SAVE_FAIL(110715,"保存失败！"),
    /**
     * 用户登陆 -- 输出个人资料信息
     */
    QUERY_PERSONAL_INFO_FAIL(110716,"获取个人资料失败！"),
    /**
     * 用户登陆 -- 上传图像
     */
    PHOTO_TYPE_ERROR(110717,"图片格式不对，JPG，PNG！"),
    /**
     * 用户登陆 -- 上传图像
     */
    PHOTO_EXCEED_LIMIT(110718,"图片超出限制大小，限制2M以内！"),
    /**
     * 用户登陆 -- 上传图像
     */
    NETWORK_INTERRUPT(110719,"网络中断！"),
    /**
     * 用户登陆 -- 第三方登录回调到服务器的地址
     */
    AUTHORIZED_LOGIN_FAIL(110720,"授权登录失败！"),
    /**
     * 用户登陆 -- 第三方登录回调到服务器的地址
     */
    LOGIN_INTERFACE_ERROR(110721,"登录接口错误！"),
    /**
     * 控制区-- 帐号使用情况
     */
    ACCOUNTS_INEXISTENCE(110722,"帐号不存在！"),
    /**
     * 控制区 -- 帐号使用情况
     */
    ACCOUNTS_CANCEL(110723,"帐号已注销！"),
    /**
     * 控制区 -- 帐号使用情况
     */
    ACCOUNTS_DISABLE(110724,"帐号已停用！"),
    /**
     * 控制区 -- 帐号使用情况
     */
    ACCOUNTS_EXPIRE(110725,"帐号已过期！"),
    /**
     * 控制区 -- 帐号使用情况
     */
    ON_LINE(110726,"帐号正在登录！"),
    /**
     * 控制区 -- 帐号使用情况
     */
    OFF_LINE(110727,"帐号离线！"),
	/**
	 * 控制区 -- 帐号有效期到期情况
	 */
	QUERY_ACCOUNTS_EXPIRE_FAILED(110728,"查询帐号有效期失败！"),
	/**
	 * 控制区 -- 当前版本
	 */
	QUERY_CURRENT_VERSION_FAIL(110729,"获取当前版本失败！"),
	/**
	 * 控制区 -- 添加成员
	 */
	ADD_LEAGUER_FAIL(110730,"添加成员失败！"),
	/**
	 * 控制区 -- 添加成员/修改成员
	 */
	LEAGUER_NAME_EMPTY(110731,"输入的成员名不能为空！"),
    /**
     * 控制区 -- 添加成员/修改成员
     */
	LEAGUER_PHONE_EMPTY(110732,"输入的成员手机不能为空！"),
	/**
	 * 控制区 -- 添加成员/修改成员
	 */
	LEAGUER_EMAIL_ILLEGAL(110733,"输入的成员邮箱不合法！"),
	/**
	 * 控制区 -- 添加成员/修改成员
	 */
	LEAGUER_PHONE_ILLEGAL(110734,"输入的成员手机不合法！"),
    /**
     * 控制区 -- 添加成员/修改成员
     */
	LEAGUER_NAME_ILLEGAL(110735,"输入的成员名不合法！"),
	/**
	 * 控制区 -- 修改成员
	 */
	UPDATE_LEAGUER_FAIL(110737,"修改成员失败！"),
	/**
	 * 控制区 -- 删除成员
	 */
	DELETE_LEAGUER_FAI(110738,"删除成员失败！"),
	/**
	 * 控制区 -- 停用成员
	 */
	DISABLE_LEAGUER_FAIL(110739,"停用成员失败！"),
    /**
     * 控制区 -- 启用成员
     */
	ENABLE_LEAGUER_FAIL(110740,"启用成员失败！"),
	/**
	 * 控制区 -- 查询成员
	 */
	QUERY_LEAGUER_FAIL(110741,"查询成员失败！"),
	/**
	 * 控制区 -- 成员排序
	 */
	LEAGUER_SORT_FAIL(110742,"成员排序失败！"),
	/**
	 * 控制区 -- 成员角色调整
	 */
	UPDATE_LEAGUER_ROLE_FAIL(110743,"修改成员角色失败！"),
	/**
	 * 控制区 -- 成员角色调整
	 */
	ROLE_REPEAT(110744,"已有角色！"),
	/**
	 * 控制区 -- 新增角色
	 */
	ADD_ROLE_FAIL(110745,"增加角色失败！"),
	/**
	 * 控制区 -- 新增角色/修改角色
	 */
	ROLE_NAME_EMPTY(110746,"角色名不能为空！"),
	/**
	 * 控制区 -- 新增角色/修改角色
	 */
	ROLE_NAME_ILLEGAL(110747,"角色名不合法！"),
	/**
	 * 控制区 -- 修改角色
	 */
	UPDATE_ROLE_FAIL(110748,"修改角色失败！"),
	/**
	 * 控制区 -- 查询角色
	 */
	QUERY_ROLE_FAIL(110749,"查询角色失败！"),
	/**
	 * 控制区 -- 删除角色
	 */
	DELETE_ROLE_FAIL(110750,"删除角色失败！"),
	/**
	 * 控制区 -- 成员部门调整
	 */
	UPDATE_LEAGUER_DEPARTMENT_FAIL(110751,"修改成员部门失败！"),
	/**
	 * 控制区 -- 成员部门调整
	 */
	DEPARTMENT_REPEAT(110752,"已有部门！"),
	/**
	 * 控制区 -- 新增部门
	 */
	ADD_DEPARTMENT_FAIL(110753,"增加部门失败！"),
	/**
	 * 控制区 -- 新增部门/修改部门
	 */
	DEPARTMENT_NAME_EMPTY(110754,"部门名称不能为空！"),
	/**
	 * 控制区 -- 新增部门/修改部门
	 */
	DEPARTMENT_NAME_ILLEGAL(110755,"部门名称不合法！"),
	/**
	 * 控制区 -- 修改部门
	 */
	UPDATE_DEPARTMENT_FAIL(110756,"修改部门失败！"),
    /**
     * 控制区 -- 查询部门
     */
	QUERY_DEPARTMENT_FAIL(110757,"查询部门失败！"),
	/**
	 * 控制区 -- 删除部门
	 */
	DELETE_DEPARTMENT_FAIL(110758,"删除部门失败！"),
	/**
	 * 控制区 -- 授权
	 */
	POWER_FAILED(110759,"授权失败！"),
	/**
	 * 控制区 -- 查询授权
	 */
	QUERY_POWER_FAIL(110760,"查询授权失败！"),

	/**
	 * 登录的scope错误
	 */
	INVALID_SCOPE(499,"企业标识错误！")

	;

	//*********************************OTHERS**************************

    /**
     * 名称
     * */
    private String name;

    /**
     * 类型
     * */
    private Integer code;


    private RespCodeEnum(Integer code, String name) {
        this.name = name;
        this.code = code;
    }

    /**
     * 静态获取name方法
     * */
    public static String getName(Integer type) {
        for (RespCodeEnum c : RespCodeEnum.values()) {
            if (c.getCode().equals(type)) {
                return c.name;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
