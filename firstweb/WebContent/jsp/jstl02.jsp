<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
<%
request.setAttribute("a", 10);
%>
 --%>
<c:set var="a" scope="request" value="10" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${a==0 }">n과 0은 같습니다</c:if> <br>
<c:if test="${a==10 }">n은 10은 같습니다</c:if><br>
<c:if test="true">조건문 실행</c:if><br>
</body>
</html>