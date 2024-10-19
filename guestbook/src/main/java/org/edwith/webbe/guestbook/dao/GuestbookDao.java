package org.edwith.webbe.guestbook.dao;

import org.edwith.webbe.guestbook.dto.Guestbook;
import org.edwith.webbe.guestbook.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GuestbookDao {
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public List<Guestbook> getGuestbooks(){
        List<Guestbook> list = new ArrayList<>();
        String sql = "SELECT id,name,content,regdate  FROM guestbook order by id desc"; 
        try {
            conn = DBUtil.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
        	
            while(rs.next()){
            	Long id = rs.getLong(1);
            	String name = rs.getString(2);
            	String content = rs.getString(3);
            	Date regdate = rs.getDate(4);
            	Guestbook guest = new Guestbook(id,name,content,regdate);
            	list.add(guest);
             	}
        	}catch(Exception e) {
            	e.printStackTrace();
        	}finally {
        		try {
        			if(rs!=null) {
        				rs.close();
        			}
        			if(ps!=null) {
        				ps.close();
        			}
        			if(conn!=null) {
        				conn.close();
        			}
        		}catch(Exception ex) {
        			ex.printStackTrace();
        		}
            }
        return list;
        
        }

            

    public int addGuestbook(Guestbook guestbook){
    	int insertCount=0;
    	String sql="INSERT INTO guestbook (name,content) VALUES(?,?)";
    try {
        conn = DBUtil.getConnection();
        ps = conn.prepareStatement(sql);
        ps.setString(1, guestbook.getName());
        ps.setString(2, guestbook.getContent());
        insertCount = ps.executeUpdate();
    }catch(Exception e) {
    	e.printStackTrace();
    }finally {
    	try {
    		if(ps!=null) {
    			ps.close();
    		}if(conn!=null) {
    			conn.close();
    		}
    	}catch(Exception ex) {
    		ex.printStackTrace();
    	}
    }
    	return insertCount;
    }
}
