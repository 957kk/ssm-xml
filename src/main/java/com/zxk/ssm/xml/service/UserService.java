package com.zxk.ssm.xml.service;

import com.zxk.ssm.xml.model.dto.UserDTO;
import com.zxk.ssm.xml.model.result.ResponseResult;
import org.springframework.stereotype.Service;

/**
 * @program: ssm-xml
 * @description:
 * @author: xkZhao
 * @Create: 2021-09-14 22:51
 **/
//@Service
public interface UserService {

    /**
     * 定义注册业务
     * @param dto
     * @return
     */
    ResponseResult register(UserDTO dto);


}

