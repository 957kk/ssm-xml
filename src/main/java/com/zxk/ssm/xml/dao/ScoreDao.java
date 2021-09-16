package com.zxk.ssm.xml.dao;

import com.zxk.ssm.xml.model.po.Score;

/**
 * @program: ssm-xml
 * @description: 积分
 * @author: xkZhao
 * @Create: 2021-09-14 22:57
 **/
public interface ScoreDao {

    /**
     * 添加积分DAO接口
     * @param score
     */
    void insertScore(Score score);
}
