<%--
  Created by IntelliJ IDEA.
  User: RenXingYu
  Date: 2018/12/30
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Servlet访问Servlet API的范式</h1>
    <h3>完全解耦和的方式</h3>
    <form action="${pageContext.request.contextPath}/requestDemo1.action" method="post">
        <table>
            <tr>
                <td>姓名:</td>
                <td><input type="text" name="username"></td>
            </tr>
            <tr>
                <td>密码:</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td><input type="submit" value="提交"></td>
            </tr>
        </table>
    </form>

    <h3>使用Servlet的API的原生方式</h3>
    <form action="${pageContext.request.contextPath}/requestDemo2.action" method="post">
        <table>
            <tr>
                <td>姓名:</td>
                <td><input type="text" name="username"></td>
            </tr>
            <tr>
                <td>密码:</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td><input type="submit" value="提交"></td>
            </tr>
        </table>
    </form>

    <h3>接口注入的方式</h3>
    <form action="${pageContext.request.contextPath}/requestDemo3.action" method="post">
        <table>
            <tr>
                <td>姓名:</td>
                <td><input type="text" name="username"></td>
            </tr>
            <tr>
                <td>密码:</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td><input type="submit" value="提交"></td>
            </tr>
        </table>
    </form>
</body>
</html>
