/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.74
 * Generated at: 2023-05-19 09:01:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.queen;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminLessonDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/queen/../queen/adminNavbar.jsp", Long.valueOf(1684473104647L));
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
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("*{\r\n");
      out.write("	font-family: none;\r\n");
      out.write("}\r\n");
      out.write(".menu-bar {\r\n");
      out.write("  position: fixed;\r\n");
      out.write("  left: -190px;\r\n");
      out.write("  top: 0;\r\n");
      out.write("  width: 230px;\r\n");
      out.write("  height: 100%;\r\n");
      out.write("  background-color: #333;\r\n");
      out.write("  overflow: auto;\r\n");
      out.write("  transition: left 0.3s ease-in-out; \r\n");
      out.write("}\r\n");
      out.write(".menu-bar a {\r\n");
      out.write("  display: block;\r\n");
      out.write("  color: white;\r\n");
      out.write("  text-decoration: none !important;\r\n");
      out.write("  margin-bottom: 20px;\r\n");
      out.write("  transition: 0.3s;\r\n");
      out.write("  padding: 5px; \r\n");
      out.write("  margin:20px;\r\n");
      out.write("  font-size:16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".menu-bar a:hover {\r\n");
      out.write("  color: #f1f1f1;\r\n");
      out.write("  background-color: #555;\r\n");
      out.write("  border-radius: 5px;\r\n");
      out.write("  \r\n");
      out.write("}\r\n");
      out.write(".menu-bar .p{\r\n");
      out.write("color: #ffd400;\r\n");
      out.write("font-size: 15px;\r\n");
      out.write(" margin:20px;\r\n");
      out.write("}\r\n");
      out.write(".menu-bar .h3{\r\n");
      out.write("color: #ffd400;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sub-menu {\r\n");
      out.write("  display: none;\r\n");
      out.write("}\r\n");
      out.write(".menu-bar.active {\r\n");
      out.write("  left: 0;\r\n");
      out.write("}\r\n");
      out.write(".menu-icon {\r\n");
      out.write("  display: block;\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  top: 50%;\r\n");
      out.write("  right: 10px;\r\n");
      out.write("  transform: translateY(-50%);\r\n");
      out.write("}\r\n");
      out.write(".menu-icon i {\r\n");
      out.write("  font-size: 36px;\r\n");
      out.write("  color: white;\r\n");
      out.write("  font-weight:bold;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"menu-bar\">\r\n");
      out.write("<a href=\"index\" style=\"margin:0px 20px;\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/front/LOGOy.png\" style=\"width:140px; hight: auto;\" title=\"꿀팁홈페이지로가기\"></a>\r\n");
      out.write("<p class=\"p\"style=\"margin-bottom:40px;\">관리자님 반갑습니다</p>\r\n");
      out.write("<h3 class=\"h3\"><a style=\"font-size:18.72px; font-weight:bold;\" href=\"goChart\">메인으로가기</a></h3>\r\n");
      out.write("  <a href=\"listuser\">회원리스트</a>\r\n");
      out.write("  <a href=\"listlesson\">강의리스트</a>\r\n");
      out.write("  <a href=\"getReportList\">블랙리스트관리</a>\r\n");
      out.write("  <a href=\"getPotentialTiperList\">승급요청처리</a>\r\n");
      out.write("  <a href=\"adminNoticeList\">공지사항 관리</a>\r\n");
      out.write("  <a href=\"adminFaqList\">F A Q 관리</a>\r\n");
      out.write("  <a href=\"callEscrowList\">에스크로내역</a>\r\n");
      out.write("  <a href=\"getDisputeResolutionList\">강의 완료 및 취소</a>\r\n");
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
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("	font-family: Arial, sans-serif;\r\n");
      out.write("	font-size: 14px;\r\n");
      out.write("	line-height: 1.5;\r\n");
      out.write("	margin: 0;\r\n");
      out.write("	padding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container {\r\n");
      out.write("	width: 65%;\r\n");
      out.write("	margin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Style the title */\r\n");
      out.write("#lessonName {\r\n");
      out.write("	font-size: 24px;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	margin: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Style the table */\r\n");
      out.write("table {\r\n");
      out.write("	border-collapse: collapse;\r\n");
      out.write("	width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table td {\r\n");
      out.write("	border: 1px solid #ccc;\r\n");
      out.write("	padding: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table textarea {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	height: 70px;\r\n");
      out.write("	font-size: 14px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#contSpace {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	height: 600px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Style the buttons */\r\n");
      out.write("button {\r\n");
      out.write("	border-style: none;\r\n");
      out.write("	background: #FFD400;\r\n");
      out.write("	color: #5c3b0c;\r\n");
      out.write("	margin: 5px;\r\n");
      out.write("	padding: 5px 18px;\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("	float: right;\r\n");
      out.write("	font-size: 12pt;\r\n");
      out.write("	font-weight: bolder;\r\n");
      out.write("	border-radius: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button:hover {\r\n");
      out.write("	background-color: #E6B800;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Style the radio buttons */\r\n");
      out.write("input[type=\"radio\"] {\r\n");
      out.write("	margin-right: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Style the form */\r\n");
      out.write("form {\r\n");
      out.write("	margin: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".td_left {\r\n");
      out.write("	color: #474747;\r\n");
      out.write("	border-spacing: 0 10px;\r\n");
      out.write("	width: 150px;\r\n");
      out.write("	background: #F5F5F5;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	border-width: 1px;\r\n");
      out.write("	border-top-style: solid;\r\n");
      out.write("	border-right-style: none;\r\n");
      out.write("	border-left-style: none;\r\n");
      out.write("	border-color: #ddd;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".td_right {\r\n");
      out.write("	padding-left: 20px;\r\n");
      out.write("	/* 	width: 300px; */\r\n");
      out.write("	height: 50px;\r\n");
      out.write("	background: white;\r\n");
      out.write("	border-width: 1px;\r\n");
      out.write("	border-top-style: solid;\r\n");
      out.write("	border-right-style: none;\r\n");
      out.write("	border-left-style: none;\r\n");
      out.write("	border-color: #ddd;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sans-serif {\r\n");
      out.write("	font-family: sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* 자동 줄바꿈 */\r\n");
      out.write("#pre123 {\r\n");
      out.write("	white-space: pre-wrap;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".modal {\r\n");
      out.write("	display: none;\r\n");
      out.write("	position: fixed;\r\n");
      out.write("	z-index: 9999;\r\n");
      out.write("	left: 0;\r\n");
      out.write("	top: 0;\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	height: 100%;\r\n");
      out.write("	overflow: auto;\r\n");
      out.write("	background-color: rgba(0, 0, 0, 0.5);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".modal-content {\r\n");
      out.write("	display: block;\r\n");
      out.write("	margin: auto;\r\n");
      out.write("	max-width: 80%;\r\n");
      out.write("	max-height: 80%;\r\n");
      out.write("	transform: translateY(10%);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".close {\r\n");
      out.write("	position: absolute;\r\n");
      out.write("	top: 15px;\r\n");
      out.write("	right: 35px;\r\n");
      out.write("	color: white;\r\n");
      out.write("	font-size: 40px;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("	function confirmDelete() {\r\n");
      out.write("		if (confirm(\"정말 삭제하시겠습니까?\")) {\r\n");
      out.write("			deleteLesson();\r\n");
      out.write("		} else {\r\n");
      out.write("			alert('삭제가 취소되었습니다.');\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	function deleteLesson() {\r\n");
      out.write("		location.href = 'deleteLesson?lesson_num=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${getLesson.lesson_num}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("';\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	function openModal() {\r\n");
      out.write("		var modal = document.getElementById(\"myModal\");\r\n");
      out.write("		var modalImg = document.getElementById(\"modalImg\");\r\n");
      out.write("		modal.style.display = \"block\";\r\n");
      out.write("		modalImg.src = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/front/lesson/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${getLesson.lesson_img}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	function closeModal() {\r\n");
      out.write("		var modal = document.getElementById(\"myModal\");\r\n");
      out.write("		modal.style.display = \"none\";\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div style=\"margin: 40px 0;\">\r\n");
      out.write("			<span id=\"lessonName\">강의상세정보</span>\r\n");
      out.write("			<button type=\"button\" onclick=\"location.href='listlesson'\">목록가기</button>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<table>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td class=\"td_left\">강의이미지</td>\r\n");
      out.write("				<td class=\"td_right\" style=\"text-align: center;\"><img\r\n");
      out.write("					style=\"width: 300px; height: 300px; cursor: pointer;\"\r\n");
      out.write("					src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/front/lesson/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${getLesson.lesson_img}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("					alt=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${getLesson.lesson_img}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" title=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${getLesson.lesson_img}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("					onclick=\"openModal()\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td class=\"td_left\">강의제목</td>\r\n");
      out.write("				<td class=\"td_right\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${getLesson.lesson_title }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td class=\"td_left\">강사아이디</td>\r\n");
      out.write("				<td class=\"td_right\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${getLesson.tiper_user_id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td class=\"td_left\">강사정보</td>\r\n");
      out.write("				<td class=\"td_right\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${getLesson.tiper_info }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td class=\"td_left\">강의정보</td>\r\n");
      out.write("				<td class=\"td_right\"><pre class=\"sans-serif\" id=\"pre123\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${getLesson.lesson_info }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</pre></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td class=\"td_left\">강의등록일</td>\r\n");
      out.write("				<td class=\"td_right\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${getLesson.lesson_date }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("\r\n");
      out.write("		</table>\r\n");
      out.write("		<br>\r\n");
      out.write("		<button type=\"button\" onclick=\"confirmDelete()\">삭제하기</button>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div id=\"myModal\" class=\"modal\">\r\n");
      out.write("		<span class=\"close\" onclick=\"closeModal()\">&times;</span> <img\r\n");
      out.write("			class=\"modal-content\" id=\"modalImg\">\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<br>\r\n");
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