<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>后台管理</title>
<link rel="stylesheet" href="css/bootstrap.css"/> 
</head>
<body>

<%--稍等，我看看标签库的导入^^--%>

<%--		后台管理页面	--%>
<body>
<div class="container-fluid">

    <c:import url="header.jsp"></c:import>

    <br><br>

    <div class="alert alert-success" role="alert">${msg}</div>

</div>
</body>
</html>