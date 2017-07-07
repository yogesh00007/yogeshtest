<%-- 
    Document   : home
    Created on : May 8, 2017, 10:11:13 AM
    Author     : Yogesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Pageyyyyyyyyyyyyyyyyyyyyyyy</title>
    </head>
    <body>
        <h1>Wel come......<%=session.getAttribute("name")%></h1>
        <a href="regitration.jsp">Regitration</a>
        <a href="login.jsp">Login </a>
        <a href="show.jsp">show data</a>
        <a href="login.jsp">Logout</a>
        <a href="edit.jsp">edit</a>
        
    </body>
</html>
