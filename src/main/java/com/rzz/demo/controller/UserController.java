package com.rzz.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 16559
 */
@Controller
public class UserController {

    @RequestMapping("/login")
    @ResponseBody
    public String login(){
        System.out.println("================");
        return "登录成功";
    }
}
