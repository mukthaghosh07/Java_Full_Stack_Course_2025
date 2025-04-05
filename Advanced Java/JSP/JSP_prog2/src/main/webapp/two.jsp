<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink">

<jsp:useBean id= "one"   class= "First.JavaBean" >
  <jsp:setProperty name="one" property="id" param="val1"/>
  <jsp:setProperty name="one" property="name" param="val2"/>
  <jsp:setProperty name="one" property="salary" param="val3"/>

</jsp:useBean>

Your account id is:
<jsp:getProperty name="one" property="id"/> 
<br>
Account holder name is:
<jsp:getProperty name="one" property="name"/> 
<br>
Your Salary is:
<jsp:getProperty name="one" property="salary"/> 

</body>
</html>