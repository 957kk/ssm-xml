package com.zxk.ssm.xml.exception;

/**
 * @program: ssm-xml
 * @description:
 * @author: xkZhao
 * @Create: 2021-09-15 16:14
 **/
public class UserBizException extends RuntimeException {
    public UserBizException() {
    }

    public UserBizException(String message) {
        super(message);
    }

    public UserBizException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserBizException(Throwable cause) {
        super(cause);
    }

    public UserBizException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
