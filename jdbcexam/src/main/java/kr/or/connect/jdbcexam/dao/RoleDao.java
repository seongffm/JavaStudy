package kr.or.connect.jdbcexam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

import kr.or.connect.jdbcexam.dto.Role;

public class RoleDao {
	private static String dburl ="jdbc:mysql://localhost:3306/connetdb";
	private static String dbuser ="connectuser";
	private static String dbpassword ="smhrd1234!";
	
	public Role getRole(Integer roleId) {
		Role role=null;
		Connection conn=null;
		PreparedStatement ps =null;
		ResultSet rs =null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dburl,dbuser,dbpassword);
			String sql = "SELECT description,role_id FROM role WHERE role_id=?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, roleId);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				String description = rs.getString(1);
				int id = rs.getInt("role_id");
				role = new Role(id,description);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			finally {
				if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
			   }
			
		if(ps!=null) {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		   }
		
	if(conn!=null) {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	   }
	}
	
		return role;
	}
	
	public int addRole(Role role) {
		int insertCount=0;
		Connection conn=null;
		PreparedStatement ps =null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dburl,dbuser,dbpassword);
			String sql = "INSERT INTO role (role_id, description) VALUES (?,?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, role.getRoleId());
			ps.setString(2, role.getDescription());
			
			insertCount = ps.executeUpdate();
		}catch (Exception ex) {
			ex.printStackTrace();
		}finally {
			
		
			
		if(ps!=null) {
			try {
				ps.close();
			} catch (Exception ex) {
				
				ex.printStackTrace();
			}
			
		   }
		
	if(conn!=null) {
		try {
			conn.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	   }
	}
	
	
		return insertCount;
	}
	
	public List<Role> getRoles(){
		List<Role> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String sql = "SELECT description, role_id FROM role order by role_id desc";
		
		try (Connection conn = DriverManager.getConnection(dburl,dbuser,dbpassword);
				PreparedStatement ps = conn.prepareStatement(sql)
						
				){ 
			try(ResultSet rs = ps.executeQuery()) {
				while(rs.next()) {
					String description = rs.getString(1);
					int id = rs.getInt("role_id");
					Role role = new Role(id,description);
					list.add(role);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			}catch (Exception ex) {
				ex.printStackTrace();
			}
			return list;
		}

		 //끝

	public int updateRole(Role role) {
		int insertCount=0;
		Connection conn=null;
		PreparedStatement ps =null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dburl,dbuser,dbpassword);
			String sql = "UPDATE role SET description=? WHERE role_id=?";
			ps = conn.prepareStatement(sql);
			ps.setInt(2, role.getRoleId());
			ps.setString(1, role.getDescription());
			
			insertCount = ps.executeUpdate();
		}catch (Exception ex) {
			ex.printStackTrace();
		}finally {
			
		
			
		if(ps!=null) {
			try {
				ps.close();
			} catch (Exception ex) {
				
				ex.printStackTrace();
			}
			
		   }
		
	if(conn!=null) {
		try {
			conn.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	   }
	}
	
	
		return insertCount;
	}
}

