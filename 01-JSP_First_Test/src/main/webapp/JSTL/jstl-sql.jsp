<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="sql" uri="jakarta.tags.sql" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<sql:setDataSource var="ds" driver="com.mysql.cj.jdbc.Driver"
                   url="jdbc:mysql://localhost:3306/db_hibernate" user="albert" password="1234"/>
<sql:query var="rs" dataSource="${ds}">select * from Author</sql:query>

<%=application.getInitParameter("file.path")%>
${initParam.get("file.path")}

<c:forEach items="${rs.rows}" var="row">
    <div>
        <c:out value="${row.id}"/>
        <c:out value=" : "/>
        <c:out value="${row.name}"/>
    </div>
</c:forEach>
</body>
</html>
