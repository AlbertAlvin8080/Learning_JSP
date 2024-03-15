<%@ page import="org.example.login.enums.MessageType" %>
<div id="messageContainer" class="message"></div>
<script src="${pageContext.request.contextPath}/resources/default/1_0/js/script.js"></script>
<%
    final Object message = request.getAttribute("message");
    final Object type = request.getAttribute("message-type");
    if (message != null) {
        out.println("<script>showMessage('%s', '%s')</script>"
                .formatted(message, type != null ? type : MessageType.INFO));
    }
%>