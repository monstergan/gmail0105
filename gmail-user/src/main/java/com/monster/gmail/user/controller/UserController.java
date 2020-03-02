package com.monster.gmail.user.controller;

import com.monster.gmail.user.bean.UmsMember;
import com.monster.gmail.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("selectAllUser")
    @ResponseBody
    public List<UmsMember> selectAllUser(){
       List<UmsMember> umsMembers= userService.selectAllUser();
        return umsMembers;
    }
    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello user";
    }
}
