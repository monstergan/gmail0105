package com.monster.gmail.user.mapper;

import com.monster.gmail.user.bean.UmsMember;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface  UserMapper {

    List<UmsMember> selectAllUser();
}
