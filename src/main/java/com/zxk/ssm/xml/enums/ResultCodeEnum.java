package com.zxk.ssm.xml.enums;

/**
 * @program: ssm-xml
 * @description: 注册提示信息枚举类
 * @author: xkZhao
 * @Create: 2021-09-15 15:31
 **/
public enum ResultCodeEnum {
    /**
     * 成功与失败
     */
    SUCCESS(10001, "操作成功！"),
    FAIL(10002, "操作失败！"),

    /**
     * 用户注册业务枚举  20000
     */
    USER_INFO_IS_INVALID(20001, "用户信息无效！"),
    USER_INFO_NAME_IS_BLANK(20002, "用户名为空！"),
    USER_INFO_PASSWORD_IS_BLANK(20003, "密码为空！"),
    USER_INFO_NAME_IS_EXIST(20004, "用户已经存在！"),

    /**
     * 异常枚举
     */
    USER_BIZ_EXCEPTION(90000, "网络不好，请您稍后重试！"),
    EXCEPTION(90001, "您的数据跑丢了，请您稍后重试！");

    /**
     * 提示码
     */
    private final Integer code;
    /**
     * 提示信息
     */
    private final String message;


    private ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
