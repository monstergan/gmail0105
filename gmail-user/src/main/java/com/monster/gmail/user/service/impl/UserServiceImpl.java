package com.monster.gmail.user.service.impl;

import com.monster.gmail.user.bean.UmsMember;
import com.monster.gmail.user.mapper.UserMapper;
import com.monster.gmail.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> selectAllUser() {

        List<UmsMember> umsMemberList=userMapper.selectAll();

        return umsMemberList;
    }
}
