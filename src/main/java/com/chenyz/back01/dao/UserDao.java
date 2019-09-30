package com.chenyz.back01.dao;

import com.chenyz.back01.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Create by cqca43004 on 2019/9/16,
 */
public interface UserDao extends JpaRepository<User,Integer> {
    User findByUsername(String username);

    User getByUsernameAndPassword(String username,String password);
}