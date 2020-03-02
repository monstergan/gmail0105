package com.monster.gmail.user.service;


import com.monster.gmail.user.bean.UmsMember;

import java.util.List;

public interface UserService {
    List<UmsMember> selectAllUser();
}
