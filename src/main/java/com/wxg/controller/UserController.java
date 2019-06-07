package com.wxg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping(value = "/add")
    public String add(){
        System.out.println("控制层添加用户！！");
        return "succ";
    }
}
