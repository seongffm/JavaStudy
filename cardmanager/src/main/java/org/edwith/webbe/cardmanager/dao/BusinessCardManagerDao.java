package org.edwith.webbe.cardmanager.dao;

import org.edwith.webbe.cardmanager.dto.BusinessCard;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BusinessCardManagerDao {
	private static String dburl ="jdbc:mysql://localhost:3306/connetdb";
	private static String dbuser ="connectuser";
	private static String dbpassword ="smhrd1234!";
	PreparedStatement ps = null;
    public List<BusinessCard> searchBusinessCard(String keyword){
    	List<BusinessCard> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
//		System.out.println(keyword);
		String sql = "select name,phone,companyName from member where name = ?";
		
		try (
				Connection conn = DriverManager.getConnection(dburl,dbuser,dbpassword);
				PreparedStatement ps = conn.prepareStatement(sql)
				
						
				){
			ps.setString(1, keyword);
			try(ResultSet rs = ps.executeQuery()) {
				while(rs.next()) {
					String name = rs.getString(1);
					String phone = rs.getString(2);
					String companyname = rs.getString(3);
					BusinessCard business = new BusinessCard(name,phone,companyname);
					list.add(business);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			}catch (Exception ex) {
				ex.printStackTrace();
			}
			return list;
		}
    public int addBusinessCard(BusinessCard businessCard){
    	int insertCount=0;
		Connection conn=null;
		PreparedStatement ps =null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dburl,dbuser,dbpassword);
			String sql = "INSERT INTO member (name,phone,companyName) VALUES (?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, businessCard.getName());
			ps.setString(2, businessCard.getPhone());
			ps.setString(3, businessCard.getCompanyName());
			
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
