package com.zxk.ssm.xml.dao;

import com.zxk.ssm.xml.model.po.UserBehaviorLog;

/**
 * @program: ssm-xml
 * @description: 积分
 * @author: xkZhao
 * @Create: 2021-09-14 22:57
 **/
public interface UserBehaviorLogDao {
    /**
     * 记录用户行为
     * @param log
     */
    void insertUserBehaviorLog(UserBehaviorLog log);

}
