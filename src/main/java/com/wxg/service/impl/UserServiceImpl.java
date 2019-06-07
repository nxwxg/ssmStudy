package com.wxg.service.impl;

import com.wxg.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public String insert() {
        System.out.println("插入");
        return null;
    }
}
