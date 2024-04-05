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
    <title>Videos</title>
    <%
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // http 1.1
        response.setHeader("Pragma", "no-cache"); // http 1.0
        response.setHeader("Expires", "0"); // proxies
    %>
</head>
<body>
<iframe width="560" height="315" src="https://www.youtube.com/embed/Hv6tA3Uw7x0?si=KKkxMKbwDotMtK_y"
        title="YouTube video player" frameborder="0"
        allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share"
        allowfullscreen></iframe>
<form action="${pageContext.request.contextPath}/logoutServlet">
    <button type="submit">Logout</button>
</form>
</body>
</html>
