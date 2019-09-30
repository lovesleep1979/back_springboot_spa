package com.chenyz.back01.service;

import com.chenyz.back01.dao.UserDao;
import com.chenyz.back01.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create by cqca43004 on 2019/9/16,
 */
@Service
public class UserService {
    @Autowired
    UserDao userDAO;

    public boolean isExist(String username) {
        User user = getByName(username);
        return null!=user;
    }

    public User getByName(String username) {
        return userDAO.findByUsername(username);
    }

    public User get(String username, String password){
        return userDAO.getByUsernameAndPassword(username, password);
    }

    public void add(User user) {
        userDAO.save(user);
    }
}