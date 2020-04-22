//package com.matthewxu.seckill.handler;
//
//import com.matthewxu.seckill.response.CommonReturnType;
//import org.springframework.http.HttpRequest;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseStatus;
//
//import javax.servlet.http.HttpServletRequest;
//
///**
// * @CLassName ExceptionHandler
// * @Author MatthewXu
// * @Date 4/22/2020
// * Description: TODO
// */
//@ControllerAdvice
//public class CustomExceptionHandler {
//
//    @ExceptionHandler(Exception.class)
//    @ResponseStatus(HttpStatus.OK)
//    public Object handleException(HttpServletRequest req, Exception ex){
//        CommonReturnType commonReturnType = new CommonReturnType();
//        commonReturnType.setStatus("failed");
//        commonReturnType.setData(ex);
//        return commonReturnType;
//    }
//}
