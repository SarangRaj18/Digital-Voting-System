package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.OutputStream;
import javax.swing.ImageIcon;
import java.sql.*;
import Upyogi.DBconnect;

public final class Party_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
      out.write(" \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("<title>Party List</title>\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html;charset=utf-8\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css2/main.css\" type=\"text/css\" />\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div id=\"header\">\n");
      out.write("     \n");
      out.write("  <div class=\"wrap\">\n");
      out.write("      <br>\n");
      out.write("    <img src=\"images/eci3.png\" />\n");
      out.write("       <br>\n");
      out.write("       <br>\n");
      out.write("    <ul id=\"menu\">\n");
      out.write("      <li><a  href=\"Voter_home.jsp\">Voter's Profile</a></li>\n");
      out.write("      \n");
      out.write("      <li><a class=\"current\" href=\"#\">Party List</a></li>\n");
      out.write("      <li><a  href=\"generate_token.jsp\">Apply for Vote</a></li>\n");
      out.write("      <li class=\"last\"><a href=\"Logout.jsp\">Logout</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"css3/style.css\">\n");
      out.write("        \n");
      out.write("         \n");
      out.write("      \n");
      out.write("   <div class=\"table-users\">\n");
      out.write("   <div class=\"header\">List of the Parties are:</div>\n");
      out.write("     \n");
      out.write("   <table cellspacing=\"0\">\n");
      out.write("      <tr>\n");
      out.write("          <th><h2>Party Name</h2> </th>\n");
      out.write("         <th><h2>Candidate Name</h2> </th>\n");
      out.write("           <th><h2>District</h2> </th>\n");
      out.write("         <th><h2>Symbol </h2></th>\n");
      out.write("      </tr>\n");
      out.write("\n");
      out.write("             ");

                      try
                {
                    DBconnect x = new DBconnect();
                    String party_name="";
                    String voter_id =
                            session.getAttribute("voter_id").toString();
                    String state=session.getAttribute("state").toString();
                    String district=session.getAttribute("district").toString();
                    String sql = "select * from candidate_reg where state='"+
                            state+"' and district='"+district+"'";
                    
                    ResultSet rs = x.queryReturner(sql);
      
                    while(rs.next())
                    {
                        
                        party_name=rs.getString("party");
                        
                          out.println("<tr>");
                          out.println("<td><h3>"+party_name);
                          out.println("</h3></td>");
                        
                          String candidate_name="";
                          candidate_name=rs.getString("name");
                          
                           String district_name="";
                          district_name=rs.getString("district");
                          
                          out.println("<td><h3>"+candidate_name);
                          out.println("</h3></td>");
                          out.println("<td><h3>"+district_name);
                          out.println("</h3></td>");
                          
                          
                          String photo=rs.getString("logo");
                          out.println("<td><img src = Photos/"+
                          photo+" alt=HTML5 Icon height=100 width=100 />");
                          out.println("</td>");
                         out.println("</tr>");
                    }  
                }
                 catch(Exception ex)
                 {
                          out.println(ex);
                      }
                
      out.write("\n");
      out.write("      \n");
      out.write("   </table>\n");
      out.write("          \n");
      out.write("</div>\n");
      out.write("             <div class=\"r\">  <h3 class=\"title\">© Election Commission of India. All rights reserved </h3>\n");
      out.write("      </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
