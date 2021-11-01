package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import Upyogi.DBconnect;

public final class not_005fregistered_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("<title>Voter Login</title>\n");
      out.write("\t<!-- Meta-Tags -->\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"keywords\" content=\"Exact login Form a Responsive Web Template, Bootstrap Web Templates, Flat Web Templates, Android Compatible Web Template, Smartphone Compatible Web Template, Free Webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design\">\n");
      out.write("    <script>\n");
      out.write("        addEventListener(\"load\", function () {\n");
      out.write("            setTimeout(hideURLbar, 0);\n");
      out.write("        }, false);\n");
      out.write("\n");
      out.write("        function hideURLbar() {\n");
      out.write("            window.scrollTo(0, 1);\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("    <!-- //Meta-Tags -->\n");
      out.write("\n");
      out.write("\t<!-- Custom Theme files -->\n");
      out.write("\t<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("\t<link href=\"css/font-awesome.css\" rel=\"stylesheet\"> <!-- Font-Awesome-Icons-CSS -->\n");
      out.write("\t<!-- //Custom Theme files -->\n");
      out.write("\t\n");
      out.write("\t<!-- web font --> \n");
      out.write("\t<link href=\"//fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&amp;subset=latin-ext\" rel=\"stylesheet\">\n");
      out.write("\t<!-- //web font --> \n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <h1 style=\"color: black\">Voter Login Form</h1>\n");
      out.write("\t\t<div class=\"main-w3lsrow\">\n");
      out.write("\t\t\t<!-- login form -->\n");
      out.write("\t\t\t<div class=\"login-form login-form-left\"> \n");
      out.write("\t\t\t\t<div class=\"agile-row\">\n");
      out.write("\t\t\t\t\t<div class=\"head\">\n");
      out.write("\t\t\t\t\t\t<h2>Login Here....</h2>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\t\t\t<div class=\"login-agileits-top\">\n");
      out.write("        <form action=\"./Validate_Voter\" method=\"post\">\n");
      out.write("      \n");
      out.write("            \n");
      out.write("            <input type=\"text\" class=\"name\" name=\"t1\" Placeholder=\"Voter Id Number\" required=\"\"/>\n");
      out.write("\t    <input type=\"password\" class=\"password\" name=\"t2\" Placeholder=\"Password\" required=\"\"/>\n");
      out.write("\t    <input type=\"submit\" value=\"Login\" name=\"b1\" > \n");
      out.write("         </form></div> \n");
      out.write("\t\t\t\t\t<div class=\"login-agileits-bottom\"> \n");
      out.write("\t\t\t\t\t\t<h6><a href=\"Voter_reg.jsp\">New Voter Registration</a></h6>\n");
      out.write("\t\t\t\t\t</div> \n");
      out.write("\n");
      out.write("\t\t\t\t</div>  \n");
      out.write("\t\t\t</div>  \n");
      out.write("                        <div class=\"login-agileits-bottom\"> \n");
      out.write("\t\t\t\t\t\t<h6><a href=\"#\">Oops!!! Voter Not Registered </a></h6>\n");
      out.write("\t\t\t\t\t</div> \n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- //login form -->\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"login-agileits-bottom1\"> \n");
      out.write("\t\t\t<h3>Right to Vote</h3>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- social icons -->\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- //social icons -->\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- copyright -->\n");
      out.write("\t\t<div class=\"copyright\">\n");
      out.write("\t\t\t<p> © Election Commission of India. All rights reserved </p>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- //copyright --> \n");
      out.write("\t</div>\t\n");
      out.write("        \n");
      out.write("    </body>\n");
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
