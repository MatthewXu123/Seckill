package com.matthewxu.seckill.dao;

import com.matthewxu.seckill.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @CLassName UserRepository
 * @Author MatthewXu
 * @Date 4/17/2020
 * Description: TODO
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Override
    User getOne(Integer integer);
}
