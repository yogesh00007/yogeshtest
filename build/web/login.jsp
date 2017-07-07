<%-- 
    Document   : login
    Created on : May 8, 2017, 8:44:26 AM
    Author     : Yogesh
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    Class.forName("com.mysql.jdbc.Driver");
    Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ygamit?zeroDateTimeBehavior=convertToNull","root","");
    Statement st=cn.createStatement();
    ResultSet rs;
    
    
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h1>user Login</h1>
        <a href="regitration.jsp">Regitration</a>
        <a href="login.jsp">Login </a>
        <a href="show.jsp">show data</a>
        <a href="login.jsp">Logout</a>
        <form name="frmlogin" method="post" action="">
            <table>
                <tr>
                    <td>Username:</td>
                    <td><input type="text" name="txtname" > </td>
                </tr>
                <tr>
                    <td>password:</td>
                    <td><input type="password" name="txtpassword" > </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" name="submit" value="Login" > </td>
                </tr>
            </table>
        </form>
    </center>
    </body>
</html>
<%
    String vname=request.getParameter("txtname");
    String vpassword=request.getParameter("txtpassword");
    
    if(request.getParameter("submit")!=null)
    {
    String q="select * from regi where name='"+vname+"' and password='"+vpassword+"'";
    rs=st.executeQuery(q);
    if(rs.next())
    {
        //out.print("login suceess");
        session.setAttribute("name", vname);
        response.sendRedirect("home.jsp");
    }
    }
%>
