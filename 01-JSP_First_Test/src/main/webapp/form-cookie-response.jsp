<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Form Data</title>
</head>
<body>
<%! String language = ""; %>
<%
    String tempLanguage = request.getParameter("pgLanguage");
    if (tempLanguage != null) {
        response.addCookie(new Cookie("app.pgLanguage", tempLanguage));
        language = tempLanguage;
    } else {
        Cookie[] cookies = request.getCookies();
        if (cookies == null) return;
        for (Cookie tempCookie : cookies) {
            if (tempCookie.getName().equals("app.pgLanguage")) {
                language = tempCookie.getValue();
                break;
            }
        }
    }
%>
<p>Programming Language: <%=language%>
</p>
</body>
</html>