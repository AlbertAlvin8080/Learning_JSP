<%--
  Created by IntelliJ IDEA.
  User: Albert
  Date: 2/18/2024
  Time: 9:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String[] languages = request.getParameterValues("language");
        for (String language : languages) {
            out.println(language);
        }
    %>
</body>
</html>
