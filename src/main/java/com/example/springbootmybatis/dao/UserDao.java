package com.example.springbootmybatis.dao;

import com.example.springbootmybatis.model.UserDomain;

import java.util.List;

public interface UserDao {


        int insert(UserDomain record);



        List<UserDomain> selectUsers();
    }
