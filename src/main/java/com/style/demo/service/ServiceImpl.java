package com.style.demo.service;

import com.style.demo.dao.UserDao;
import com.style.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class ServiceImpl implements IUserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> findAllUser() {
        List<User> userList = userDao.findAllUser();
        return userList;
    }
}
