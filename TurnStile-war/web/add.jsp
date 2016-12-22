<%--   --%>

<%@page contentType="text/html" pageEncoding="windows-1251"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1251">
        <title>TurnStile Application</title>
    </head>
    <body>
        <h1>Add new person to the server</h1>
        <form action="doadd.jsp" method="POST">
            <p>First Name: <input type="text" name="firstName" value="" /></p>
            <p>Last Name: <input type="text" name="lastName" value="" /></p>
            <p>Here: <input type="text" name="isHere" value="" /></p>
            <input type="submit" value="Submit" />
            <p><a href="index.jsp">Return</a></p>
        </form>
    </body>
</html>
