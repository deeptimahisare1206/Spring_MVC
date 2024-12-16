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
List<Student>l=(List<Student>)request.getAttribute("studentss");

for (Student student : l) {
%>
<h1>
<pre>
Roll: <%=student.getRoll() %>   Name: <%=student.getName() %>   Percent: <%=student.getPercent() %>     <a href="delete?id=<%=student.getRoll()%>">DELETE</a>      <a href="update?id=<%=student.getRoll()%>">UPDATE</a>
</pre>

<%} %>
</h1>

<a href="info">Insert</a>
</body>
</html>