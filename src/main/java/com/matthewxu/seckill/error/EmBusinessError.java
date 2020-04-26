package com.matthewxu.seckill.error;

public enum EmBusinessError implements CommonError{
    //00000为通用错误码
    PARAMETER_VALIDATION_ERROR(10001,"参数不合法"),

    //00002为未知错误
    UNKNOWN_ERROR(10002,"未知错误"),
    //10000为用户信息相关错误定义
    USER_NOT_FOUND(20001,"用户不存在");

    EmBusinessError(int errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    private  int errorCode;

    private String errorMsg;

    @Override
    public int getErrorCode() {
        return this.errorCode;
    }

    @Override
    public String getErrorMsg() {
        return this.errorMsg;
    }

    @Override
    public CommonError setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
}
