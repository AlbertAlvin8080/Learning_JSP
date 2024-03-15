<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/default/1_0/css/styles.css"
          type="text/css"/>
</head>
<body>
<form action="loginController" method="post">
    <div>
        <label for="userName">User Name</label>
        <input type="text" name="userName" id="userName"/>
    </div>
    <div>
        <label for="password">Password</label>
        <input type="password" name="password" id="password"/>
    </div>
    <div>
        <button type="submit">Login</button>
        <button type="button" id="btn-register"
                onclick="window.location.href='register.jsp'">Register
        </button>
    </div>
</form>

<%@ include file="WEB-INF/templates/messages-template.jsp" %>
</body>
</html>