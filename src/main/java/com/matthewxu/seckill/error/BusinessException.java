package com.matthewxu.seckill.error;

/**
 * @CLassName Busine
 * @Author MatthewXu
 * @Date 4/17/2020
 * Description: TODO
 */
public class BusinessException extends Exception implements CommonError {
    private CommonError commonError;

    public BusinessException(CommonError commonError) {
        super();
        this.commonError = commonError;
    }

    public BusinessException(CommonError commonError, String errorMsg){
        super();
        commonError.setErrorMsg(errorMsg);
        this.commonError = commonError;
    }

    @Override
    public int getErrorCode() {
        return this.commonError.getErrorCode();
    }

    @Override
    public String getErrorMsg() {
        return this.commonError.getErrorMsg();
    }

    @Override
    public CommonError setErrorMsg(String errorMsg) {
        this.commonError.setErrorMsg(errorMsg);
        return this;
    }
}
