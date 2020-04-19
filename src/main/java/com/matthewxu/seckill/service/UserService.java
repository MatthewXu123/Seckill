package com.matthewxu.seckill.service;

import com.matthewxu.seckill.model.User;
import org.springframework.stereotype.Service;

/**
 * @CLassName UserService
 * @Author MatthewXu
 * @Date 4/17/2020
 * Description: TODO
 */
public interface UserService {

    User getUserById(int id);
}
