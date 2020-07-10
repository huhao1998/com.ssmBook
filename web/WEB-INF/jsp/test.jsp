<%--
  Created by IntelliJ IDEA.
  User: Yokyi
  Date: 2020/7/10
  Time: 0:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*"%>
<%@ page import="java.text.*"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% String s;
    s = (String)request.getParameter("searchById");
    System.out.println(s);
%>
</body>
</html>
