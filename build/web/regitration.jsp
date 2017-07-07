<%-- 
    Document   : regitration
    Created on : May 8, 2017, 7:58:05 AM
    Author     : Yogesh
--%>

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
    <center>
        <h1>User Regitration</h1>
        <a href="regitration.jsp">Regitration</a>
        <a href="login.jsp">Login </a>
        <a href="show.jsp">show data</a>
        <a href="login.jsp">Logout</a>
        <form>
        <table>
            <tr>
                <td>user name:</td>
                <td><input type="text" name="txtname"></td>
            </tr>
            <tr>
                <td>user password:</td>
                <td><input type="password" name="txtpassword"></td>
            </tr>
            <tr>
                <td>enter bob:</td>
                <td><input type="date" name="txtdate"></td>
            </tr>
            <tr>
                <td>Gender:</td>
                <td><input type="radio" name="rd" value="male">Male</td>
                <td><input type="radio" name="rd" value="female">feMale</td>
            </tr>
            <tr>
                <td>Select City:</td>
                <td><select name="city">
                <option>surat</option>
                <option>vyara</option>
                <option>songadh</option>
                 </select>
                </td>
            </tr>
            <tr>
                <td><input type="submit" value="Regitration" name="inser"></td>
            </tr>
                
        </table>
        </form>
   </center>
    </body>
</html>
<%
String vname=request.getParameter("txtname");
String vpass=request.getParameter("txtpassword");
String vdate=request.getParameter("txtdate");
String vgender=request.getParameter("rd");
String vcity=request.getParameter("city");

if(request.getParameter("inser")!=null)
{
    String qry="insert into regi(name,password,bob,gender,city) values('"+vname+"','"+vpass+"','"+vdate+"','"+vgender+"','"+vcity+"')";
    st.executeUpdate(qry);
    response.sendRedirect("login.jsp");
    //out.print("inserted");
}
String q="select * from regi";
rs=st.executeQuery(q);
out.print("<table border='1'><tr><th>action</th><th>name</th><th>password</th><th>date</th><th>gender</th><th>city</th></tr>");
while(rs.next())
{
    out.print("<tr><td><a href='regitration.jsp?action=delete&value="+rs.getString(1)+"'>delete</a></td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td></tr>");
    
    

}
out.print("</table");


%>
