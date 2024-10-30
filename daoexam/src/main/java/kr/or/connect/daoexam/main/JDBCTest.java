package kr.or.connect.daoexam.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.or.connect.daoexam.config.ApplicationConfig;
import kr.or.connect.daoexam.dao.RoleDao;
import kr.or.connect.daoexam.dto.Role;

public class JDBCTest {
	public static void main(String[]args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		RoleDao roleDao = ac.getBean(RoleDao.class);
		Role role = new Role();
		role.setRole_Id(201);
		role.setDescription("CEO");
		int insertcount = roleDao.insert(role);
		System.out.println(insertcount+"건 입력하였습니다.");
		Role resultRole1 =roleDao.selectById(201);
		System.out.println(resultRole1);
		role.setDescription("Programmer");
		int updatecount = roleDao.update(role);
		System.out.println(updatecount+"건 수정하였습니다.");
		Role resultRole2 =roleDao.selectById(201);
		System.out.println(resultRole2);
		int deletecount = roleDao.deleteById(201);
		System.out.println(deletecount+"건 삭제 했습니다.");
		Role resultRole3 =roleDao.selectById(201);
		System.out.println(resultRole3);
		
	}
}
