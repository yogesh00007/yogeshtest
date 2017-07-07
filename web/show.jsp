<%-- 
    Document   : show
    Created on : May 8, 2017, 10:15:32 AM
    Author     : Yogesh
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
Class.forName("com.mysql.jdbc.Driver");
Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ygamit?zeroDateTimeBehavior=convertToNull","root","");
Statement st=cn.createStatement();
ResultSet rs;

if(request.getParameter("action")!=null)
{
    String vid=request.getParameter("value");
    String d="delete from regi where id='"+vid+"'";
    st.executeUpdate(d);
    
}
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="f" method="post">
            
        </form>
        <h1>show data</h1>
        <a href="regitration.jsp">Regitration</a>
        <a href="login.jsp">Login </a>
        <a href="show.jsp">show data</a>
        <a href="login.jsp">Logout</a>
    </body>
</html>
<%
String q="select * from regi";
rs=st.executeQuery(q);
out.print("<table border='1'><tr><th>action</th><th>name</th><th>password</th><th>date</th><th>gender</th><th>city</th></tr>");
while(rs.next())
{
    out.print("<tr><td><a href='show.jsp?action=delete&value="+rs.getString(1)+"'>delete</a></td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td></tr>");
    
    

}
out.print("</table");


%>
%>
