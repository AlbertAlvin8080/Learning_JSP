<%--
  Created by IntelliJ IDEA.
  User: Albert
  Date: 2/18/2024
  Time: 8:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="error.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%= 9 / 0 %>
<%-- note que ainda não é possível realizar o redirecionamento direto para uma página que não está diretamente
 na raiz do webapp --%>
<form action="error.jsp">
    <button type="submit">Submit</button>
</form>
</body>
</html>
