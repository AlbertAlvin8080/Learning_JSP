<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/default/1_0/css/styles.css"
          type="text/css"/>
</head>
<body>

<form action="registerServlet" method="post">
    <div>
        <label for="userName">User Name</label>
        <input type="text" name="userName" id="userName"/>
    </div>
    <div>
        <label for="password">Password</label>
        <input type="password" name="password" id="password"/>
    </div>
    <div>
        <button type="submit">Register</button>
    </div>
</form>

<%@ include file="WEB-INF/templates/messages-template.jsp" %>
</body>
</html>
