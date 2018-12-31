<%--
  Created by IntelliJ IDEA.
  User: RenXingYu
  Date: 2018/12/30
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>通过method的方式</h1>
    <a href="${pageContext.request.contextPath}/userFind.action">查询用户</a><br>
    <a href="${pageContext.request.contextPath}/userUpdate.action">修改用户</a><br>
    <a href="${pageContext.request.contextPath}/userDelete.action">删除用户</a><br>
    <a href="${pageContext.request.contextPath}/userSave.action">保存用户</a>

    <hr>
    <h1>通过通配符的方式</h1>
    <a href="${pageContext.request.contextPath}/product_find.action">查询商品</a><br>
    <a href="${pageContext.request.contextPath}/product_update.action">修改商品</a><br>
    <a href="${pageContext.request.contextPath}/product_delete.action">删除商品</a><br>
    <a href="${pageContext.request.contextPath}/product_save.action">保存商品</a>

    <hr>
    <h1>通过动态方法访问的方式</h1>
    <a href="${pageContext.request.contextPath}/customer!find.action">查询客户</a><br>
    <a href="${pageContext.request.contextPath}/customer!update.action">修改客户</a><br>
    <a href="${pageContext.request.contextPath}/customer!delete.action">删除客户</a><br>
    <a href="${pageContext.request.contextPath}/customer!save.action">保存客户</a>
</body>
</html>
