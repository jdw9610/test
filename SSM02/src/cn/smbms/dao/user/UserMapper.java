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
	
	List<User> selectwithrole();//联表查询
	
	//role
	int AddRole(Role role);//新增
	
	int UpdateRole(Role role);//修改
	
	int DelRoleForUser(int id);//删除有关用户
	
	int DelRole(int id);//删除角色
	
	List<Role> RolefindAll(String name);
	
}
