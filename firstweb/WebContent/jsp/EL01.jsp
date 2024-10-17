<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
pageContext.setAttribute("p1","page scope value");
request.setAttribute("r1","request scope value");
session.setAttribute("s1","session scope value");
application.setAttribute("a1","application scope value");

%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>pageContext.getAttribute : <%=pageContext.getAttribute("p1") %></h1>
	<br/>
	
	pageContext.getAttribute : ${pageScope.p1}<br/>
	request.getAttribute : ${requestScope.r1}<br/>
	session.getAttribute : ${sessionScope.s1}<br/>
	application.getAttribute : ${applicationScope.a1}<br/>
	
	application.getAttribute : ${a1}
</body>
</html>

