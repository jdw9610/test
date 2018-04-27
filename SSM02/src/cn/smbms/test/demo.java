package cn.smbms.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.*;
import com.sun.java_cup.internal.runtime.Symbol;

import cn.smbms.dao.user.UserMapper;
import cn.smbms.pojo.Role;
import cn.smbms.pojo.User;
import cn.smbms.utils.MyBatisUtil;

public class demo {

	Logger logger = Logger.getLogger(demo.class);

	@Test
	public void testFindAll() {
		SqlSession session = MyBatisUtil.createSqlSession();
		// @1 Map<String, String> map=new HashMap<String, String>();
		// map.put("name", "赵");
		// map.put("role","2");
		/* 2 */User user = new User();
		user.setUserName("赵");
		user.setUserRole(2);

		/*
		 * @兴趣 System.out.println("请输入查找内容："); Scanner in=new
		 * Scanner(System.in); String name=in.next();
		 */
		List<User> list = session.getMapper(UserMapper.class).findAll(user);
		/*
		 * if(list.size()==0){ System.out.println("没有您要查找的内容"); testFindAll();
		 * 
		 * }else{
		 */
		logger.info("编号\t姓名");
		for (User u : list) {
			logger.info(u.getId() + "\t" + u.getUserName());
		}
		MyBatisUtil.closeSqlSession(session);
		/* } */

	}

	
	@Test
	public void testselectwithrole() {
		SqlSession session = MyBatisUtil.createSqlSession();
		List<User> list = session.getMapper(UserMapper.class).selectwithrole();
		logger.info("编号\t姓名\t角色");
		for (User u : list) {
			logger.info(u.getId() + "\t" + u.getUserName() + "\t"
					+ u.getRole().getRoleName());
		}
		MyBatisUtil.closeSqlSession(session);
	}

	
	@Test
	// Role添加信息
	public void testAddRole() {
		SqlSession session = MyBatisUtil.createSqlSession();
		Role role = new Role();
		String time = "2014-3-17";
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = dateFormat.parse(time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		role.setId(0);
		role.setRoleCode("SMBMS_SKILLED");
		role.setRoleName("技术工");
		role.setCreatedBy(1);
		role.setCreationDate(date);
		int re = session.getMapper(UserMapper.class).AddRole(role);
		if (re != 0) {
			System.out.println("添加成功!");

		} else {
			System.out.println("添加失败！");
		}
		session.commit();
		MyBatisUtil.closeSqlSession(session);
	}

	
	@Test
	// Role修改信息
	public void testUpdateRole() {
		SqlSession session = MyBatisUtil.createSqlSession();
		Role role = new Role();
		String time = "2015-3-17";
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = dateFormat.parse(time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		role.setId(5);
		role.setRoleCode("SB_DSB");
		role.setRoleName("都市报");
		role.setCreatedBy(1);
		role.setCreationDate(date);
		int re = session.getMapper(UserMapper.class).UpdateRole(role);
		if (re != 0) {
			System.out.println("修改成功!");
		} else {
			System.out.println("修改失败！");
		}
		session.commit();
		MyBatisUtil.closeSqlSession(session);

	}

	@Test
	// Role删除信息
	public void testDeleteRole() {
		SqlSession session = MyBatisUtil.createSqlSession();
		int id = 5;
		int user = session.getMapper(UserMapper.class).DelRoleForUser(id);
		if (user == 0) {
			System.out.println("用户表相关信息删除成功！");
		} else {
			System.out.println("删除失败！");
		}
		int Role = session.getMapper(UserMapper.class).DelRole(id);
		if (Role != 0) {
			System.out.println("角色删除成功！");
		} else {
			System.out.println("角色删除失败！");
		}
		session.commit();
		MyBatisUtil.closeSqlSession(session);

	}
	
	
	@Test//模糊查询Role
	public void testRolefindAll(){
		SqlSession session=MyBatisUtil.createSqlSession();
		
		List<Role> list=session.getMapper(UserMapper.class).RolefindAll("管");
		
		logger.info("角色id\t角色代号\t角色名");
		
		for (Role role : list) {
			System.out.println(role.getId()+"\t"+role.getRoleCode()+"\t"+role.getRoleName());
		}
		MyBatisUtil.closeSqlSession(session);
		
		
	}
	
}
