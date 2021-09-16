package com.zxk.ssm.xml.controller.api;

import com.zxk.ssm.xml.model.result.ResponseResult;
import com.zxk.ssm.xml.model.vo.UserVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: ssm-xml
 * @description: 用户实体类
 * @author: xkZhao
 * @Create: 2021-09-14 22:45
 **/
@RestController

public interface UserControllerApi {

    /**
     * 用户注册接口
     *
     * @param vo view Object
     * @return
     */
    @PostMapping("/register")
    ResponseResult register(@RequestBody UserVO vo);

}
