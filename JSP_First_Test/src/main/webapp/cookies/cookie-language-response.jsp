<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Form Data</title>
</head>
<%
    String pgLanguage = request.getParameter("pgLanguage");
    if (pgLanguage != null) {
        Cookie cookie = new Cookie("app.pgLanguage", pgLanguage);
//        cookie.setMaxAge(60*60*24*365);
        response.addCookie(cookie);
    }
%>
<body>
<p>Favorite language: <%=pgLanguage%>
</p>
<a href="cookies-home-servlet">Home</a>
</body>
</html>