/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-10-07 05:59:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("<meta name=\"description\" content=\"\">\n");
      out.write("<meta name=\"author\" content=\"\">\n");
      out.write("<link rel=\"icon\" href=\"../../favicon.ico\">\n");
      out.write("\n");
      out.write("<!-- Latest compiled and minified CSS -->\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<!-- jQuery library -->\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Latest compiled JavaScript -->\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Custom styles for this template -->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/signin.css\"/>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t<p><font color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errorMessage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</font></p>\n");
      out.write("\t\t<form action=\"/login.do\" method=\"post\" class=\"form-signin\">\n");
      out.write("\t\t\t<h2 class=\"form-signin-heading\">Please sign in</h2>\n");
      out.write("\t\t\t<label for=\"inputEmail\" class=\"sr-only\">User Name</label> <input\n");
      out.write("\t\t\t\ttype=\"text\" id=\"username\" class=\"form-control\"\n");
      out.write("\t\t\t\tplaceholder=\"User Name\" name=\"username\" required autofocus> <label\n");
      out.write("\t\t\t\tfor=\"inputPassword\" class=\"sr-only\">Password</label> <input\n");
      out.write("\t\t\t\ttype=\"password\" id=\"inputPassword\" name=\"password\" class=\"form-control\"\n");
      out.write("\t\t\t\tplaceholder=\"Password\" required>\n");
      out.write("\t\t\t<div class=\"checkbox\">\n");
      out.write("\t\t\t\t<label> <input type=\"checkbox\" value=\"remember-me\">\n");
      out.write("\t\t\t\t\tRemember me\n");
      out.write("\t\t\t\t</label>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Sign\n");
      out.write("\t\t\t\tin</button>\n");
      out.write("\t\t</form>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<!-- /container -->\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
