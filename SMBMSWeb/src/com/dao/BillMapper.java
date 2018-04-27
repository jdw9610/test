package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bean.Bill;

public interface BillMapper {
    List<Bill> findAll(@Param("queryProductName")String queryProductName,	//商品名称
    		@Param("queryProviderId")Integer queryProviderId,	//供应商的名称
    		@Param("queryIsPayment")Integer queryIsPayment);
}