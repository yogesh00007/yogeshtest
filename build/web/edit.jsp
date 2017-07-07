<%-- 
    Document   : edit
    Created on : May 8, 2017, 12:17:18 PM
    Author     : Yogesh
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String s=session.getAttribute("name").toString();
    Class.forName("com.mysql.jdbc.Driver");
    Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ygamit?zeroDateTimeBehavior=convertToNull","root","");
    Statement st=cn.createStatement();
    ResultSet rs;
    String qry="select * from regi where name='"+s+"'";
    rs=st.executeQuery(qry);
    if(rs.next())
    {
    
    
    
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
        <h1>User edit</h1>
        <a href="regitration.jsp">Regitration</a>
        <a href="login.jsp">Login </a>
        <a href="show.jsp">show data</a>
        <a href="login.jsp">Logout</a>
        
        <form>
        <table>
            <tr>
                <td>user yyyyyyyyyyy gamit name:</td>
                <td><input type="text" name="txtname" value="<%out.print(rs.getString("name"));%>"></td>
            </tr>
            <tr>
                <td>user password:</td>
                <td><input type="password" name="txtpassword" value="<%out.print(rs.getString("password"));%>"></td>
            </tr>
            <tr>
                <td>enter bob:</td>
                <td><input type="date" name="txtdate" value="<%out.print(rs.getString("bob"));%>"></td>
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
                <td><input type="submit" value="update" name="update"></td>
            </tr>
                
        </table>
        </form>
   </center>
        
    </body>
</html>
<%
}
%>
<%
    String vname=request.getParameter("txtname");
    String vpassword=request.getParameter("txtpassword");
    String vdate=request.getParameter("txtdate");
    String vrd=request.getParameter("rd");
    String vcity=request.getParameter("city");
    if(request.getParameter("update")!=null)
    {
    String q="update regi set name='"+vname+"',password='"+vpassword+"',bob='"+vdate+"',gender='"+vrd+"',city='"+vcity+"' where name='"+s+"'";
    st.executeUpdate(q);
    //response.sendRedirect("show.jsp");
    out.print("insert update");
    response.sendRedirect("show.jsp");
    }
    
    
%>
