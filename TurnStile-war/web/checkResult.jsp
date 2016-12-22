<%@page contentType="text/html" pageEncoding="windows-1251"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1251">
        <title>TurnStile Application</title>
    </head>
    <body>
       
        <%@page import="javax.naming.*, turnstile.*" %>
        <%@ page errorPage="error.jsp"%>
        <%!
            TurnStileSessionBeanRemote ejbRef;
        %>
        <%
            InitialContext ic = new InitialContext();
            ejbRef
                    = (TurnStileSessionBeanRemote) ic.lookup("turnstile.TurnStileSessionBeanRemote");
        %>
        <h1>Decision: </h1>
        <p> <%=ejbRef.checkPerson(Integer.valueOf(request.getParameter("id")).intValue())%></p>
        <p><a href="index.jsp">Return</a></p>
    </body>
</html>
