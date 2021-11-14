package com.gongyu.service;

import com.gongyu.po.User;

public interface UserService {
    User checkUser(String username,String password);
}
