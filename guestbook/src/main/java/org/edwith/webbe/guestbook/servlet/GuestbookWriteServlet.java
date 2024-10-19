package org.edwith.webbe.guestbook.servlet;

import org.edwith.webbe.guestbook.dao.GuestbookDao;
import org.edwith.webbe.guestbook.dto.Guestbook;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/guestbooks/write")
public class GuestbookWriteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8"); // 요청 인코딩 설정
        response.setContentType("text/html; charset=UTF-8"); // 응답 인코딩 설정
    	String name = request.getParameter("name");
       String content = request.getParameter("content");
       
      Guestbook guestbook = new Guestbook(name, content);
      guestbook.setName(name);
      guestbook.setContent(content);
      
      GuestbookDao guestbookDao = new GuestbookDao();
      guestbookDao.addGuestbook(guestbook);
      
      response.sendRedirect("/guestbook/guestbooks");
    }

}
