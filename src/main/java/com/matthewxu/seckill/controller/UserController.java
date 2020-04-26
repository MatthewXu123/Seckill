package com.matthewxu.seckill.controller;

import com.matthewxu.seckill.error.BusinessException;
import com.matthewxu.seckill.error.EmBusinessError;
import com.matthewxu.seckill.model.User;
import com.matthewxu.seckill.response.CommonReturnType;
import com.matthewxu.seckill.service.UserService;
import org.hibernate.query.criteria.internal.BasicPathUsageException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @CLassName UserController
 * @Author MatthewXu
 * @Date 4/17/2020
 * Description: TODO
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private HttpServletRequest httpServletRequest;

    @GetMapping(value = "/{id}")
    @ResponseBody
    public CommonReturnType getUser(@PathVariable int id) throws BusinessException {
        User user = userService.getUserById(id);
        if(user == null)
            throw new BusinessException(EmBusinessError.USER_NOT_FOUND);
        return CommonReturnType.create(user);
    }

    @RequestMapping("/getOtp")
    @ResponseBody
    public CommonReturnType getOtp(@RequestParam String telephone){
        Random random = new Random();
        int randomInt = random.nextInt(99999);
        randomInt += 10000;
        String otpCode = String.valueOf(randomInt);

        httpServletRequest.getSession().setAttribute(telephone, otpCode);
        //发送到手机上省略
        System.out.println("telephone:" + telephone + "&otpCode:" + otpCode );
        return CommonReturnType.create(null);
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Object handleException(HttpServletRequest req, Exception ex){
        System.out.println("enter");
        Map<String, Object> responseData = new HashMap<>();
        if(ex instanceof BusinessException){
            BusinessException businessException = (BusinessException)ex;
            responseData.put("errCode", businessException.getErrorCode());
            responseData.put("errMsg",businessException.getErrorMsg());
        }else {
            responseData.put("errCode", EmBusinessError.UNKNOWN_ERROR.getErrorCode());
            responseData.put("errMsg",EmBusinessError.UNKNOWN_ERROR.getErrorMsg());
        }

        return CommonReturnType.create(responseData,"fail");
    }
}

