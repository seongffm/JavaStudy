package org.edwith.webbe.guestbook.servlet;

import org.edwith.webbe.guestbook.dao.GuestbookDao;
import org.edwith.webbe.guestbook.dto.Guestbook;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/guestbooks")
public class GuestbookListServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8"); // 요청 인코딩 설정
        response.setContentType("text/html; charset=UTF-8"); // 응답 인코딩 설정
    	GuestbookDao guestbookDao = new GuestbookDao();
        List<Guestbook>guestbookList = guestbookDao.getGuestbooks();
        request.setAttribute("list", guestbookList);
    	RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/guestbook/guestbooks.jsp");
    	dispatcher.forward(request, response);
    }

}
