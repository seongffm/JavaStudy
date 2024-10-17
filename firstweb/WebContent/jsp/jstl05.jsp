<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="http://localhost:8080/firstweb/jsp/jstValue.jsp" var="urlValue" scope="request">
<c:param name="파라미터이름" value="파라미터값"/>
</c:import>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${urlValue}<br>
${param.age}
</body>
</html>