/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.74
 * Generated at: 2023-05-23 03:12:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.queen;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminReportList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/queen/../queen/adminNavbar.jsp", Long.valueOf(1684668360000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1683079470908L));
    _jspx_dependants.put("jar:file:/C:/swork/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/honeytiper/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>꿀TIPer 관리자 - 블랙리스트 관리</title>\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/front/adminReportList.css\" rel=\"stylesheet\">\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("	src=\"https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.24.0/moment.min.js\"></script>\r\n");
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
      out.write("<body>\r\n");
      out.write("	<div class=\"jumbotron\">\r\n");
      out.write("	</div>\r\n");
      out.write("	<nav id=\"searchNav\" class=\"navbar navbar-expand-sm navbar-dark\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	</nav>\r\n");
      out.write("	<div id=\"container_top\"></div>\r\n");
      out.write("	<div id=\"super_container\">\r\n");
      out.write("		<div class=\"table_wrapper\">\r\n");
      out.write("\r\n");
      out.write("			<h3 id=\"h3_title\">신고처리</h3>\r\n");
      out.write("			<table class=\"cont1_table\">\r\n");
      out.write("\r\n");
      out.write("				<thead class=\"btn-primary\">\r\n");
      out.write("					<tr class=\"cont1_th\">\r\n");
      out.write("						<th class=\"thCenter1\">신고번호</th>\r\n");
      out.write("						<th class=\"thCenter1\">신고자</th>\r\n");
      out.write("						<th class=\"thCenter1\">피신고자</th>\r\n");
      out.write("						<th class=\"thCenter1\">정지 처리</th>\r\n");
      out.write("						<th class=\"thCenter1\">신고사유</th>\r\n");
      out.write("					</tr>\r\n");
      out.write("				</thead>\r\n");
      out.write("				<tbody id=\"dataTableBody8\">\r\n");
      out.write("\r\n");
      out.write("				</tbody>\r\n");
      out.write("			</table>\r\n");
      out.write("			<ul id=\"pagingul8\">\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"table_wrapper\">\r\n");
      out.write("			<div id=\"top_bar\">\r\n");
      out.write("				<h3>블랙리스트 관리</h3>\r\n");
      out.write("\r\n");
      out.write("				<div id=\"search_wrapper\">\r\n");
      out.write("					<select class=\"search002\" id=\"sel1\" name=\"user_condition\"\r\n");
      out.write("						style=\"display: inline-block !important; margin-right: 10px;\">\r\n");
      out.write("						<option value=\"user_id\">아이디</option>\r\n");
      out.write("						<option value=\"user_name\">이름</option>\r\n");
      out.write("					</select> <input class=\"search002\" type=\"text\" name=\"user_search\" id=\"sel2\"\r\n");
      out.write("						placeholder=\"검색어를 입력하세요.\">\r\n");
      out.write("					<button class=\"btn btn-success\" type=\"submit\" class=\"search002\"\r\n");
      out.write("						id=\"sel3\">검색</button>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<table class=\"cont1_table\">\r\n");
      out.write("				<thead class=\"btn-primary\">\r\n");
      out.write("					<tr class=\"cont1_th\">\r\n");
      out.write("						<th class=\"thCenter1\">아이디</th>\r\n");
      out.write("						<th class=\"thCenter1\">이름</th>\r\n");
      out.write("						<th class=\"thCenter1\">신고 내용</th>\r\n");
      out.write("						<th class=\"thCenter1\">신고 날짜</th>\r\n");
      out.write("						<th class=\"thCenter1\">정지계정 관리</th>\r\n");
      out.write("					</tr>\r\n");
      out.write("				</thead>\r\n");
      out.write("				<tbody id=\"data_table_body9\">\r\n");
      out.write("\r\n");
      out.write("				</tbody>\r\n");
      out.write("			</table>\r\n");
      out.write("\r\n");
      out.write("			<ul id=\"pagingul9\">\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("	<!-- 신고하기 모달창  -->\r\n");
      out.write("			<div class=\"rpt_modal1\" id=\"rpt_modal1Singo\">\r\n");
      out.write("				<div class=\"rpt_modal1-window\">\r\n");
      out.write("\r\n");
      out.write("					<div class=\"rpt_modal1-content1\" id=\"rpt_modal1-content2-singo\">\r\n");
      out.write("\r\n");
      out.write("						<div id=\"rpt_modal1-title-singo\">\r\n");
      out.write("							<div></div>\r\n");
      out.write("							<h3 id=\"rpt_h3_title\">신고 사유</h3>\r\n");
      out.write("							<div id=\"rpt_btn_close\" style=\"cursor:pointer;\"> ✖ </div>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("							<div id=\"rpt_user_singo1\">\r\n");
      out.write("							<span id=\"reportCont\"></span>\r\n");
      out.write("							</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		<div id=\"footer\">\r\n");
      out.write("			<!--   	<button type=\"button\" id=\"conWrite\" class=\"btn btn-primary\">글쓰기</button> -->\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("const modal1 = document.querySelector('.rpt_modal1');\r\n");
      out.write("const btnmodal1Close = document.querySelector('#rpt_btn_close');\r\n");
      out.write("\r\n");
      out.write("//모달창 함수\r\n");
      out.write("function hsh(val1) {\r\n");
      out.write("   modal1.style.display='block';\r\n");
      out.write("     document.body.style.overflow = 'hidden';\r\n");
      out.write("     document.getElementById(\"reportCont\").innerHTML = val1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// 신고창 닫기\r\n");
      out.write("btnmodal1Close.addEventListener('click', () => {\r\n");
      out.write("	   modal1.style.display='none';\r\n");
      out.write("	   document.body.style.removeProperty('overflow');\r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    var totalData8; //총 데이터 수\r\n");
      out.write("    var dataPerPage8; //한 페이지에 나타낼 글 수\r\n");
      out.write("	var pageCount8 = 5; //페이징에 나타낼 페이지 수\r\n");
      out.write("    var globalCurrentPage8= 1; //현재 페이지\r\n");
      out.write("	var dataList8; //표시하려하는 데이터 리스트\r\n");
      out.write("	var strReport = \"\";\r\n");
      out.write("	\r\n");
      out.write("	$(document).ready(function () {\r\n");
      out.write(" //페이지 당 글 개수 \r\n");
      out.write(" dataPerPage8 = 5;\r\n");
      out.write(" \r\n");
      out.write(" dataList8= ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ReportListJSON}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(";\r\n");
      out.write(" totalData8 = dataList8.length;\r\n");
      out.write("		\r\n");
      out.write(" console.log(JSON.stringify(dataList8) + \"가 dataList 즉시실행 시 신고접수\");\r\n");
      out.write(" \r\n");
      out.write("  //글 목록 표시 호출 (테이블 생성)\r\n");
      out.write("  displayData8(1, dataPerPage8);\r\n");
      out.write("\r\n");
      out.write("	//페이징 표시 호출\r\n");
      out.write("  paging8(totalData8, dataPerPage8, pageCount8, 1);\r\n");
      out.write("  });\r\n");
      out.write("\r\n");
      out.write(" //현재 페이지(currentPage)와 페이지당 글 개수(dataPerPage) 반영\r\n");
      out.write(" function displayData8(currentPage8, dataPerPage8) {\r\n");
      out.write("\r\n");
      out.write("	let chartHtml8 = \"\";\r\n");
      out.write("\r\n");
      out.write("  //Number로 변환하지 않으면 아래에서 +를 할 경우 스트링 결합이 되어버림.. \r\n");
      out.write("    currentPage = Number(currentPage8);\r\n");
      out.write("	dataPerPage = Number(dataPerPage8);\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   if (totalData8 < (currentPage8 - 1) * dataPerPage8 + dataPerPage8){\r\n");
      out.write("	\r\n");
      out.write(" 	  for (\r\n");
      out.write(" 		var i = (currentPage8 - 1) * dataPerPage8;\r\n");
      out.write(" 		    i < totalData8;\r\n");
      out.write(" 			     i++\r\n");
      out.write(" 			   ) {\r\n");
      out.write(" 				   console.log(\"error : \" + dataList8[i].report_user_id);\r\n");
      out.write(" 			     chartHtml8 +=\r\n");
      out.write(" 			    	'<tr><td class=\"tdCenter1\">' + dataList8[i].report_num + '</td>'+\r\n");
      out.write(" 			 	  '<td class=\"tdCenter1\">' + dataList8[i].report_user_id + '</td>' +\r\n");
      out.write(" 			 	  '<td class=\"tdCenter1\">' + dataList8[i].report_reported_name +'(' +dataList8[i].report_reported_id + ')' +  '</td>' +\r\n");
      out.write(" 			 	  '<td class=\"tdCenter1\">'+\r\n");
      out.write(" 			 	  '<button type=\"button\" class=\"tdcenter1_btn1\" onclick=\"location.href=\\'/updateReportUserRole?user_id='+dataList8[i].report_reported_id+'&report_num='+dataList8[i].report_num+'&report_lesson_num='+dataList8[i].report_lesson_num+'\\'\">계정 정지</button>'+\r\n");
      out.write(" 			 	  '<button type=\"button\" class=\"tdcenter1_btn2\" onclick=\"location.href=\\'/updateReportReject?report_num='+dataList8[i].report_num+'\\'\">신고 반려</button></td>'+\r\n");
      out.write(" 			 	  '<td class=\"tdCenter1\"><button type=\"button\" class=\"tdcenter1_btn3\" onclick=\"hsh(\\'' + dataList8[i].report_cont +'\\');\">자세히보기</button>'+'</tr><hr>';\r\n");
      out.write("			   } \r\n");
      out.write("			\r\n");
      out.write("	  \r\n");
      out.write("   }else{ \r\n");
      out.write("   \r\n");
      out.write("	for (\r\n");
      out.write("		var i = (currentPage8 - 1) * dataPerPage8;\r\n");
      out.write("      i < (currentPage8 - 1) * dataPerPage8 + dataPerPage8;\r\n");
      out.write("      i++\r\n");
      out.write("    ) {\r\n");
      out.write("		  chartHtml8 +=\r\n");
      out.write("			  '<tr><td class=\"tdCenter1\">' + dataList8[i].report_num + '</td>'+\r\n");
      out.write("			 	  '<td class=\"tdCenter1\">' + dataList8[i].report_user_id + '</td>' +\r\n");
      out.write("			 	  '<td class=\"tdCenter1\">' + dataList8[i].report_reported_name +'(' +dataList8[i].report_reported_id + ')' +  '</td>' +\r\n");
      out.write("			 	  '<td class=\"tdCenter1\">'+\r\n");
      out.write("			 	  '<button type=\"button\" class=\"tdcenter1_btn1\" onclick=\"location.href=\\'/updateReportUserRole?user_id='+dataList8[i].report_reported_id+'&report_num='+dataList8[i].report_num+'&report_lesson_num='+dataList8[i].report_lesson_num+'\\'\">계정 정지</button>'+\r\n");
      out.write("			 	  '<button type=\"button\" class=\"tdcenter1_btn2\" onclick=\"location.href=\\'/updateReportReject?report_num='+dataList8[i].report_num+'\\'\">신고 반려</button></td>'+\r\n");
      out.write("			 	  '<td class=\"tdCenter1\"><button type=\"button\" class=\"tdcenter1_btn3\" onclick=\"hsh(\\'' + dataList8[i].report_cont +'\\');\">자세히보기</button>'+'</tr><hr>';\r\n");
      out.write("		}    \r\n");
      out.write(" 	}\r\n");
      out.write("   if( typeof chartHtml8 == \"undefined\" || chartHtml8 == ''){ chartHtml8 +=\" <id='if_undefined'><span>처리할 신고가 없습니다.<span></div>\"}\r\n");
      out.write("   console.log(chartHtml8);\r\n");
      out.write(" $(\"#dataTableBody8\").html(chartHtml8);\r\n");
      out.write(" }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" function paging8(totalData8, dataPerPage8, pageCount8, currentPage8) {\r\n");
      out.write(" 	  console.log(\"currentPage : \" + currentPage8);\r\n");
      out.write("\r\n");
      out.write(" 	  totalPage8 = Math.ceil(totalData8 / dataPerPage8); //총 페이지 수\r\n");
      out.write("	  \r\n");
      out.write(" 	  if(totalPage8<pageCount8){\r\n");
      out.write("	   pageCount8=totalPage8;\r\n");
      out.write("	  }\r\n");
      out.write("	  \r\n");
      out.write(" 	  let pageGroup8 = Math.ceil(currentPage8 / pageCount8); // 페이지 그룹\r\n");
      out.write("	  let endPage8 = pageGroup8 * pageCount8; //화면에 보여질 마지막 페이지 번호\r\n");
      out.write("	  \r\n");
      out.write("	  if (endPage8 > totalPage8) {\r\n");
      out.write(" 	    endPage8 = totalPage8;\r\n");
      out.write("	  }\r\n");
      out.write("\r\n");
      out.write("	  let startPage8 = endPage8 - (pageCount8 - 1); //화면에 보여질 첫번째 페이지 번호\r\n");
      out.write("	  let next8 = Number(currentPage8)+1;\r\n");
      out.write("// 	  let next = endPage +1;\r\n");
      out.write("	  let prev8 = Number(currentPage8)-1;\r\n");
      out.write("// 	  let prev = startPage - 1;\r\n");
      out.write("\r\n");
      out.write("	  let pageHtml8 = \"\";\r\n");
      out.write("\r\n");
      out.write("	  if (prev8 > 0) {\r\n");
      out.write("	    pageHtml8 += \"<li><a href='javascript:void(0)' id='prev8'> 이전 </a></li>\";\r\n");
      out.write("	  }\r\n");
      out.write("\r\n");
      out.write(" 	 //페이징 번호 표시 \r\n");
      out.write("	  for (var i = startPage8; i <= endPage8; i++) {\r\n");
      out.write("	    if (currentPage8 == i) {\r\n");
      out.write("	      pageHtml8 +=\r\n");
      out.write("	        '<li class=\"on\"><a href=\"javascript:void(0)\" id=\"' + i + '\">' + i + '</a></li>';\r\n");
      out.write("// 	        '<li class=\"on\"><a href=\"javascript:displayData('+2+',5)\" id=\"' + i + '\">' + i + '</a></li>';\r\n");
      out.write("	    } else {\r\n");
      out.write("	      pageHtml8 += \"<li><a href='javascript:void(0)' id='\" + i + \"'>\" + i + \"</a></li>\";\r\n");
      out.write("	    }\r\n");
      out.write("	  }\r\n");
      out.write("	 \r\n");
      out.write("	  if (next8 <= totalPage8) {\r\n");
      out.write("	    pageHtml8 += '<li><a href=\"javascript:void(0);\" id=\"next8\"> 다음 </a></li>';\r\n");
      out.write("	  }\r\n");
      out.write("\r\n");
      out.write("	  $(\"#pagingul8\").html(pageHtml8);\r\n");
      out.write("	  \r\n");
      out.write("\r\n");
      out.write("	  //페이징 번호 클릭 이벤트 \r\n");
      out.write(" 	  $(\"#pagingul8 li a\").click(function () {\r\n");
      out.write("	    let $id8 = $(this).attr(\"id\");\r\n");
      out.write("	    selectedPage8 = $(this).text();\r\n");
      out.write("\r\n");
      out.write("	    if ($id8 == \"next8\") selectedPage8 = next8;\r\n");
      out.write("	    if ($id8 == \"prev8\") selectedPage8 = prev8;\r\n");
      out.write("	    \r\n");
      out.write("	    \r\n");
      out.write("	    //전역변수에 선택한 페이지 번호를 담는다...\r\n");
      out.write("	    globalCurrentPage8 = selectedPage8;\r\n");
      out.write("	 \r\n");
      out.write("	    console.log(\"클릭시 글로벌 \"+globalCurrentPage8);\r\n");
      out.write("	    \r\n");
      out.write("	    //글 목록 표시 재호출\r\n");
      out.write("	    displayData8(globalCurrentPage8, dataPerPage8);\r\n");
      out.write("	    //페이징 표시 재호출\r\n");
      out.write("	    paging8(totalData8, dataPerPage8, pageCount8, globalCurrentPage8);\r\n");
      out.write("	  });\r\n");
      out.write("	  \r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("var totalData9; //총 데이터 수\r\n");
      out.write("var dataPerPage9=5; //한 페이지에 나타낼 글 수\r\n");
      out.write("var pageCount9 = 5; //한 번에 나타낼 페이지 수 ([이전] 1 2 3 4 5 [다음])\r\n");
      out.write("var globalCurrentPage9= 1; //현재 페이지\r\n");
      out.write("var dataList9; //데이터 리스트\r\n");
      out.write(" \r\n");
      out.write("$(document).ready(function () {\r\n");
      out.write("\r\n");
      out.write("     //totalData(총 데이터 수) 구하기\r\n");
      out.write("	 dataList9 = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${BlackListJSON}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(";		\r\n");
      out.write("     \r\n");
      out.write("     //totalData(총 데이터 수) 구하기\r\n");
      out.write("	 totalData9 = dataList9.length;\r\n");
      out.write("     \r\n");
      out.write("     displayData9(1, dataPerPage9);\r\n");
      out.write("     paging9(totalData9, dataPerPage9, pageCount9, 1);\r\n");
      out.write("});\r\n");
      out.write(" \r\n");
      out.write("//현재 페이지(currentPage)와 페이지당 글 개수(dataPerPage) 반영\r\n");
      out.write("function displayData9(currentPage9, dataPerPage9) {\r\n");
      out.write("\r\n");
      out.write("  let chartHtml9 = \"\";\r\n");
      out.write("\r\n");
      out.write("//Number로 변환하지 않으면 아래에서 +를 할 경우 스트링 결합이 되어버림.. \r\n");
      out.write("  currentPage9 = Number(currentPage9);\r\n");
      out.write("  dataPerPage9 = Number(dataPerPage9);\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write(" if (totalData9 < (currentPage9 - 1) * dataPerPage9 + dataPerPage9){\r\n");
      out.write("	\r\n");
      out.write("	  for (\r\n");
      out.write("		var i = (currentPage9 - 1) * dataPerPage9;\r\n");
      out.write("		    i < totalData9;\r\n");
      out.write("			     i++\r\n");
      out.write("			   ) {\r\n");
      out.write("		  chartHtml9 +=\r\n");
      out.write("		 	  '<tr><td class=\"tdCenter1\">' + dataList9[i].user_id + '</td>' +\r\n");
      out.write("			  '<td class=\"tdCenter1\">' + dataList9[i].user_name + '</td>'+\r\n");
      out.write("		 	  '<td class=\"tdCenter1\">' + dataList9[i].report_cont + '</td>' +\r\n");
      out.write("		 	  '<td class=\"tdCenter1\">' + dataList9[i].report_date + '</td>' +\r\n");
      out.write("		 	  '<td class=\"tdCenter1\">'+ \r\n");
      out.write("		 	  '<button type=\"button\" class=\"tdcenter1_btn1\" onclick=\"location.href=\\'/resetUserRole?report_num='+ dataList9[i].report_num+'&user_id='+dataList9[i].user_id+'\\'\">계정복구</button></tr>';\r\n");
      out.write("			   } \r\n");
      out.write(" }else{ \r\n");
      out.write("  \r\n");
      out.write("  for (\r\n");
      out.write("    var i = (currentPage9 - 1) * dataPerPage9;\r\n");
      out.write("    i < (currentPage9 - 1) * dataPerPage9 + dataPerPage9;\r\n");
      out.write("    i++\r\n");
      out.write("  ) {\r\n");
      out.write("	  chartHtml9 +=\r\n");
      out.write("		  '<tr><td class=\"tdCenter1\">' + dataList9[i].user_id + '</td>' +\r\n");
      out.write("		  '<td class=\"tdCenter1\">' + dataList9[i].user_name + '</td>'+\r\n");
      out.write("	 	  '<td class=\"tdCenter1\">' + dataList9[i].report_cont + '</td>' +\r\n");
      out.write("	 	  '<td class=\"tdCenter1\">' + dataList9[i].report_date + '</td>' +\r\n");
      out.write("	 	  '<td class=\"tdCenter1\">'+ \r\n");
      out.write("	 	  '<button type=\"button\" class=\"tdcenter1_btn1\" onclick=\"location.href=\\'/resetUserRole?report_num='+ dataList9[i].report_num+'&user_id='+dataList9[i].user_id+'\\'\">계정복구</button></tr>';\r\n");
      out.write("  } //dataList는 임의의 데이터임.. 각 소스에 맞게 변수를 넣어주면 됨...\r\n");
      out.write("  \r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write(" if( typeof chartHtml9 == \"undefined\" || chartHtml9 == ''){ chartHtml9 +=\"<div id='if_undefined'>블랙리스트에 등록된 회원이 없습니다.</div>\"}\r\n");
      out.write("\r\n");
      out.write("$(\"#data_table_body9\").html(chartHtml9);\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write("function paging9(totalData9, dataPerPage9, pageCount9, currentPage9) {\r\n");
      out.write("\r\n");
      out.write("	  totalPage9 = Math.ceil(totalData9 / dataPerPage9); //총 페이지 수\r\n");
      out.write("	  \r\n");
      out.write("	  if(totalPage9<pageCount9){\r\n");
      out.write("	    pageCount9=totalPage9;\r\n");
      out.write("	  }\r\n");
      out.write("	  \r\n");
      out.write("	  let pageGroup9 = Math.ceil(currentPage9 / pageCount9); // 페이지 그룹\r\n");
      out.write("	  let endPage9 = pageGroup9 * pageCount9; //화면에 보여질 마지막 페이지 번호\r\n");
      out.write("	  \r\n");
      out.write("	  if (endPage9 > totalPage9) {\r\n");
      out.write("	    endPage9 = totalPage9;\r\n");
      out.write("	  }\r\n");
      out.write("\r\n");
      out.write("	  let startPage9 = endPage9 - (pageCount9 - 1); //화면에 보여질 첫번째 페이지 번호\r\n");
      out.write("	  let next9 = Number(currentPage9)+1;\r\n");
      out.write("//	  let next = endPage +1;\r\n");
      out.write("	  let prev9 = Number(currentPage9)-1;\r\n");
      out.write("//	  let prev = startPage - 1;\r\n");
      out.write("\r\n");
      out.write("	  let pageHtml9 = \"\";\r\n");
      out.write("\r\n");
      out.write("	  if (prev9 > 0) {\r\n");
      out.write("	    pageHtml9 += \"<li><a href='javascript:void(0)' id='prev9'> 이전 </a></li>\";\r\n");
      out.write("	  }\r\n");
      out.write("\r\n");
      out.write("	 //페이징 번호 표시 \r\n");
      out.write("	  for (var i = startPage9; i <= endPage9; i++) {\r\n");
      out.write("	    if (currentPage9 == i) {\r\n");
      out.write("	      pageHtml9 +=\r\n");
      out.write("	        '<li class=\"on\"><a href=\"javascript:void(0)\" id=\"' + i + '\">' + i + '</a></li>';\r\n");
      out.write("//	        '<li class=\"on\"><a href=\"javascript:displayData('+2+',5)\" id=\"' + i + '\">' + i + '</a></li>';\r\n");
      out.write("	    } else {\r\n");
      out.write("	      pageHtml9 += \"<li><a href='javascript:void(0)' id='\" + i + \"'>\" + i + \"</a></li>\";\r\n");
      out.write("	    }\r\n");
      out.write("	  }\r\n");
      out.write("	 \r\n");
      out.write("	 \r\n");
      out.write("	  if (next9 <= totalPage9) {\r\n");
      out.write("	    pageHtml9 += '<li><a href=\"javascript:void(0);\" id=\"next9\"> 다음 </a></li>';\r\n");
      out.write("	  }\r\n");
      out.write("\r\n");
      out.write("	  $(\"#pagingul9\").html(pageHtml9);\r\n");
      out.write("\r\n");
      out.write("	  //페이징 번호 클릭 이벤트 \r\n");
      out.write("	  $(\"#pagingul9 li a\").click(function () {\r\n");
      out.write("	    let $id9 = $(this).attr(\"id\");\r\n");
      out.write("	    selectedPage9 = $(this).text();\r\n");
      out.write("\r\n");
      out.write("	    if ($id9 == \"next9\") selectedPage9 = next9;\r\n");
      out.write("	    if ($id9 == \"prev9\") selectedPage9 = prev9;\r\n");
      out.write("	    \r\n");
      out.write("	    \r\n");
      out.write("	    //전역변수에 선택한 페이지 번호를 담는다...\r\n");
      out.write("	    globalCurrentPage9 = selectedPage9;\r\n");
      out.write("	 \r\n");
      out.write("	    console.log(\"클릭시 글로벌 \"+globalCurrentPage9);\r\n");
      out.write("	    \r\n");
      out.write("	    //글 목록 표시 재호출\r\n");
      out.write("	    displayData9(globalCurrentPage9, dataPerPage9);\r\n");
      out.write("	    //페이징 표시 재호출\r\n");
      out.write("	    paging9(totalData9, dataPerPage9, pageCount9, globalCurrentPage9);\r\n");
      out.write("	  });\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("$(\"#sel3\").click(function(){\r\n");
      out.write("	\r\n");
      out.write("	var search_condition=$('#sel1').val();\r\n");
      out.write("	var search_keyword=$('#sel2').val();\r\n");
      out.write("	\r\n");
      out.write("	$.ajax({ // ajax로 데이터 가져오기\r\n");
      out.write("		method: \"POST\",\r\n");
      out.write("		url: \"/searchBlackList\",\r\n");
      out.write("	 	data: {search_condition:search_condition, search_keyword:search_keyword},\r\n");
      out.write("		dataType: \"json\",\r\n");
      out.write("		async:false,\r\n");
      out.write("		success: function (data) {\r\n");
      out.write("//		 		alert(\"data: \" + JSON.stringify(data));\r\n");
      out.write("		   //totalData(총 데이터 수) 구하기\r\n");
      out.write("		   totalData9 = data.length;\r\n");
      out.write("	       //데이터 대입\r\n");
      out.write("	       dataList9=data;\r\n");
      out.write("	\r\n");
      out.write("	       if(typeof totalData9 == \"undefined\" || totalData9 == null || totalData9 == \"\"){ alert(\"검색결과가 없습니다.\");}	\r\n");
      out.write("			 }\r\n");
      out.write("	 });		\r\n");
      out.write("	\r\n");
      out.write("	 //글 목록 표시 재호출\r\n");
      out.write("    displayData9(1, 5);\r\n");
      out.write("    //페이징 표시 재호출\r\n");
      out.write("    paging9(totalData9, 5, pageCount9, 1);\r\n");
      out.write("    \r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
