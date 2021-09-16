<%--
  @author: xkZhao
  @Create: 2021-09-15 16:37
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/register">
    <%--<input type="hidden" name="id" value="null">--%>
    姓名：<input type="text" name="name"><br>
    密码：<input type="password" name="password"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
