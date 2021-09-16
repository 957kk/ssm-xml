package com.zxk.ssm.xml.model.dto;

import lombok.Data;

/**
 * @program: ssm-xml
 * @description: 业务逻辑层
 * @author: xkZhao
 * @Create: 2021-09-14 22:42
 **/
@Data
public class UserDTO {
    /**
     * 用户名
     */
    private String name;
    /**
     * 密码
     */
    private String password;
}
