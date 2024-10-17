<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored = "true" %> <%--EL문법 무시하고 특수 문자 그대로 출력 --%>
<!DOCTYPE html>
<% 
request.setAttribute("k",10);
request.setAttribute("m",true);

%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
k : ${k}<br>
k+5 : ${k+5}<br>
k-5 : ${k-5}<br>
k*5 : ${k*5}<br>
k/5 : ${k div 5}<br>

k : ${k}<br>
m : ${m}<br>

k > 5 : ${ k > 5 } <br>
k < 5 : ${ k < 5 } <br>
k <= 10 : ${ k <= 10} <br>
k >= 10 : ${ k >= 10 } <br>
m : ${ m } <br>
!m : ${ !m } <br>

</body>
</html>
