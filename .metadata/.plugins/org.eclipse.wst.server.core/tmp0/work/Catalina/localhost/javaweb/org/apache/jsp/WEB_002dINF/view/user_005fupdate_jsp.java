/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.31
 * Generated at: 2024-10-31 10:48:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import javaweb.model.dto.UserDto;

public final class user_005fupdate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jakarta.servlet.jsp.jstl-3.0.0.jar", Long.valueOf(1730254456175L));
    _jspx_dependants.put("jar:file:/D:/JavaClass/WorkSpace/Lab/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/javaweb/WEB-INF/lib/jakarta.servlet.jsp.jstl-3.0.0.jar!/META-INF/c.tld", Long.valueOf(1649407098000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(2);
    _jspx_imports_classes.add("javaweb.model.dto.UserDto");
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!-- 核心庫 -->\r\n");
      out.write("\r\n");

	UserDto userDto = (UserDto)request.getAttribute("userDto");

      out.write("   \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("	<head>\r\n");
      out.write("		<meta charset=\"UTF-8\">\r\n");
      out.write("		<title>User 修改</title>\r\n");
      out.write("		<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/purecss@3.0.0/build/pure-min.css\">\r\n");
      out.write("		<link rel=\"stylesheet\" href=\"/javaweb/CSS/buttons.css\">\r\n");
      out.write("		\r\n");
      out.write("		<style>\r\n");
      out.write("        .button-success,\r\n");
      out.write("        .button-error,\r\n");
      out.write("        .button-warning,\r\n");
      out.write("        .button-secondary {\r\n");
      out.write("            color: white;\r\n");
      out.write("            border-radius: 4px;\r\n");
      out.write("            text-shadow: 0 1px 1px rgba(0, 0, 0, 0.2);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .button-success {\r\n");
      out.write("            background: rgb(28, 184, 65);\r\n");
      out.write("            /* this is a green */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .button-error {\r\n");
      out.write("            background: rgb(202, 60, 60);\r\n");
      out.write("            /* this is a maroon */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .button-warning {\r\n");
      out.write("            background: rgb(223, 117, 20);\r\n");
      out.write("            /* this is an orange */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .button-secondary {\r\n");
      out.write("            background: rgb(66, 184, 221);\r\n");
      out.write("            /* this is a light blue */\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("	</head>\r\n");
      out.write("	\r\n");
      out.write("	<body style=\"padding: 15px\">\r\n");
      out.write("	\r\n");
      out.write("		<table>\r\n");
      out.write("		\r\n");
      out.write("		<div style=\"padding: 50px\" class=\"pure-menu custom-restricted-width\">\r\n");
      out.write("		    <ul class=\"pure-menu-list\">\r\n");
      out.write("			     <li class=\"pure-menu-item pure-menu-selected\">\r\n");
      out.write("            		<a href=\"#\" class=\"pure-menu-link\">修改使用者資料</a>\r\n");
      out.write("       			 </li>\r\n");
      out.write("		        <li class=\"pure-menu-item\">\r\n");
      out.write("		            <a href=\"/javaweb/user/help\" class=\"pure-menu-link\">聯絡客服人員</a>\r\n");
      out.write("		        </li>\r\n");
      out.write("		        <li class=\"pure-menu-item\">\r\n");
      out.write("		            <a href=\"/javaweb/user\" class=\"pure-menu-link\">返回主頁面</a>\r\n");
      out.write("		        </li>\r\n");
      out.write("\r\n");
      out.write("		    </ul>\r\n");
      out.write("		</div>\r\n");
      out.write("			\r\n");
      out.write("		<td valign=\"top\">\r\n");
      out.write("				<form class=\"pure-form\" method=\"post\" action=\"/javaweb/user/update\">\r\n");
      out.write("					<fieldset>\r\n");
      out.write("						<legend>User 修改</legend>\r\n");
      out.write("						序號: <input type=\"text\" name=\"userId\" value=\"");
      out.print(userDto.getUserId() );
      out.write("\" readonly /><p /> \r\n");
      out.write("						帳號: <input type=\"text\" name=\"username\" value=\"");
      out.print(userDto.getUsername() );
      out.write("\" readonly /><p /> \r\n");
      out.write("						電郵: <input type=\"email\" name=\"email\" value=\"");
      out.print(userDto.getEmail() );
      out.write("\" readonly /><p />\r\n");
      out.write("						狀態: <input type=\"radio\" name=\"active\" value=\"true\"  ");
      out.print(userDto.getActive()?"checked":"" );
      out.write(" />True\r\n");
      out.write("							 <input type=\"radio\" name=\"active\" value=\"false\" ");
      out.print(userDto.getActive()?"":"checked" );
      out.write("  />False <p />\r\n");
      out.write("						權限: <select name=\"role\">\r\n");
      out.write("								<option value=\"ROLE_ADMIN\" ");
      out.print(userDto.getRole().equals("ROLE_ADMIN")?"selected":"" );
      out.write(">ADMIN</option>\r\n");
      out.write("								<option value=\"ROLE_USER\"  ");
      out.print(userDto.getRole().equals("ROLE_USER")?"selected":"" );
      out.write(">USER</option>\r\n");
      out.write("							  </select><p />\r\n");
      out.write("						<button type=\"submit\" class=\"button-success pure-button\">Update</button>	  \r\n");
      out.write("					</fieldset>\r\n");
      out.write("				</form>\r\n");
      out.write("			</td>\r\n");
      out.write("			<td style=\"padding-left: 30px\" valign=\"top\">\r\n");
      out.write("				<form class=\"pure-form\" method=\"post\" action=\"/javaweb/user/update/password\" >\r\n");
      out.write("					<fieldset>\r\n");
      out.write("						<legend>User 修改密碼(請自行實現)</legend>\r\n");
      out.write("						<input type=\"hidden\" name=\"userId\" value=\"");
      out.print(userDto.getUserId() );
      out.write("\" readonly /><p /> \r\n");
      out.write("						<input type=\"hidden\" name=\"username\" value=\"");
      out.print(userDto.getUsername() );
      out.write("\" readonly /><p />\r\n");
      out.write("						舊密碼: <input type=\"password\" name=\"password\"><p /> \r\n");
      out.write("						新密碼: <input type=\"password\" name=\"newPassword\"><p />\r\n");
      out.write("						<button type=\"submit\" class=\"button-success pure-button\">Update Password</button>	  \r\n");
      out.write("					</fieldset>\r\n");
      out.write("				</form>\r\n");
      out.write("			</td>\r\n");
      out.write("			\r\n");
      out.write("		</table>\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("	</body>\r\n");
      out.write("</html>");
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