/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.96
 * Generated at: 2024-03-24 19:39:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.DAO.BookDAOImpl;
import com.DB.DBConnect;
import com.entity.BookDtls;

public final class edit_005fbooks_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/admin/navbar.jsp", Long.valueOf(1706383934259L));
    _jspx_dependants.put("/admin/allCss.jsp", Long.valueOf(1706376026713L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.entity.BookDtls");
    _jspx_imports_classes.add("com.DAO.BookDAOImpl");
    _jspx_imports_classes.add("com.DB.DBConnect");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Admin: Add Books</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\"\r\n");
      out.write("	integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"\r\n");
      out.write("	integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\"\r\n");
      out.write("	integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\"\r\n");
      out.write("	integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css\"\r\n");
      out.write("	integrity=\"sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==\"\r\n");
      out.write("	crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("\r\n");
      out.write("<Link rel=\"stylesheet\" href=\"style.css\">");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color: #f0f2f2;\">\r\n");
      out.write("	");
      out.write("<div class=\"container-fluid\"\r\n");
      out.write("	style=\"height: 10px; background-color: #303f9f\"></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid p-3 bg-light\">\r\n");
      out.write("	<div class=\"row\">\r\n");
      out.write("		<div class=\"col-md-3 text-success\">\r\n");
      out.write("			<h3>\r\n");
      out.write("				<i class=\"fa-solid fa-book\"></i> FreeBook\r\n");
      out.write("			</h3>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"col-md-6\">\r\n");
      out.write("			<form class=\"form-inline my-2 my-lg-0\">\r\n");
      out.write("				<input class=\"form-control mr-sm-2\" type=\"search\"\r\n");
      out.write("					placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("				<button class=\"btn btn-primary my-2 my-sm-0\" type=\"submit\">Search</button>\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"col-md-3\">\r\n");
      out.write("			<a href=\"login.jsp\" class=\"btn btn-success\"><i\r\n");
      out.write("				class=\"fa-solid fa-right-to-bracket\"></i> Login</a> <a\r\n");
      out.write("				href=\"register.jsp\" class=\"btn btn-primary text-white\"><i\r\n");
      out.write("				class=\"fa-solid fa-user-plus\"></i> Register</a>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-custom\">\r\n");
      out.write("	<a class=\"navbar-brand\" href=\"#\"><i\r\n");
      out.write("		class=\"fa-solid fa-house-chimney\"></i></a>\r\n");
      out.write("	<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("		data-target=\"#navbarSupportedContent\"\r\n");
      out.write("		aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("		aria-label=\"Toggle navigation\">\r\n");
      out.write("		<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("	</button>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("		<ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("			<li class=\"nav-item active\"><a class=\"nav-link\" href=\"home.jsp\">Home\r\n");
      out.write("					<span class=\"sr-only\">(current)</span>\r\n");
      out.write("			</a></li>\r\n");
      out.write("			</form>\r\n");
      out.write("	</div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-md-4 offset-md-4\">\r\n");
      out.write("				<div class=\"card\">\r\n");
      out.write("					<div class=\"card-body\">\r\n");
      out.write("						<h4 class=\"text-center\">Edit Books</h4>\r\n");
      out.write("						\r\n");
      out.write("\r\n");
      out.write("						");

						int id = Integer.parseInt(request.getParameter("id"));
						BookDAOImpl dao = new BookDAOImpl(DBConnect.getConn());
						BookDtls b = dao.getBookById(id);
						
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("						<form action=\"../editbooks\" method=\"post\">\r\n");
      out.write("                          <input type=\"hidden\" name=\"id\" value=\"");
      out.print(b.getBookId());
      out.write("\"> \r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label for=\"exampleInputEmail1\">Book Name*</label> <input\r\n");
      out.write("									name=\"bname\" type=\"text\" class=\"form-control\"\r\n");
      out.write("									id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\"\r\n");
      out.write("									value=\"");
      out.print(b.getBookName());
      out.write("\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label for=\"exampleInputEmail1\">Author Name*</label> <input\r\n");
      out.write("									name=\"author\" type=\"text\" class=\"form-control\"\r\n");
      out.write("									id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\"\r\n");
      out.write("									value=\"");
      out.print(b.getAuthor());
      out.write("\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label for=\"exampleInputEmail1\">Price*</label> <input\r\n");
      out.write("									name=\"price\" type=\"number\" class=\"form-control\"\r\n");
      out.write("									id=\"exampleInputPassword1\" value=\"");
      out.print(b.getPrice());
      out.write("\">\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label for=\"inputState\">Book Status</label> <select\r\n");
      out.write("									id=\"inputState\" name=\"status\" class=\"form-control\">\r\n");
      out.write("									");

									if ("Active".equals(b.getStatus())) {
									
      out.write("\r\n");
      out.write("									<option value=\"Active\">Active</option>\r\n");
      out.write("									<option value=\"Inactive\">Inactive</option>\r\n");
      out.write("\r\n");
      out.write("									");

									} else {
									
      out.write("\r\n");
      out.write("									<option value=\"Inactive\">Inactive</option>\r\n");
      out.write("									<option value=\"Active\">Active</option>\r\n");
      out.write("\r\n");
      out.write("									");

									}
									
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("								</select>\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("							<button type=\"submit\" class=\"btn btn-primary\">Update</button>\r\n");
      out.write("\r\n");
      out.write("						</form>\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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
