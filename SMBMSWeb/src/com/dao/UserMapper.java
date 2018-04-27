package com.dao;

import org.apache.ibatis.annotations.Param;

import com.bean.User;

public interface UserMapper {
	User login(@Param("userCode")String userCode,@Param("userPassword")String userPassword);
}