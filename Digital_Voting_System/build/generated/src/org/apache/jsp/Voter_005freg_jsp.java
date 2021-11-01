package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Voter_005freg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<title>Voter Registration</title>\n");
      out.write("\t<!-- Meta tag Keywords -->\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t<meta charset=\"UTF-8\" />\n");
      out.write("\t<meta name=\"keywords\" content=\"Full Screen Enroll Form Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements\" />\n");
      out.write("\t<script>\n");
      out.write("\t\taddEventListener(\"load\", function () {\n");
      out.write("\t\t\tsetTimeout(hideURLbar, 0);\n");
      out.write("\t\t}, false);\n");
      out.write("\n");
      out.write("\t\tfunction hideURLbar() {\n");
      out.write("\t\t\twindow.scrollTo(0, 1);\n");
      out.write("\t\t}\n");
      out.write("\t</script>\n");
      out.write("\t<!-- Meta tag Keywords -->\n");
      out.write("\n");
      out.write("\t<!-- css files -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css1/style.css\" type=\"text/css\" media=\"all\" />\n");
      out.write("\t<!-- Style-CSS -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css1/font-awesome.min.css\">\n");
      out.write("\t<!-- Font-Awesome-Icons-CSS -->\n");
      out.write("\t<!-- //css files -->\n");
      out.write("\n");
      out.write("\t<!-- web-fonts -->\n");
      out.write("\t<link href=\"//fonts1.googleapis.com/css1?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&amp;subset=devanagari,latin-ext\"\n");
      out.write("\t rel=\"stylesheet\">\n");
      out.write("\t<!-- //web-fonts -->\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"main-w3ls\">\n");
      out.write("\t\t<div class=\"left-content\">\n");
      out.write("\t\t\t<div class=\"w3ls-content\">\n");
      out.write("\t\t\t\t<!-- logo -->\n");
      out.write("\t\t\t\t<img src=\"images/logo.png\" />\n");
      out.write("\t\t\t\t<!-- //logo -->\n");
      out.write("\t\t\t\t<h2 style=\"color: black\"> \" वोट हमारा है अधिकार, करें नहीं इसको बेकार...!! \"</h2>\n");
      out.write("                                       \n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- copyright -->\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"right-form-agile\">\n");
      out.write("\t\t\t<!-- content -->\n");
      out.write("\t\t\t<div class=\"sub-main-w3\">\n");
      out.write("\t\t\t\t<h3>Register Here...!!</h3>\n");
      out.write("                                <br> \n");
      out.write("                           <form action=\"./Reg_Submit\" method=\"post\">\n");
      out.write("\t\t\t\t\t<div class=\"form-style-agile\">\n");
      out.write("\t\t\t\t\t\t<label>Your Name</label>\n");
      out.write("\t\t\t\t\t\t<div class=\"pom-agile\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"fa fa-user\"></span>\n");
      out.write("\t\t\t\t\t\t\t<input placeholder=\"Your Name\"  type=\"text\" name=\"t1\" value=\"\" required autofocus=\"\"\n");
      out.write("                                               pattern=\"[a-zA-Z]{2,50}\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-style-agile\">\n");
      out.write("\t\t\t\t\t\t<label>Adhaar Number</label>\n");
      out.write("                                                \n");
      out.write("\t\t\t\t\t\t<div class=\"pom-agile\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"fa fa-user-secret\"></span>\n");
      out.write("\t\t\t\t\t\t\t<input placeholder=\"Adhaar Number\"  type=\"text\" name=\"t2\" value=\"\" required pattern=\"[0-9]{12}\" >\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                       <div class=\"form-style-agile\">\n");
      out.write("\t\t\t\t\t\t<label>Voter Id</label>\n");
      out.write("\t\t\t\t\t\t<div class=\"pom-agile\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"fa fa-text-height\"></span>\n");
      out.write("\t\t\t\t\t\t\t<input placeholder=\"Voter Id\"  type=\"text\" name=\"t3\" value=\"\" required=\"\" >\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                      <div class=\"form-style-agile\">\n");
      out.write("\t\t\t\t\t\t<label>Mobile Number</label>\n");
      out.write("\t\t\t\t\t\t<div class=\"pom-agile\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"fa fa-whatsapp\"></span>\n");
      out.write("\t\t\t\t\t\t\t<input placeholder=\"Mobile Number\" type=\"text\" name=\"t4\" value=\"\" required\n");
      out.write("                                               pattern=\"[0-9]{10}\" >\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                               <div class=\"form-style-agile\">\n");
      out.write("\t\t\t\t\t\t<label>Date of Birth</label>\n");
      out.write("\t\t\t\t\t\t<div class=\"pom-agile\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"fa fa-calendar\"></span>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"date\"  name=\"t5\" data-date-inline-picker=\"true\"  >\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                               \n");
      out.write("                               \n");
      out.write("                                <div class=\"form-style-agile\">\n");
      out.write("\t\t\t\t\t\t<label>State</label>\n");
      out.write("\t\t\t\t\t\t<div class=\"pom-agile\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"fa fa-map-marker\"></span>\n");
      out.write("\t\t\t\t\t\t\t<select name=\"t8\">\n");
      out.write("                                    <option>Andhra Pradesh</option>\n");
      out.write("                                    <option>Arunachal Pradesh</option>\n");
      out.write("                                    <option>Assam</option>\n");
      out.write("                                    <option>Bihar</option>\n");
      out.write("                                    <option>Chhattisgarh</option>\n");
      out.write("                                    <option>Delhi</option>\n");
      out.write("                                    <option>Goa</option>\n");
      out.write("                                    <option>Gujarat</option>\n");
      out.write("                                    <option>Haryana</option>\n");
      out.write("                                    <option>Himachal Pradesh</option>\n");
      out.write("                                    <option>Jammu and Kashmir</option>\n");
      out.write("                                    <option>Jharkhand</option>\n");
      out.write("                                    <option>Karnataka</option>\n");
      out.write("                                    <option>Kerala</option>\n");
      out.write("                                    <option>Madhya Pradesh</option>\n");
      out.write("                                    <option>Maharashtra</option>\n");
      out.write("                                    <option>Manipur</option>\n");
      out.write("                                    <option>Meghalaya</option>\n");
      out.write("                                    <option>Mizoram</option>\n");
      out.write("                                    <option>Nagaland</option>\n");
      out.write("                                    <option>Odisha</option>\n");
      out.write("                                    <option>Punjab</option>\n");
      out.write("                                    <option>Rajasthan</option>\n");
      out.write("                                    <option>Sikkim</option>\n");
      out.write("                                    <option>Tamil Nadu</option>\n");
      out.write("                                    <option>Telangana</option>\n");
      out.write("                                    <option>Tripura</option>\n");
      out.write("                                    <option>Uttar Pradesh</option>\n");
      out.write("                                    <option>Uttarakhand</option>\n");
      out.write("                                    <option>West Bengal</option>\n");
      out.write("                                    \n");
      out.write("                                        </select>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                               \n");
      out.write("                                <div class=\"form-style-agile\">\n");
      out.write("\t\t\t\t\t\t<label>District</label>\n");
      out.write("\t\t\t\t\t\t<div class=\"pom-agile\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"fa fa-map-pin\"></span>\n");
      out.write("\t\t\t\t\t\t\t<input placeholder=\"District\"  type=\"text\" name=\"t9\" value=\"\" required>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                               \n");
      out.write("\t\t\t\t\t<div class=\"form-style-agile\">\n");
      out.write("\t\t\t\t\t\t<label>Create Password</label>\n");
      out.write("\t\t\t\t\t\t<div class=\"pom-agile\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"fa fa-key\"></span>\n");
      out.write("                                                        <input placeholder=\"Create Password\" type=\"password\" name=\"t6\" value=\"\" required>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-style-agile\">\n");
      out.write("\t\t\t\t\t\t<label>Confirm Password</label>\n");
      out.write("\t\t\t\t\t\t<div class=\"pom-agile\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"fa fa-lock\"></span>\n");
      out.write("\t\t\t\t\t\t\t<input placeholder=\"Confirm Password\" name=\"t7\" type=\"password\" value=\"\" required>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"sub-agile\">\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" id=\"brand1\" value=\"\">\n");
      out.write("\t\t\t\t\t\t<label for=\"brand1\">\n");
      out.write("\t\t\t\t\t\t\t<span></span>Above details are true as per my knowledge</label>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"Submit\" name=\"b1\" >\n");
      out.write("\t\t\t\t</form>  \n");
      out.write("                                <br>\n");
      out.write("                                <a href=\"Voter_login.jsp\" style=\"color: white\"><span></span>Already Registered Click Here</a>\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                <br>\n");
      out.write("                            <p> © Election Commission of India. All rights reserved \n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("                        \n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- //content -->\n");
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
