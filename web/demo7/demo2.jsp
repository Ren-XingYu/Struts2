<%--
  Created by IntelliJ IDEA.
  User: RenXingYu
  Date: 2018/12/31
  Time: 9:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Ognl特殊字符#的用法</h1>
    <h3>获取域对象中的值</h3>
    <%
        request.setAttribute("name","xyz");
    %>
    <s:property value="#request.name"/>
    <h3>构建List集合</h3>
    <s:iterator var="i" value="{'a','b','c'}">
        <s:property value="i"/>---<s:property value="#i"/>
    </s:iterator>
    <h3>构建Map集合</h3>
    <s:iterator var="entry" value="#{'aa':'11','bb':'22','cc':'33'}">
        <s:property value="key"/>---<s:property value="value"/>
        <s:property value="#entry.key"/>---<s:property value="#entry.value"/>
    </s:iterator>
    <s:radio list="{'男','女'}" name="sex1" label="性别" /><br>
    <s:radio list="#{'1':'男','2':'女'}" name="sex2" label="性别" />

    <h1>Ognl特殊字符%的用法</h1>
    <h3>强制识别为Ognl表达式</h3>
    姓名:<s:textfield name="name" value="%{#request.name}"/>
    <h3>强制不解析Ognl表达式</h3>
    <s:property value="%{'#request.name'}"/>

    <h1>Ognl特殊字符$的用法(配置文件中使用),当作变量</h1>
    <h3>在属性文件中使用()</h3>
    <%--例：${#session.user.username}--%>
    <h3>在xml文件中使用</h3>
    <%--例：${文件名}--%>
</body>
</html>
