<%--
  Created by IntelliJ IDEA.
  User: Albert
  Date: 2/19/2024
  Time: 10:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
    <%
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // http 1.1
        response.setHeader("Pragma", "no-cache"); // http 1.0
        response.setHeader("Expires", "0"); // proxies
    %>
</head>
<body>
<h1>Welcome <%=session.getAttribute(application.getInitParameter("session.variable"))%>!</h1>
<br>
<a href="videos.jsp">Videos</a>
<br>
<br>
<form action="${pageContext.request.contextPath}/logoutServlet">
    <button type="submit">Logout</button>
</form>
</body>
</html>
