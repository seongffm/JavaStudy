package kr.or.connect.jdbcexam;

import kr.or.connect.jdbcexam.dao.RoleDao;
import kr.or.connect.jdbcexam.dto.Role;

public class JDBCExam4 {
	
	public static void main(String[] args) {
	int roleId=500;
	String description = "update";
	
	Role role = new Role(roleId, description);
	RoleDao dao = new RoleDao();
	int insertCount = dao.updateRole(role);
	
	System.out.println(insertCount);
}
}