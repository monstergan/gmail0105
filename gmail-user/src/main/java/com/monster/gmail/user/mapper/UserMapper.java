package com.monster.gmail.user.mapper;

import com.monster.gmail.user.bean.UmsMember;


import java.util.List;

public interface  UserMapper extends tk.mybatis.mapper.common.Mapper<UmsMember> {

    List<UmsMember> selectAllUser();
}
