package com.zxk.ssm.xml.enums;

/**
 * @program: ssm-xml
 * @description: 用户状态枚举
 * @author: xkZhao
 * @Create: 2021-09-14 21:07
 **/
public enum BehaviorType {
    /**
     * 1代表登录行为
     */
    LOGIN_BEHAVIOR(1, "登陆行为"),
    /**
     * 2代表注册行为
     */
    REGISTER_BEHAVIOR(2, "注册行为");

    /**
     * 状态
     */
    private final Integer type;
    /**
     * 描述
     */
    private final String desc;

    /**
     * 私有构造
     *
     * @param type
     * @param desc
     */
    private BehaviorType(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public Integer getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }
}
