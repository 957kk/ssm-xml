package com.zxk.ssm.xml.model.po;

import lombok.Data;

import java.util.Date;

/**
 * @program: ssm-xml
 * @description: 用户实体类
 * @author: xkZhao
 * @Create: 2021-09-14 22:45
 **/
@Data
public class User {
    /**
     * 主键id
     */
    private Long id;
    /**
     * 用户名称
     */
    private String name;
    /**
     * 登录密码
     */
    private String password;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 加盐
     */
    private String salt;

}

