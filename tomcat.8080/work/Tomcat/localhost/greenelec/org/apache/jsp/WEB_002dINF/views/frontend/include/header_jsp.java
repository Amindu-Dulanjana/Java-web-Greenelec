/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.7
 * Generated at: 2023-09-26 16:18:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.frontend.include;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<div class=\"col-12 bg-light border-top border-bottom border-2 border-warning\">\r\n");
      out.write("    <div class=\"row mt-1\">\r\n");
      out.write("        <div class=\"col-12 col-lg-2\"><h2 class=\"fw-bold mt-lg-2 logot\">Greenelec</h2></div>\r\n");
      out.write("        <div class=\"col-12 col-md-6 col-lg-6 mt-lg-3 mt-md-1 mb-1 mb-md-0 mb-lg-0 align-self-start text-nowrap text-lg-center\">\r\n");
      out.write("                <span class=\"text-start label1\"><b>Welcome</b>\r\n");
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("                    Amindu\r\n");
      out.write("                    | <span class=\"text-start label2\" onclick=\"signOut();\">Sign Out</span>\r\n");
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("                </span> |\r\n");
      out.write("            <span class=\"text-start label2\">Help and Contact</span>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-12 col-md-6 col-lg-3 offset-lg-1 align-self-end\" style=\"text-align: center;\">\r\n");
      out.write("            <div class=\"row mb-1\">\r\n");
      out.write("                <div class=\"col-1 col-lg-2 col-md-3 mt-1 \">\r\n");
      out.write("                    <span class=\"text-start label2\" onclick=\"goToAddProduct();\">Sell</span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-2 col-md-6 col-lg-7 mb-1 dropdown\">\r\n");
      out.write("                    <button class=\"btn btn-outline-success dropdown-toggle fw-bold\" type=\"button\" id=\"dropdownMenuButton1\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                        All Greenelec\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <ul class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton1\">\r\n");
      out.write("                        <li><a class=\"dropdown-item fw-bold\" href=\"#\">Wishlist</a></li>\r\n");
      out.write("                        <li><a class=\"dropdown-item fw-bold\" href=\"#\">Purchase History</a></li>\r\n");
      out.write("                        <li><a class=\"dropdown-item fw-bold\" href=\"#\">Message</a></li>\r\n");
      out.write("                        <li><a class=\"dropdown-item fw-bold\" href=\"#\">My Products</a></li>\r\n");
      out.write("                        <li><a class=\"dropdown-item fw-bold\" href=\"#\">My Profile</a></li>\r\n");
      out.write("                        <!-- <li><a class=\"dropdown-item\" href=\"#\">My Sellings</a></li> -->\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-1 col-md-1 col-lg-3 ms-5 ms-lg-0 carticon\" onclick=\"cart();\"><i class=\"bi bi-cart3 fs-4\"></i></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
