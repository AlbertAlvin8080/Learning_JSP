<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${students}" var="student">
        <c:out value="${student}"/><br/>
    </c:forEach>
</body>
</html>
