package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Voter_005fhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("<title>Voter Profile</title>\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html;charset=utf-8\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css2/main.css\" type=\"text/css\" />\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write(" <div id=\"header\">\n");
      out.write("     \n");
      out.write("  <div class=\"wrap\">\n");
      out.write("      <br>\n");
      out.write("    <img src=\"images/eci3.png\" />\n");
      out.write("    \n");
      out.write("       <br>\n");
      out.write("       <br>\n");
      out.write("    <ul id=\"menu\">\n");
      out.write("      <li><a class=\"current\" href=\"#\">Voter's Profile</a></li>\n");
      out.write("      \n");
      out.write("      <li><a href=\"Party_list.jsp\">Party List</a></li>\n");
      out.write("      <li><a  href=\"generate_token.jsp\">Apply for Vote</a></li>\n");
      out.write("      <li class=\"last\"><a href=\"Logout.jsp\">Logout</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("<div class=\"wrap\">\n");
      out.write("  <div id=\"main\">\n");
      out.write("    <div class=\"wrap\">\n");
      out.write("        <h1>WELCOME:  &nbsp&nbsp&nbsp  ");
      out.print( session.getAttribute("name").toString().toUpperCase()  );
      out.write(" </h1>\n");
      out.write("     \n");
      out.write("       <div class=\"line\"></div>\n");
      out.write("       <br>\n");
      out.write("      <table>\n");
      out.write("              <tr>\n");
      out.write("                  <td>\n");
      out.write("                      <h2> YOUR VOTER ID:</h2> \n");
      out.write("                  </td>\n");
      out.write("                  <td>\n");
      out.write("                      <h2>  ");
      out.print( session.getAttribute("voter_id")  );
      out.write("</h2> \n");
      out.write("                  </td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                  <td>\n");
      out.write("                     <h2>AADHAR NUMBER:&nbsp&nbsp&nbsp </h2> \n");
      out.write("                  </td>\n");
      out.write("                  <td>\n");
      out.write("                      <h2>  ");
      out.print( session.getAttribute("adhaar")  );
      out.write("</h2> \n");
      out.write("                  </td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                  <td>\n");
      out.write("                     <h2>MOBILE NUMBER:</h2>  \n");
      out.write("                  </td>\n");
      out.write("                  <td>\n");
      out.write("                     <h2>   ");
      out.print( session.getAttribute("mobile")  );
      out.write("</h2> \n");
      out.write("                  </td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                  <td>\n");
      out.write("                    <h2>   YOU BELONGS TO: </h2> \n");
      out.write("                  </td>\n");
      out.write("                  <td>\n");
      out.write("                      <h2>  ");
      out.print( session.getAttribute("state"));
      out.write(" STATE</h2> \n");
      out.write("                  </td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                  <td>\n");
      out.write("                     <h2>  YOUR DISTRICT: </h2> \n");
      out.write("                  </td>\n");
      out.write("                  <td>\n");
      out.write("                      <h2>  ");
      out.print( session.getAttribute("district"));
      out.write(" </h2> \n");
      out.write("                  </td>\n");
      out.write("              </tr>\n");
      out.write("           </table>\n");
      out.write("      </div>\n");
      out.write("   <div class=\"line\"></div>\n");
      out.write("</div>\n");
      out.write("                  \n");
      out.write(" \n");
      out.write("                  \n");
      out.write("  <div id=\"side\">\n");
      out.write("       <img src=\"images/ecicall.jpg\" />\n");
      out.write("  </div>\n");
      out.write("  <div id=\"footer\">\n");
      out.write(" \n");
      out.write("      <div class=\"r\">  <h3 class=\"title\">© Election Commission of India. All rights reserved </h3>\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("</div>\n");
      out.write(" </body>\n");
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
