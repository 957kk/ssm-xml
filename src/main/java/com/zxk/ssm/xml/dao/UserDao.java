package com.zxk.ssm.xml.dao;

import com.zxk.ssm.xml.model.po.User;

/**
 * @program: ssm-xml
 * @description:
 * @author: xkZhao
 * @Create: 2021-09-14 22:56
 **/
public interface UserDao {
    /**
     *  根据用户名称查询用户信息
     * @param name
     * @return
     */
    User selectUserByName(String name);

    /**
     *  添加用户到数据库
     * @param user
     */
    void insertUser(User user);
}
