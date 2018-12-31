<%--
  Created by IntelliJ IDEA.
  User: RenXingYu
  Date: 2018/12/30
  Time: 21:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>\
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Ognl在Struct中使用</h1>
    <h1>调用对象的方法</h1>
    <s:property value="'struts'.length()"/>
    <h1>调用对象的静态方法</h1>
    <!-- 静态方法访问在struts2中是关闭的 -->
    <s:property value="@java.lang.Math@random()"/>
</body>
</html>
