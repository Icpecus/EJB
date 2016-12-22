<%@page contentType="text/html" pageEncoding="windows-1251"%>
<!DOCTYPE HTML>
<%@ page isErrorPage="true" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1251">
        <title>TurnStile Application</title>
    </head>
    <body>
        <h1>There was an error</h1>
        <p style="color: red">${pageContext.errorData.throwable.message}</p>
        <p><a href="index.jsp">Return</a></p>
    </body>
</html>
