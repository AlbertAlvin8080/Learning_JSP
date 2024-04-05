<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Page 2</title>
</head>
<body>
    <jsp:include page="templates/header.html"/>

    <main>
        <p><%= request.getHeader("User-Agent") %></p>
        <p><%= request.getLocale() %></p>
    </main>

    <jsp:include page="templates/footer.jsp"/>
</body>
</html>