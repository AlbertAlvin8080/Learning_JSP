<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Form Data</title>
    <%
        String favLanguage = "C++";
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("app.pgLanguage")) {
                    favLanguage = cookie.getValue();
                    break;
                }
            }
        }
    %>
</head>
<body>
<h2>Articles about <%=favLanguage%>
</h2>
<ul>
    <li>BLOB BLOB BLOB</li>
    <li>BLOB BLOB BLOB</li>
</ul>
<br/>
<h2>Jobs about <%=favLanguage%>
</h2>
<ul>
    <li>BLOB BLOB BLOB</li>
    <li>BLOB BLOB BLOB</li>
</ul>
<br/>
<a href="cookies-form-servlet">Change favorite language</a>
</body>
</html>