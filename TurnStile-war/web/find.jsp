<%@page contentType="text/html" pageEncoding="windows-1251"%>
<!DOCTYPE HTML>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1251">
        <title>TurnStile Application</title>
    </head>
    <body>
        <h1>Find where is person</h1>
        <form action="findResult.jsp" method="POST">
            <p>First Name: <input type="text" name="firstName" value="" /></p>
            <p>Last Name: <input type="text" name="lastName" value="" /></p>
            <input type="submit" value="Search" />
        </form>
    </body>
</html>
