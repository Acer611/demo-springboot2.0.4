package com.style.demo.service;

import com.style.demo.entity.User;

import java.util.List;

/**
 * 用户service层接口
 */
public interface IUserService {

    /**
     * 查找所有用户信息
     * @return
     */
    List<User> findAllUser();
}
