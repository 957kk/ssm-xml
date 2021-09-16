package com.zxk.ssm.xml.model.po;

import lombok.Data;

import java.util.Date;

/**
 * @program: ssm-xml
 * @description: 积分实体类
 * @author: xkZhao
 * @Create: 2021-09-14 22:44
 **/
@Data
public class Score {
    /**
     * 主键id
     */
    private Long id;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 积分
     */
    private Integer score;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;

}