/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.74
 * Generated at: 2023-05-21 22:50:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.queen;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminNoticeInsert_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/queen/../queen/adminNavbar.jsp", Long.valueOf(1684668360000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("<!-- <title>Insert title here</title> -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/front/adminNavbar.css\" rel=\"stylesheet\">\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"menu-bar\">\r\n");
      out.write("<a href=\"index\" style=\"margin:0px 20px;\"><img onerror=\"this.src='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/front/default.png'\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/front/LOGOy.png\" style=\"width:140px; hight: auto;\" title=\"꿀TIP 홈페이지로가기\"></a>\r\n");
      out.write("<p class=\"p\"style=\"margin-bottom:40px;\">관리자님 반갑습니다</p>\r\n");
      out.write("<h3 class=\"h3\"><a style=\"font-size:18.72px; font-weight:bold;\" href=\"goChart\">메인으로가기</a></h3>\r\n");
      out.write("  <a href=\"listuser\">회원리스트</a>\r\n");
      out.write("  <a href=\"listlesson\">강의리스트</a>\r\n");
      out.write("  <a href=\"getReportList\">블랙리스트관리</a>\r\n");
      out.write("  <a href=\"getPotentialTiperList\">승급요청처리</a>\r\n");
      out.write("  <a href=\"adminNoticeList\">공지사항 관리</a>\r\n");
      out.write("  <a href=\"adminFaqList\">F A Q 관리</a>\r\n");
      out.write("  <a href=\"callEscrowList\">에스크로내역</a>\r\n");
      out.write("  <a href=\"getDisputeResolutionList\">강의완료 및 취소</a>\r\n");
      out.write("  <a href=\"adminChkBtn\">관리자정보수정</a>\r\n");
      out.write("  <a class=\"p\" href=\"logOut\"style=\"font-weight:bold;font-size:18px;\">관리자 로그아웃</a>\r\n");
      out.write("<div class=\"menu-icon\">\r\n");
      out.write("    <i class=\"fa fa-angle-right\"></i>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write(" <script>\r\n");
      out.write(" const menuBar = document.querySelector('.menu-bar');\r\n");
      out.write(" const subMenus = document.querySelectorAll('.sub-menu');\r\n");
      out.write(" const menuIcon = document.querySelector('.menu-icon');\r\n");
      out.write("\r\n");
      out.write(" menuBar.addEventListener('mouseover', () => {\r\n");
      out.write("   menuBar.classList.add('active');\r\n");
      out.write("   subMenus.forEach(subMenu => subMenu.style.display = 'block');\r\n");
      out.write("   menuIcon.style.display = 'none';\r\n");
      out.write(" });\r\n");
      out.write("\r\n");
      out.write(" menuBar.addEventListener('mouseout', () => {\r\n");
      out.write("   menuBar.classList.remove('active');\r\n");
      out.write("   subMenus.forEach(subMenu => subMenu.style.display = 'none');\r\n");
      out.write("   if (!menuBar.classList.contains('active')) {\r\n");
      out.write("     menuIcon.style.display = 'block';\r\n");
      out.write("   }\r\n");
      out.write(" });\r\n");
      out.write("</script> \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>꿀TIPer 관리자 - 공지사항 등록</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"front/bootstrap.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"front/notice.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/front/adminNoticeInsert.css\" rel=\"stylesheet\">\r\n");
      out.write("<style>\r\n");
      out.write("		#noticeCont:focus, #noticeTitle:focus{\r\n");
      out.write("			border:2px solid #FFD400;\r\n");
      out.write("			outline: none;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		form{\r\n");
      out.write("			border:0;\r\n");
      out.write("		}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("	<div style=\"margin: 40px 0;\">\r\n");
      out.write("		<span id=\"noticeName\">공지사항 등록</span>\r\n");
      out.write("	</div>\r\n");
      out.write("	<form action=\"insertnotice\" method=\"post\">\r\n");
      out.write("	<table id=\"insertTable\" style='width=\"80%\" '>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td style=\"font-size: 16px; font-weight: bolder; text-align: center;\">제목</td>\r\n");
      out.write("			<td><textarea name=\"notice_title\" id=\"noticeTitle\" required></textarea> </td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td style=\"font-size: 16px; font-weight: bolder; text-align: center;\">내용</td>\r\n");
      out.write("			<td width=\"80%\"><textarea name=\"notice_cont\" id=\"noticeCont\"></textarea></td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td style=\"padding-bottom: 18px; font-size: 16px; font-weight: bolder; text-align: center;\">\r\n");
      out.write("			고정여부\r\n");
      out.write("			</td>\r\n");
      out.write("			<td style=\"text-align: left; font-size: 16px; font-weight: bolder;\">\r\n");
      out.write("				<input type=\"radio\" name=\"notice_pin\" value=\"1\" id=\"rhwjd\"><label for=\"rhwjd\">고정</label>&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("				<input type=\"radio\" name=\"notice_pin\" value=\"0\" id=\"dlfqks\" checked><label for=\"dlfqks\">일반</label>\r\n");
      out.write("			</td>\r\n");
      out.write("				\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td></td>\r\n");
      out.write("		</tr>\r\n");
      out.write("	</table>\r\n");
      out.write("	<div id=\"akwls0dhxh\">\r\n");
      out.write("		<input type=\"submit\" value=\"등록\">\r\n");
      out.write("		<button type=\"button\" onclick=\"location.href='adminNoticeList'\">목록가기</button>\r\n");
      out.write("	</div>\r\n");
      out.write("	</form>\r\n");
      out.write("	</div>\r\n");
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
