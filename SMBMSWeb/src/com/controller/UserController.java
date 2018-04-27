package com.controller;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.User;
import com.dao.UserMapper;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserMapper userMapper;
	
	@RequestMapping("/login.do")
	public String login(HttpServletRequest request,HttpSession session,
			String userCode,String userPassword){
		User user = userMapper.login(userCode, userPassword);
		
		if (user == null) {
			request.setAttribute("error", "用户名或密码错误！");
			throw new RuntimeException("测试一下异常");
			//return "login";
		}
		session.setAttribute("user", user);
		return "jsp/frame";
	}
	
	@ExceptionHandler(value={RuntimeException.class})
	public String handlerException(RuntimeException e,HttpServletRequest request){
		request.setAttribute("e", e);
		return "error";
	}
}












