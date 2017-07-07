package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");

    String s=session.getAttribute("name").toString();
    Class.forName("com.mysql.jdbc.Driver");
    Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ygamit?zeroDateTimeBehavior=convertToNull","root","");
    Statement st=cn.createStatement();
    ResultSet rs;
    String qry="select * from regi where name='"+s+"'";
    rs=st.executeQuery(qry);
    if(rs.next())
    {
    
    
    

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <center>\n");
      out.write("        <h1>User edit</h1>\n");
      out.write("        <a href=\"regitration.jsp\">Regitration</a>\n");
      out.write("        <a href=\"login.jsp\">Login </a>\n");
      out.write("        <a href=\"show.jsp\">show data</a>\n");
      out.write("        <a href=\"login.jsp\">Logout</a>\n");
      out.write("        \n");
      out.write("        <form>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td>user name:</td>\n");
      out.write("                <td><input type=\"text\" name=\"txtname\" value=\"");
out.print(rs.getString("name"));
      out.write("\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>user password:</td>\n");
      out.write("                <td><input type=\"password\" name=\"txtpassword\" value=\"");
out.print(rs.getString("password"));
      out.write("\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>enter bob:</td>\n");
      out.write("                <td><input type=\"date\" name=\"txtdate\" value=\"");
out.print(rs.getString("bob"));
      out.write("\"></td>\n");
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
      out.write("                <td><input type=\"submit\" value=\"Regitration\" name=\"update\"></td>\n");
      out.write("            </tr>\n");
      out.write("                \n");
      out.write("        </table>\n");
      out.write("        </form>\n");
      out.write("   </center>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");

}

      out.write('\n');

    String vname=request.getParameter("txtname");
    String vpassword=request.getParameter("txtpassword");
    String vdate=request.getParameter("txtdate");
    String vrd=request.getParameter("rd");
    String vcity=request.getParameter("city");
    String q="update regi set name='"+vname+"',password='"+vpassword+"',bob='"+vdate+"',gender='"+vrd+"',city='"+vcity+"' where name='"+s+"'";
    st.executeUpdate(q);
    //response.sendRedirect("show.jsp");
    out.print("insert update");
    
    

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
