<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Form Data</title>
</head>
<body>
<p>First name: ${param.firstName}</p>
<p>Last name: <%= request.getParameter("lastName") %>
</p>
<p>Country: ${param.country}</p>
<p><%= request.getLocale()%></p>
<p><%= request.getHeader("User-Agent")%></p>
</body>
</html>