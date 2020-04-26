//package com.matthewxu.seckill.handler;
//
//import com.matthewxu.seckill.error.BusinessException;
//import com.matthewxu.seckill.error.EmBusinessError;
//import com.matthewxu.seckill.response.CommonReturnType;
//import org.springframework.http.HttpRequest;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.ResponseStatus;
//
//import javax.servlet.http.HttpServletRequest;
//import java.util.HashMap;
//import java.util.Map;
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
//    @ResponseBody
//    public Object handleException(HttpServletRequest req, Exception ex){
//        Map<String, Object> responseData = new HashMap<>();
//        if(ex instanceof BusinessException){
//            BusinessException be = (BusinessException)ex;
//            responseData.put("errCode", be.getErrorCode());
//            responseData.put("errMsg",be.getErrorMsg());
//        }else {
//            BusinessException be = (BusinessException)ex;
//            responseData.put("errCode", EmBusinessError.UNKNOWN_ERROR.getErrorCode());
//            responseData.put("errMsg",EmBusinessError.UNKNOWN_ERROR.getErrorMsg());
//        }
//
//        return CommonReturnType.create(responseData,"fail");
//    }
//}
