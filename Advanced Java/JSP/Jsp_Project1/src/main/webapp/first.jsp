<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP File</title>
</head>
<body bgcolor="green">
<%! int val1; %>
<%  String name=request.getParameter("abc"); %>
Hello, <%= name %> 

</body>
</html>