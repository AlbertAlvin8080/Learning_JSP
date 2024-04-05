<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "AJAX Test" %>
</h1>

<div id="ajax-div"></div>

<input type="password" name="password" id="password"/>

<script>
    "use strict";
    const div = document.querySelector("#ajax-div");
    const input = document.querySelector("#password");
    input.addEventListener("blur", () => checkPassword('${pageContext.request.contextPath}/ajax2-servlet'));

    async function checkPassword(endpoint) {
        let response = await fetch(endpoint, {
            method: "POST",
            headers: {"Content-Type": "application/x-www-form-urlencoded"},
            body: "password=" + input.value,
        });

        let obj = await response.json();
        // console.log(obj);
        
        if (obj["check"] === "true") {
            input.style.borderColor = "blue";
            div.innerText = "Correct password";
        } else {
            input.style.borderColor = "crimson";
            div.innerText = "Wrong password";
        }
    }
</script>
</body>
</html>