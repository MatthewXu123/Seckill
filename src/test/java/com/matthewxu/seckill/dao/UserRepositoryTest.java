package com.matthewxu.seckill.dao;

import com.matthewxu.seckill.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    private  UserRepository userRepository;

    @Test
    public void testGetOne(){
        User user = userRepository.getOne(1);
        assertEquals("tom",user.getUsername());
        assertEquals("123456",user.getPassword());
    }
}
