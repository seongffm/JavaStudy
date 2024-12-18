package kr.or.connect.daoexam.dao;

public class RoleDaoSqls {
	public static final String SELECT_ALL = "SELECT role_id, description FROM role order by role_Id";
	public static final String UPDATE = "UPDATE role SET description=:description WHERE ROLE_ID=:role_Id";
	public static final String SELECT_BY_ROLE_ID = "SELECT role_id, description FROM role where role_id = :role_Id";
	public static final String DELETE_BY_ROLE_ID = "DELETE FROM role WHERE role_id = :role_Id";
}
