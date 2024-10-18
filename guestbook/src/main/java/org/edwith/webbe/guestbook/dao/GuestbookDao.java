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
        try {
            conn = DBUtil.getConnection();
            String sql = "SELECT id,name,content,regdate  FROM guestbook"; 
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
            	Long id = rs.get
            }

            

    public void addGuestbook(Guestbook guestbook){
        // 코드를 작성하세요.
    }
}
