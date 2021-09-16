package com.zxk.ssm.xml.controller.v1;

import com.zxk.ssm.xml.controller.api.UserControllerApi;
import com.zxk.ssm.xml.model.dto.UserDTO;
import com.zxk.ssm.xml.model.handler.UserMapper;
import com.zxk.ssm.xml.model.result.ResponseResult;
import com.zxk.ssm.xml.model.vo.UserVO;
import com.zxk.ssm.xml.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author byZhao
 * @Modify 2021/9/14 19:47
 * Talk is cheap. Show me the code.
 */
@Controller
public class UserController implements UserControllerApi {
    @Autowired
    private UserService userService;


    @Override
    @PostMapping("/register")
    public ResponseResult register(@RequestBody UserVO vo) {
        System.out.println("abc");
        UserDTO userDTO = UserMapper.iNSTANCE.userVO2UserDTO(vo);
        System.out.println(userDTO);
        return userService.register(userDTO);
    }
}
