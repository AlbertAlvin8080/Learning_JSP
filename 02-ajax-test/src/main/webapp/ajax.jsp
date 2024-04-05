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

<button type="button" id="ajax-btn">Do Ajax</button>

<script>
    "use strict";
    const btn = document.querySelector("#ajax-btn");
    btn.addEventListener("click", () => ajaxFetch('${pageContext.request.contextPath}/ajax-servlet'));

    async function ajaxFetch(endpoint) {
        // console.log(endpoint);
        const response = await fetch(endpoint, {method: "POST"});
        const data = JSON.stringify(await response.json());
        // console.log(data);
        document.querySelector("#ajax-div").innerText = data;
    }
</script>
</body>
</html>