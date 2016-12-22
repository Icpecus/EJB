<%@page contentType="text/html" pageEncoding="windows-1251"%>
<!DOCTYPE HTML>
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
            ejbRef = (TurnStileSessionBeanRemote) ic.lookup("turnstile.TurnStileSessionBeanRemote");
        %>
        <h1>Search Results:</h1>
        <p> <%=request.getParameter("firstName")%> <%=request.getParameter("lastName")%> is 
            <%=ejbRef.findPerson(request.getParameter("firstName"), request.getParameter("lastName"))%> !</p>
        <p><a href="index.jsp">Return</a></p>
    </body>
</html>