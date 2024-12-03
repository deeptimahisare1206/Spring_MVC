<%@page import="com.mypackage.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">



body {
height:100vh;
	display: grid;
	place-items:center;
}

h1{
display: flex;
box-shadow: 0rem 0rem 1rem grey;
padding: 3rem;
}
</style>
</head>
<body>

 <%
/* 
//for Model class 
//and Model and View class

String roll =(String)request.getAttribute("roll");
 String name =(String)request.getAttribute("name");
 String per =(String)request.getAttribute("per"); */
 
 Student stu = (Student)request.getAttribute("student");
 
 
%>
<h1>
   				<%-- Roll No:  <%=roll %><br>
   				Name:  <%=name %><br>
   				Percentage:  <%=per %><br> --%>
   				
   				
   				Roll No:  <%=stu.getRoll() %><br>
   				Name:  <%= stu.getName()%><br>
   				Percentage:  <%=stu.getPercent() %><br>

</h1>




</body>
</html>