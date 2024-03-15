<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h1><%= "Hello World!" %></h1>
    <p><% for (int i = 0; i < 5; ++i) {
        out.println("ola " + (i + 1) + "<br/>");
    }%></p>

    <%! String makeUpperCase(String string) {
        return string.toUpperCase();
    } %>
    <p><%= makeUpperCase("teste uppercase") %></p>

    <br/>
    <a href="hello-servlet">Hello Servlet</a>
</body>
</html>