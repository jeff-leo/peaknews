package com.liu.projects.service;


import com.liu.projects.common.po.User;
import org.springframework.stereotype.Service;

/**
 * @author liujianfeng
 * @date 2018/3/28 16:45
 */
public interface UserService {

    User getUser(String uid);
}
