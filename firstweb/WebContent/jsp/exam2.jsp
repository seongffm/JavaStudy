<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	for(int i=1;i<=5;i++){ //프로그래밍 코드
		
%>
<h<%=i %>>아름다운한글</h<%=i %>> <!--페이지에 보여줄 응답코드-->
<%
	} //스크립트 이렇게 나눠서 여러개 쓸 수 있다
%>
<%-- JSP 코드 주석 : 자바로 코드로 변환 안된다 --%>
</body>
</html>

