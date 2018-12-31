<%--
  Created by IntelliJ IDEA.
  User: RenXingYu
  Date: 2018/12/30
  Time: 20:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Struts复杂数据类型的封装</h1>
    <h3>封装到list集合：批量插入数据</h3>
    <form action="${pageContext.request.contextPath}/productAction1.action" method="post">
        商品名称：<input type="text" name="products[0].name"><br>
        商品价格：<input type="text" name="products[0].price"><br>
        商品名称：<input type="text" name="products[1].name"><br>
        商品价格：<input type="text" name="products[1].price"><br>
        商品名称：<input type="text" name="products[2].name"><br>
        商品价格：<input type="text" name="products[2].price"><br>
        <input type="submit" value="提交">
    </form>
    <h3>封装到map集合：批量插入数据</h3>
    <form action="${pageContext.request.contextPath}/productAction2.action" method="post">
        商品名称：<input type="text" name="maps['one'].name"><br>
        商品价格：<input type="text" name="maps['one'].price"><br>
        商品名称：<input type="text" name="maps['two'].name"><br>
        商品价格：<input type="text" name="maps['two'].price"><br>
        商品名称：<input type="text" name="maps['three'].name"><br>
        商品价格：<input type="text" name="maps['three'].price"><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
