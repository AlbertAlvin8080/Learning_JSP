<%--
  Created by IntelliJ IDEA.
  User: Albert
  Date: 2/18/2024
  Time: 9:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@ include file="../templates/header.html" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:set value="300px" var="width"/>
<main>
    ${width}
    <ul style="margin: auto; width: ${width}; border: 1px solid black;">
        <li>BLOB BLOB BLOB</li>
        <li>BLOB BLOB BLOB</li>
        <li>BLOB BLOB BLOB</li>
    </ul>
    <form action="include-directive-servlet" method="get"
          style="margin: auto; width: ${width}; border: 1px solid black;">
        <div>
            <input type="checkbox" name="language" id="Java" value="Java"><label for="Java">Java</label>
        </div>
        <div>
            <input type="checkbox" name="language" id="C++" value="C++"><label for="C++">C++</label>
        </div>
        <input type="checkbox" name="language" id="C" value="C"><label for="C">C</label>
        <div>
            <input type="checkbox" name="language" id="Python" value="Python"><label for="Python">Python</label>
        </div>
        <div>
            <button type="submit">Submit</button>
        </div>
    </form>
</main>
<%@ include file="../templates/footer.jsp" %>
</body>
</html>
