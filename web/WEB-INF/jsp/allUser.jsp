<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 10559
  Date: 2020/5/28
  Time: 9:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户展示页面</title>
</head>
<body>
<h1>
    用户展示页面<br/>
    <c:forEach var="user" items="${userList}">
        用户id：${user.id}<br/>用户名：${user.username}<br/>用户密码：${user.password}<br/>
    </c:forEach>
</h1>
</body>
</html>
