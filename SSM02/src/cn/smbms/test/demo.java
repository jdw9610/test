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
		// map.put("name", "��");
		// map.put("role","2");
		/* 2 */User user = new User();
		user.setUserName("��");
		user.setUserRole(2);

		/*
		 * @��Ȥ System.out.println("������������ݣ�"); Scanner in=new
		 * Scanner(System.in); String name=in.next();
		 */
		List<User> list = session.getMapper(UserMapper.class).findAll(user);
		/*
		 * if(list.size()==0){ System.out.println("û����Ҫ���ҵ�����"); testFindAll();
		 * 
		 * }else{
		 */
		logger.info("���\t����");
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
		logger.info("���\t����\t��ɫ");
		for (User u : list) {
			logger.info(u.getId() + "\t" + u.getUserName() + "\t"
					+ u.getRole().getRoleName());
		}
		MyBatisUtil.closeSqlSession(session);
	}

	
	@Test
	// Role�����Ϣ
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
		role.setRoleName("������");
		role.setCreatedBy(1);
		role.setCreationDate(date);
		int re = session.getMapper(UserMapper.class).AddRole(role);
		if (re != 0) {
			System.out.println("��ӳɹ�!");

		} else {
			System.out.println("���ʧ�ܣ�");
		}
		session.commit();
		MyBatisUtil.closeSqlSession(session);
	}

	
	@Test
	// Role�޸���Ϣ
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
		role.setRoleName("���б�");
		role.setCreatedBy(1);
		role.setCreationDate(date);
		int re = session.getMapper(UserMapper.class).UpdateRole(role);
		if (re != 0) {
			System.out.println("�޸ĳɹ�!");
		} else {
			System.out.println("�޸�ʧ�ܣ�");
		}
		session.commit();
		MyBatisUtil.closeSqlSession(session);

	}

	@Test
	// Roleɾ����Ϣ
	public void testDeleteRole() {
		SqlSession session = MyBatisUtil.createSqlSession();
		int id = 5;
		int user = session.getMapper(UserMapper.class).DelRoleForUser(id);
		if (user == 0) {
			System.out.println("�û��������Ϣɾ���ɹ���");
		} else {
			System.out.println("ɾ��ʧ�ܣ�");
		}
		int Role = session.getMapper(UserMapper.class).DelRole(id);
		if (Role != 0) {
			System.out.println("��ɫɾ���ɹ���");
		} else {
			System.out.println("��ɫɾ��ʧ�ܣ�");
		}
		session.commit();
		MyBatisUtil.closeSqlSession(session);

	}
	
	
	@Test//ģ����ѯRole
	public void testRolefindAll(){
		SqlSession session=MyBatisUtil.createSqlSession();
		
		List<Role> list=session.getMapper(UserMapper.class).RolefindAll("��");
		
		logger.info("��ɫid\t��ɫ����\t��ɫ��");
		
		for (Role role : list) {
			System.out.println(role.getId()+"\t"+role.getRoleCode()+"\t"+role.getRoleName());
		}
		MyBatisUtil.closeSqlSession(session);
		
		
	}
	
}
