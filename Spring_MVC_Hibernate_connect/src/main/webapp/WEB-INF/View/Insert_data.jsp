<%@page import="com.mydao.StudentDao"%>
<%@page import="java.util.List"%>
<%@page import="com.mycompany.Student"%>
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

Student stu = (Student)request.getAttribute("student");
StudentDao sd =(StudentDao)request.getAttribute("stuDao"); 
List<Student>l=sd.selectAll(stu);

for (Student student : l) {
%>
<h1>
IS it done??

Roll: <%=student.getRoll() %>



<%} %>
</h1>
</body>
</html>