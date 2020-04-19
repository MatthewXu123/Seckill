package com.matthewxu.seckill.service;

import com.matthewxu.seckill.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testGetUserById(){
        User user = userService.getUserById(1);
        Assert.assertEquals("tom",user.getUsername());
        Assert.assertEquals("123456",user.getPassword());
    }

}
