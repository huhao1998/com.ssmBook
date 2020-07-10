<%--
  Created by IntelliJ IDEA.
  User: Wangyh
  Date: 2020/7/9
  Time: 21:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import = "java.util.*" %>
<%@ page import="java.text.*"%>
<% String s;
    s = (String)request.getParameter("searchById");
    System.out.println(s);
%>
<p>${s}</p>
