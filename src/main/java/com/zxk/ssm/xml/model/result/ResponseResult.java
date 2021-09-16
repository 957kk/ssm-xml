package com.zxk.ssm.xml.model.result;

import com.zxk.ssm.xml.enums.ResultCodeEnum;
import lombok.Data;

/**
 * @program: ssm-xml
 * @description:
 * @author: xkZhao
 * @Create: 2021-09-14 22:41
 **/
@Data
public class ResponseResult {
    /**
     * 返回码
     */
    private Integer code;
    /**
     * 提示信息
     */
    private String message;
    /**
     * 数据
     */
    private Object data;

    private ResponseResult(ResultCodeEnum resultCodeEnum, Object data) {
        this.code = resultCodeEnum.getCode();
        this.message = resultCodeEnum.getMessage();
        this.data = data;
    }

    private ResponseResult(ResultCodeEnum resultCodeEnum) {
        this.code = resultCodeEnum.getCode();
        this.message = resultCodeEnum.getMessage();
    }

    public static ResponseResult ok() {
        return new ResponseResult(ResultCodeEnum.SUCCESS);
    }

    public static ResponseResult error() {
        return new ResponseResult(ResultCodeEnum.FAIL);
    }

    public static ResponseResult ok(ResultCodeEnum resultCodeEnum) {
        return new ResponseResult(resultCodeEnum);
    }

    public static ResponseResult error(ResultCodeEnum resultCodeEnum) {
        return new ResponseResult(resultCodeEnum);
    }

}
