<%--
  Created by IntelliJ IDEA.
  User: RenXingYu
  Date: 2018/12/30
  Time: 17:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Struts2数据封装</h1>
    <s:fielderror/>
    <h1>属性驱动--提供set方法的方式</h1>
    <form action="${pageContext.request.contextPath}/userAction1.action" method="post">
        <table>
            <tr>
                <td>用户名：</td>
                <td><input type="text" name="username"></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td>年龄：</td>
                <td><input type="number" name="age"></td>
            </tr>
            <tr>
                <td>生日：</td>
                <td><input type="date" name="birthday"></td>
            </tr>
            <tr>
                <td>工资：</td>
                <td><input type="number" name="salary"></td>
            </tr>
            <tr>
                <td><input type="submit" value="提交"></td>
            </tr>
        </table>
    </form>


    <h1>属性驱动--在页面中提供表达式方式</h1>
    <form action="${pageContext.request.contextPath}/userAction2.action" method="post">
        <table>
            <tr>
                <td>用户名：</td>
                <td><input type="text" name="user.username"></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input type="password" name="user.password"></td>
            </tr>
            <tr>
                <td>年龄：</td>
                <td><input type="number" name="user.age"></td>
            </tr>
            <tr>
                <td>生日：</td>
                <td><input type="date" name="user.birthday"></td>
            </tr>
            <tr>
                <td>工资：</td>
                <td><input type="number" name="user.salary"></td>
            </tr>
            <tr>
                <td><input type="submit" value="提交"></td>
            </tr>
        </table>
    </form>

    <h1>模型驱动</h1>
    <form action="${pageContext.request.contextPath}/userAction3.action" method="post">
        <table>
            <tr>
                <td>用户名：</td>
                <td><input type="text" name="username"></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td>年龄：</td>
                <td><input type="number" name="age"></td>
            </tr>
            <tr>
                <td>生日：</td>
                <td><input type="date" name="birthday"></td>
            </tr>
            <tr>
                <td>工资：</td>
                <td><input type="number" name="salary"></td>
            </tr>
            <tr>
                <td><input type="submit" value="提交"></td>
            </tr>
        </table>
    </form>
</body>
</html>
