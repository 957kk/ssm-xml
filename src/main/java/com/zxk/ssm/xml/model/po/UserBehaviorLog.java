package com.zxk.ssm.xml.model.po;

import com.zxk.ssm.xml.enums.BehaviorType;
import lombok.Data;

import java.util.Date;

/**
 * @program: ssm-xml
 * @description: 用户实体类
 * @author: xkZhao
 * @Create: 2021-09-14 22:45
 **/
@Data
public class UserBehaviorLog {
    /**
     * 主键id
     */
    private Long id;
    /**
     * 行为
     */
    private String behavior;
    /**
     * 类型
     *
     * @see BehaviorType
     */
    private Integer type;
    /**
     * 行为时间
     */
    private Date handleTime;
    /**
     * userId
     */
    private Long userId;

}
