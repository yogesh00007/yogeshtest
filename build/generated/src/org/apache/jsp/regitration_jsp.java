package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.*;

public final class regitration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

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

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1>User Regitration</h1>\n");
      out.write("        <form>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td>user name:</td>\n");
      out.write("                <td><input type=\"text\" name=\"txtname\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>user password:</td>\n");
      out.write("                <td><input type=\"password\" name=\"txtpassword\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>enter bob:</td>\n");
      out.write("                <td><input type=\"date\" name=\"txtdate\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Gender:</td>\n");
      out.write("                <td><input type=\"radio\" name=\"rd\" value=\"male\">Male</td>\n");
      out.write("                <td><input type=\"radio\" name=\"rd\" value=\"female\">feMale</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Select City:</td>\n");
      out.write("                <td><select name=\"city\">\n");
      out.write("                <option>surat</option>\n");
      out.write("                <option>vyara</option>\n");
      out.write("                <option>songadh</option>\n");
      out.write("                 </select>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><input type=\"submit\" value=\"Regitration\" name=\"inser\"></td>\n");
      out.write("            </tr>\n");
      out.write("                \n");
      out.write("        </table>\n");
      out.write("        </form>\n");
      out.write("   </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");

String vname=request.getParameter("txtname");
String vpass=request.getParameter("txtpassword");
String vdate=request.getParameter("txtdate");
String vgender=request.getParameter("rd");
String vcity=request.getParameter("city");

if(request.getParameter("inser")!=null)
{
    String qry="insert into regi(name,password,bob,gender,city) values('"+vname+"','"+vpass+"','"+vdate+"','"+vgender+"','"+vcity+"')";
    st.executeUpdate(qry);
    //response.sendRedirect("login.jsp");
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



      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
