package com.itheima.controller;

import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping( "/user")
public class UserController {

    @RequestMapping("/mvcDemo")
    public String mvcDemo(){

        return "success";
    }
    @RequestMapping("/simpleParams")
    public String simpleParams(String name,Integer age){
        System.out.println(name);
        System.out.println(age);
        return "success";
    }

    @RequestMapping("/pojoParams")
    public String pojoParams(User user){
        System.out.println(user);
        return "success";
    }
    @RequestMapping("/pojoDateParams")
    public String pojoDateParams(User user){
        System.out.println(user);
        return "success";
    }
    @RequestMapping("/arrParams")
    public String arrParams(Integer[] ids){
        System.out.println(Arrays.toString(ids));
        return "success";
    }
    @RequestMapping("/listAndMapParams")
    public String listAndMapParams(User user){
        System.out.println(user);
        return "success";
    }
}
