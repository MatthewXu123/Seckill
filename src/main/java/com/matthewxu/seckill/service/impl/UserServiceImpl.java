package com.matthewxu.seckill.service.impl;

import com.matthewxu.seckill.dao.UserRepository;
import com.matthewxu.seckill.model.User;
import com.matthewxu.seckill.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @CLassName UserServiceImpl
 * @Author MatthewXu
 * @Date 4/17/2020
 * Description: TODO
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserById(int id) {
        return userRepository.getOne(id);
    }
}
