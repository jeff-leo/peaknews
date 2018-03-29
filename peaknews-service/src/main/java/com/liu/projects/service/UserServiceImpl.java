package com.liu.projects.service;


import com.liu.projects.common.po.User;
import com.liu.projects.repository.mapper.UserMapper;
import com.liu.projects.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liujianfeng
 * @date 2018/3/28 16:45
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(String uid) {
        return userMapper.selectByPrimaryKey(uid);
    }
}
