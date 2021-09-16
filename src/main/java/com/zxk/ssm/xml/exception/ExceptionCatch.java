package com.zxk.ssm.xml.exception;

import com.zxk.ssm.xml.enums.ResultCodeEnum;
import com.zxk.ssm.xml.model.result.ResponseResult;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @program: ssm-xml
 * @description:
 * @author: xkZhao
 * @Create: 2021-09-15 16:15
 **/
/*@Component
@ControllerAdvice
@ResponseBody*/
public class ExceptionCatch {

    @ExceptionHandler(UserBizException.class)
    public ResponseResult handleUserBizException(Exception e) {

        // 记录日志......

        return ResponseResult.error(ResultCodeEnum.USER_BIZ_EXCEPTION);
    }

    @ExceptionHandler(Exception.class)
    public ResponseResult handleException(Exception e) {

        // 记录日志......

        return ResponseResult.error(ResultCodeEnum.EXCEPTION);
    }

}
