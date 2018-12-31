<%--
  Created by IntelliJ IDEA.
  User: RenXingYu
  Date: 2018/12/31
  Time: 8:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
    <s:debug></s:debug>
    <!-- 方式1的获取：利用Action在值栈中的特性 -->
    <%--<s:property value="product.name"/>
    <s:property value="product.price"/>--%>

    <!-- 方式2的获取：调用ValueStack本身的方法存入 -->
    <s:property value="name"/>
    <s:property value="price"/>
    <s:property value="xyz"/>
    <!-- 获取Context中的数据要加#号 -->
    <s:property value="#request.reqName"/>
</head>
<body>

</body>
</html>
