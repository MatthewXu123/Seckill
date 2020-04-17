package com.matthewxu.seckill.response;

/**
 * @CLassName CommonReturnType
 * @Author MatthewXu
 * @Date 4/17/2020
 * Description: TODO
 */
public class CommonReturnType {
    //success或者failed
    private String status;
    //success返回json,failed返回错误码
    private Object data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static CommonReturnType create(Object data){
        return create(data,"success");
    }

    public static CommonReturnType create(Object data, String status){
        CommonReturnType commonReturnType = new CommonReturnType();
        commonReturnType.setData(data);
        commonReturnType.setStatus(status);
        return commonReturnType;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
