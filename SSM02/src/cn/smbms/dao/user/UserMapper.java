package cn.smbms.dao.user;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.smbms.pojo.Role;
import cn.smbms.pojo.User;

public interface UserMapper {
	/*List<User> findAll(@Param("name")String name,
			@Param("role")int role
			);*/
//	List<User> findAll(Map<String, String> map);
	List<User> findAll(User user);
	
	List<User> selectwithrole();//�����ѯ
	
	//role
	int AddRole(Role role);//����
	
	int UpdateRole(Role role);//�޸�
	
	int DelRoleForUser(int id);//ɾ���й��û�
	
	int DelRole(int id);//ɾ����ɫ
	
	List<Role> RolefindAll(String name);
	
}
