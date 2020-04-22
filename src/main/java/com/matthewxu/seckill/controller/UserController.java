package com.matthewxu.seckill.controller;

import com.matthewxu.seckill.error.BusinessException;
import com.matthewxu.seckill.error.EmBusinessError;
import com.matthewxu.seckill.model.User;
import com.matthewxu.seckill.response.CommonReturnType;
import com.matthewxu.seckill.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import javax.servlet.http.HttpServletRequest;

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

    @GetMapping(value = "/{id}")
    @ResponseBody
    public CommonReturnType getUser(@PathVariable("id")int id) throws BusinessException {
        User user = userService.getUserById(id);
        if(user == null)
            throw new BusinessException(EmBusinessError.USER_NOT_FOUND);
        return CommonReturnType.create(user);
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Object handleException(HttpServletRequest req, Exception ex){
        CommonReturnType commonReturnType = new CommonReturnType();
        commonReturnType.setStatus("fail");
        commonReturnType.setData(ex);
        return commonReturnType;
    }
}

