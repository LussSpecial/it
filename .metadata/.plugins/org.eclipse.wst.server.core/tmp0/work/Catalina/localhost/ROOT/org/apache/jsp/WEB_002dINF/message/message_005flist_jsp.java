/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.74
 * Generated at: 2023-05-23 08:43:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.message;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class message_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>꿀TIPer - Message</title>\r\n");
      out.write("\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\"\r\n");
      out.write("	integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("<!-- CSS File -->\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/front/message.css\" rel=\"stylesheet\">\r\n");
      out.write("<!-- <link href=\"./resources/css/navbar.css\" rel=\"stylesheet\"> -->\r\n");
      out.write("\r\n");
      out.write("<!-- 메세지 전송 아이콘(종이비행기) 때문에 필요 -->\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css\"\r\n");
      out.write("	type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-latest.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<!-- 메뉴바 \r\n");
      out.write("       현재페이지 뭔지 param.thisPage에 넣어서 navbar.jsp에  던짐 -->\r\n");
      out.write("	");
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"msg-container\">\r\n");
      out.write("		<div class=\"messaging\">\r\n");
      out.write("			<div class=\"inbox_msg\">\r\n");
      out.write("				<!-- 메세지 목록 영역 -->\r\n");
      out.write("				<div class=\"inbox_people\">\r\n");
      out.write("					<div class=\"headind_srch\">\r\n");
      out.write("						<div class=\"recent_heading\">\r\n");
      out.write("							<h4>Message</h4>\r\n");
      out.write("							<img onerror=\"this.src='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/front/default.png'\" title=\"새로고침\" alt=\"message reload\" class=\"msg_list_reload\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/front/reload.png\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<!-- 메세지 검색 -->\r\n");
      out.write("						<div class=\"srch_bar\">\r\n");
      out.write("							<div class=\"stylish-input-group\">\r\n");
      out.write("								<input id=\"search_id\" type=\"text\" class=\"search-bar\"\r\n");
      out.write("									placeholder=\"ID검색\"> <span class=\"input-group-addon\">\r\n");
      out.write("									<i class=\"fa fa-search\" aria-hidden=\"true\"></i>\r\n");
      out.write("								</span>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<!-- 메세지 리스트 -->\r\n");
      out.write("					<div class=\"inbox_chat\"></div>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<!-- 메세지 내용 영역 -->\r\n");
      out.write("				<div class=\"mesgs\">\r\n");
      out.write("					<!-- 메세지 내용 목록 -->\r\n");
      out.write("					<div class=\"msg_history\" name=\"contentList\">\r\n");
      out.write("						<!-- 메세지 내용이 올 자리 -->\r\n");
      out.write("					</div>\r\n");
      out.write("<!-- 					<div class=\"modal_price_input\"> -->\r\n");
      out.write("<!-- 						<div style='display: none' id='price_modal' data-backdrop='static' -->\r\n");
      out.write("<!-- 							class='modal'> -->\r\n");
      out.write("<!-- 							<select class=\"escrow_lesson_title\" name=\"lesson_num\" size=\"1\" -->\r\n");
      out.write("<!-- 								required=\"required\"> -->\r\n");
      out.write("<!-- 							</select> -->\r\n");
      out.write("<!-- 							<button class=\"modal_close\" type=\"button\"> -->\r\n");
      out.write("<!-- 								<i class=\"fa fa-close\" aria-hidden=\"true\"></i> -->\r\n");
      out.write("<!-- 							</button> -->\r\n");
      out.write("<!-- 							<p class='price_p'>아래 입력란에 협의된 포인트를 입력해주세요.</p> -->\r\n");
      out.write("<!-- 							<input required=\"required\" autofocus id='price_modal_input' class='price_input' type='number' -->\r\n");
      out.write("<!-- 								placeholder='&nbsp;숫자만 입력 가능합니다.'> -->\r\n");
      out.write("<!-- 							<button id='price_send_btn' type='button'> -->\r\n");
      out.write("<!-- 								<i class='fa fa-paper-plane-o' aria-hidden='true'></i> -->\r\n");
      out.write("<!-- 							</button> -->\r\n");
      out.write("<!-- 						</div> -->\r\n");
      out.write("<!-- 					</div> -->\r\n");
      out.write("					<div class=\"send_message\">\r\n");
      out.write("						<!-- 메세지 입력란이 올자리 -->\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<script>\r\n");
      out.write("	\r\n");
      out.write("	var child_value;\r\n");
      out.write("\r\n");
      out.write("    function child_function(){\r\n");
      out.write("		let send_btn = child_value_send_btn;\r\n");
      out.write("        FirstMessageList(send_btn);\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    // opener 로 부모창에 접근하여 popup이라는 자식창 속성을 주입\r\n");
      out.write("    // (부모창에 popup 변수 선언 안해도 사용 가능) \r\n");
      out.write("    opener.popup = this;\r\n");
      out.write("    \r\n");
      out.write("	// 가장 처음 메세지 리스트를 가져온다.\r\n");
      out.write("	const FirstMessageList = function(send_btn){\r\n");
      out.write("		$.ajax({\r\n");
      out.write("			url:\"message_ajax_list\",\r\n");
      out.write("			method:\"get\",\r\n");
      out.write("			data:{\r\n");
      out.write("				send_btn : send_btn\r\n");
      out.write("			},\r\n");
      out.write("			success:function(data){\r\n");
      out.write("				console.log(\"메세지 리스트 리로드 성공\");\r\n");
      out.write("				console.log('data: ',data);\r\n");
      out.write("				$('.inbox_chat').html(data.replaceAll(\"[<@전수일>]\",\"<p class='start_date'>꿀TIP 전수일<br>\").replaceAll(\"[<@강의명>]\", \"</p><pre class='lesson_title'><svg xmlns='http://www.w3.org/2000/svg' width='16' height='16' fill='currentColor' class='bi bi-receipt-cutoff' viewBox='0 0 16 16'><path d='M3 4.5a.5.5 0 0 1 .5-.5h6a.5.5 0 1 1 0 1h-6a.5.5 0 0 1-.5-.5zm0 2a.5.5 0 0 1 .5-.5h6a.5.5 0 1 1 0 1h-6a.5.5 0 0 1-.5-.5zm0 2a.5.5 0 0 1 .5-.5h6a.5.5 0 1 1 0 1h-6a.5.5 0 0 1-.5-.5zm0 2a.5.5 0 0 1 .5-.5h6a.5.5 0 0 1 0 1h-6a.5.5 0 0 1-.5-.5zm0 2a.5.5 0 0 1 .5-.5h6a.5.5 0 0 1 0 1h-6a.5.5 0 0 1-.5-.5zM11.5 4a.5.5 0 0 0 0 1h1a.5.5 0 0 0 0-1h-1zm0 2a.5.5 0 0 0 0 1h1a.5.5 0 0 0 0-1h-1zm0 2a.5.5 0 0 0 0 1h1a.5.5 0 0 0 0-1h-1zm0 2a.5.5 0 0 0 0 1h1a.5.5 0 0 0 0-1h-1zm0 2a.5.5 0 0 0 0 1h1a.5.5 0 0 0 0-1h-1z'/><path d='M2.354.646a.5.5 0 0 0-.801.13l-.5 1A.5.5 0 0 0 1 2v13H.5a.5.5 0 0 0 0 1h15a.5.5 0 0 0 0-1H15V2a.5.5 0 0 0-.053-.224l-.5-1a.5.5 0 0 0-.8-.13L13 1.293l-.646-.647a.5.5 0 0 0-.708 0L11 1.293l-.646-.647a.5.5 0 0 0-.708 0L9 1.293 8.354.646a.5.5 0 0 0-.708 0L7 1.293 6.354.646a.5.5 0 0 0-.708 0L5 1.293 4.354.646a.5.5 0 0 0-.708 0L3 1.293 2.354.646zm-.217 1.198.51.51a.5.5 0 0 0 .707 0L4 1.707l.646.647a.5.5 0 0 0 .708 0L6 1.707l.646.647a.5.5 0 0 0 .708 0L8 1.707l.646.647a.5.5 0 0 0 .708 0L10 1.707l.646.647a.5.5 0 0 0 .708 0L12 1.707l.646.647a.5.5 0 0 0 .708 0l.509-.51.137.274V15H2V2.118l.137-.274z'/></svg>견적서<br>\").replaceAll(\"[<@/강의명>]\", \"</pre>\").replaceAll(\"[<@가격>]\", \"<br><p class='lesson_price'>\").replaceAll(\"[<@/전수일>]\", \"<br>\").replaceAll(\"[<@/가격|버튼>]\", \"</p><button type='button' class='accept_btn'>수락하기</button><input class='escrow_lesson_num' type='hidden' value='\").replaceAll(\"[<@/버튼|코드>]\", \"'><input class='escrow_tiper_code' type='hidden' value='\").replaceAll(\"[<@/코드>]\", \"'><input class='escrow_status' value='\").replaceAll(\"[<@status>]\",\"' style='display: none;'>\"));\r\n");
      out.write("// 				$('.inbox_chat').html(data.replaceAll('&lt;','<').replaceAll('&gt;','>'));\r\n");
      out.write("// 				console.log(\"data : \"+data);\r\n");
      out.write("// 				$('.lesson_title').prepend('<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-receipt-cutoff\" viewBox=\"0 0 16 16\"><path d=\"M3 4.5a.5.5 0 0 1 .5-.5h6a.5.5 0 1 1 0 1h-6a.5.5 0 0 1-.5-.5zm0 2a.5.5 0 0 1 .5-.5h6a.5.5 0 1 1 0 1h-6a.5.5 0 0 1-.5-.5zm0 2a.5.5 0 0 1 .5-.5h6a.5.5 0 1 1 0 1h-6a.5.5 0 0 1-.5-.5zm0 2a.5.5 0 0 1 .5-.5h6a.5.5 0 0 1 0 1h-6a.5.5 0 0 1-.5-.5zm0 2a.5.5 0 0 1 .5-.5h6a.5.5 0 0 1 0 1h-6a.5.5 0 0 1-.5-.5zM11.5 4a.5.5 0 0 0 0 1h1a.5.5 0 0 0 0-1h-1zm0 2a.5.5 0 0 0 0 1h1a.5.5 0 0 0 0-1h-1zm0 2a.5.5 0 0 0 0 1h1a.5.5 0 0 0 0-1h-1zm0 2a.5.5 0 0 0 0 1h1a.5.5 0 0 0 0-1h-1zm0 2a.5.5 0 0 0 0 1h1a.5.5 0 0 0 0-1h-1z\"/><path d=\"M2.354.646a.5.5 0 0 0-.801.13l-.5 1A.5.5 0 0 0 1 2v13H.5a.5.5 0 0 0 0 1h15a.5.5 0 0 0 0-1H15V2a.5.5 0 0 0-.053-.224l-.5-1a.5.5 0 0 0-.8-.13L13 1.293l-.646-.647a.5.5 0 0 0-.708 0L11 1.293l-.646-.647a.5.5 0 0 0-.708 0L9 1.293 8.354.646a.5.5 0 0 0-.708 0L7 1.293 6.354.646a.5.5 0 0 0-.708 0L5 1.293 4.354.646a.5.5 0 0 0-.708 0L3 1.293 2.354.646zm-.217 1.198.51.51a.5.5 0 0 0 .707 0L4 1.707l.646.647a.5.5 0 0 0 .708 0L6 1.707l.646.647a.5.5 0 0 0 .708 0L8 1.707l.646.647a.5.5 0 0 0 .708 0L10 1.707l.646.647a.5.5 0 0 0 .708 0L12 1.707l.646.647a.5.5 0 0 0 .708 0l.509-.51.137.274V15H2V2.118l.137-.274z\"/></svg>');\r\n");
      out.write("				\r\n");
      out.write("				// 메세지 리스트중 하나를 클릭했을 때\r\n");
      out.write("				$('.chat_list').on('click', function(){\r\n");
      out.write("					//alert('room : '+ $(this).attr('message_room'));\r\n");
      out.write("// 					$('.chat_ib svg').remove();\r\n");
      out.write("					let message_room = $(this).attr('message_room');\r\n");
      out.write("					let other_user_id = $(this).attr('other-user_id'); //**ohter-nick\r\n");
      out.write("					let user_role = $(this).attr('user_role');\r\n");
      out.write("					console.log('user_role',user_role);\r\n");
      out.write("					\r\n");
      out.write("					\r\n");
      out.write("					// 선택한 메세지빼고 나머지는 active 효과 해제하기\r\n");
      out.write("					$('.chat_list_box').not('.chat_list_box.chat_list_box'+message_room).removeClass('active_chat');\r\n");
      out.write("					// 선택한 메세지만 active 효과 주기\r\n");
      out.write("					$('.chat_list_box'+message_room).addClass('active_chat');\r\n");
      out.write("					\r\n");
      out.write("					let send_msg = \"\";\r\n");
      out.write("					send_msg +=\"<div class='type_msg'>\";\r\n");
      out.write("			      	send_msg +=\"<div class='input_msg_write row'>\";\r\n");
      out.write("			      	if($(this).attr('other-user_id')== 'admin'){\r\n");
      out.write("				      	send_msg +=\"<div class='col-11'>\";\r\n");
      out.write("				      	send_msg +=\"<textarea id='admin_msg' class='write_msg form-control' maxlength='800' color='red' readonly='readonly'>&nbsp;여왕벌은 메세지를 받을 수 없어요.</textarea>\";\r\n");
      out.write("				      	send_msg +=\"</div>\";\r\n");
      out.write("				      	send_msg +=\"<div class='col-1'>\";\r\n");
      out.write("// 				      	send_msg +=\"<button class='msg_send_btn' disabled='disabled' type='button'><i class='fa fa-paper-plane-o' aria-hidden='true'></i></button>\";\r\n");
      out.write("				      	send_msg +=\"</div>\";\r\n");
      out.write("			      	}else{\r\n");
      out.write("// 			      		send_msg +=\"<button class='msg_send_btn' type='button'><i class='fa fa-paper-plane-o' aria-hidden='true'></i></button>\";\r\n");
      out.write("			      		send_msg +=\"<div class='col-11'>\";\r\n");
      out.write("				      	\r\n");
      out.write("				      	//가격 입력창 띄우는 버튼\r\n");
      out.write("						if(user_role == 1){\r\n");
      out.write("					      	send_msg +=\"<button title='견적보내기' id='price_btn' type='button' class='btn btn-secondary'>\";\r\n");
      out.write("					      	send_msg +=\"<svg xmlns='http://www.w3.org/2000/svg' width='16' height='16' fill='currentColor' class='bi bi-calculator' viewBox='0 0 16 16'>\";\r\n");
      out.write("					      	send_msg +=\"<path d='M12 1a1 1 0 0 1 1 1v12a1 1 0 0 1-1 1H4a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1h8zM4 0a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h8a2 2 0 0 0 2-2V2a2 2 0 0 0-2-2H4z'></path>\";\r\n");
      out.write("					      	send_msg +=\"<path d='M4 2.5a.5.5 0 0 1 .5-.5h7a.5.5 0 0 1 .5.5v2a.5.5 0 0 1-.5.5h-7a.5.5 0 0 1-.5-.5v-2zm0 4a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5v1a.5.5 0 0 1-.5.5h-1a.5.5 0 0 1-.5-.5v-1zm0 3a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5v1a.5.5 0 0 1-.5.5h-1a.5.5 0 0 1-.5-.5v-1zm0 3a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5v1a.5.5 0 0 1-.5.5h-1a.5.5 0 0 1-.5-.5v-1zm3-6a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5v1a.5.5 0 0 1-.5.5h-1a.5.5 0 0 1-.5-.5v-1zm0 3a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5v1a.5.5 0 0 1-.5.5h-1a.5.5 0 0 1-.5-.5v-1zm0 3a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5v1a.5.5 0 0 1-.5.5h-1a.5.5 0 0 1-.5-.5v-1zm3-6a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5v1a.5.5 0 0 1-.5.5h-1a.5.5 0 0 1-.5-.5v-1zm0 3a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5v4a.5.5 0 0 1-.5.5h-1a.5.5 0 0 1-.5-.5v-4z'></path>\";\r\n");
      out.write("					      	send_msg +=\"</svg>\";\r\n");
      out.write("					      	send_msg +=\"</button>\";\r\n");
      out.write("						}				      	\r\n");
      out.write("					      	send_msg +=\"<textarea class='write_msg form-control' autofocus maxlength='800' placeholder='&nbsp;메세지를 입력해주세요.&#13;&#10;&nbsp;800자까지 전송 가능합니다.'></textarea>\";\r\n");
      out.write("					      	send_msg +=\"<button class='msg_send_btn' type='button'><i class='fa fa-paper-plane-o' aria-hidden='true'></i></button>\";\r\n");
      out.write("					      	send_msg +=\"</div>\";\r\n");
      out.write("					      	\r\n");
      out.write("					      	send_msg +=\"<div class='modal_price_input'>\";\r\n");
      out.write("						      	send_msg +=\"<div style='display: none' id='price_modal' data-backdrop='static' class='modal'>\";\r\n");
      out.write("							      	send_msg +=\"<select class='escrow_lesson_title' name='lesson_num' size='1' required='required'></select>\";\r\n");
      out.write("							      	send_msg +=\"<label class='escrow_start_lb' for='escrow_start'>꿀TIP 전수할 날짜:</label>\";\r\n");
      out.write("							      	send_msg +=\"<input max='2123-12-31' type='date' id='escrow_start' class='escrow_start' required='required'>\";\r\n");
      out.write("							      	send_msg +=\"<button class='modal_close' type='button'><i class='fa fa-close' aria-hidden='true'></i></button>\";\r\n");
      out.write("							      	send_msg +=\"<div class='price_send_div'>\";\r\n");
      out.write("							      	send_msg +=\"<p class='price_p'>아래 입력란에 제시할 허니페이를<br>입력해주세요.</p>\";\r\n");
      out.write("							      	send_msg +=\"<div class='price_input_div'>\";\r\n");
      out.write("							      	send_msg +=\"<input onKeyup='this.value=this.value.replace(/[^-0-9]/g,&#39;&#39;)' autofocus id='price_modal_input' class='price_input' placeholder='&nbsp;숫자만 입력 가능합니다.'>\";\r\n");
      out.write("							      	send_msg +=\"<button id='price_send_btn' type='button'><i class='fa fa-paper-plane-o' aria-hidden='true'></i></button>\";\r\n");
      out.write("							      	send_msg +=\"</div>\";\r\n");
      out.write("							      	send_msg +=\"</div>\";\r\n");
      out.write("						      	send_msg +=\"</div>\";\r\n");
      out.write("					      	send_msg +=\"</div>\";\r\n");
      out.write("					      	\r\n");
      out.write("// 					      	send_msg +=\"<div class='col-1'>\";\r\n");
      out.write("// 					      	send_msg +=\"<button class='msg_send_btn' type='button'><i class='fa fa-paper-plane-o' aria-hidden='true'></i></button>\";\r\n");
      out.write("// 					      	send_msg +=\"</div>\";\r\n");
      out.write("			      	}\r\n");
      out.write("			      	send_msg +=\"</div>\";\r\n");
      out.write("			      	send_msg +=\"</div>\";\r\n");
      out.write("\r\n");
      out.write("					// 메세지 입력, 전송 칸을 보인다.\r\n");
      out.write("					$('.send_message').html(send_msg);\r\n");
      out.write("					$('.write_msg').focus();\r\n");
      out.write("					\r\n");
      out.write("					// 일반회원과 admin인 경우 메세지입력창 키움\r\n");
      out.write("					if(user_role == 0 || user_role == 2){\r\n");
      out.write("			      		var isMobile = /Android|webOS|iPhone|iPad|iPod|BlackBerry/i.test(navigator.userAgent) ? true : false;\r\n");
      out.write("\r\n");
      out.write("							if(isMobile) {\r\n");
      out.write("								$('.write_msg').width('240px');\r\n");
      out.write("								$(\".msg_history\").scrollTop($(\".msg_history\")[0].scrollHeight);\r\n");
      out.write("							}else{\r\n");
      out.write("								$('.write_msg').width('350px');\r\n");
      out.write("								$(\".msg_history\").scrollTop($(\".msg_history\")[0].scrollHeight);\r\n");
      out.write("							}\r\n");
      out.write("					}\r\n");
      out.write("					\r\n");
      out.write("					// 메세지 전송버튼을 눌렀을 때\r\n");
      out.write("					$('.msg_send_btn').on('click',function(){\r\n");
      out.write("						// 메세지 전송 함수 호출\r\n");
      out.write("						SendMessage(message_room, other_user_id, send_btn);\r\n");
      out.write("					});\r\n");
      out.write("					\r\n");
      out.write("					$('#price_send_btn').on('click',function(){\r\n");
      out.write("						SendPrice(message_room, other_user_id, send_btn);\r\n");
      out.write("					});\r\n");
      out.write("					\r\n");
      out.write("					$('#price_btn').on('click',function(){\r\n");
      out.write("						select_lesson(message_room, other_user_id, send_btn);\r\n");
      out.write("					});\r\n");
      out.write("					\r\n");
      out.write("					$('.msg_list_reload').click(function(){\r\n");
      out.write("						MessageList(message_room, other_user_id, send_btn);\r\n");
      out.write("					});\r\n");
      out.write("					\r\n");
      out.write("					// 메세지 내용을 불러오는 함수 호출\r\n");
      out.write("					MessageContentList(message_room, other_user_id, send_btn);\r\n");
      out.write("				});\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("	};\r\n");
      out.write("	</script>\r\n");
      out.write("	<!-- 외부 js -->\r\n");
      out.write("	<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/front/message.js\"></script>\r\n");
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
