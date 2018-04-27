package com.controller;

import javax.jms.Session;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dao.BillMapper;
import com.dao.ProviderMapper;

@Controller
@RequestMapping("/bill")
public class BillController {
	@Autowired
	BillMapper billMapper;
	@Autowired
	ProviderMapper providerMapper;
	
	@RequestMapping("/list.do")
	public String list(HttpServletRequest request, HttpSession session,
			String queryProductName,	//商品名称
			Integer queryProviderId,	//供应商的名称
			Integer queryIsPayment){	//是否付款
		session.setAttribute("providerList", providerMapper.findAll()); 
		request.setAttribute("billList", billMapper.findAll(queryProductName,queryProviderId,queryIsPayment));
		request.setAttribute("queryProductName", queryProductName);
		request.setAttribute("queryProviderId", queryProviderId);
		request.setAttribute("queryIsPayment", queryIsPayment);
		
		return "jsp/billlist";
	}
}












