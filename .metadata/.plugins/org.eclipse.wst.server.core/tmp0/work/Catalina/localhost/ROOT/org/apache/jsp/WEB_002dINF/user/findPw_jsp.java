/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.74
 * Generated at: 2023-05-21 11:11:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class findPw_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("<title>꿀TIPer - 비밀번호 찾기</title>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("   <link rel=\"stylesheet\" media=\"screen and (min-width:769px)\" href=\"front/user.css\">\r\n");
      out.write("   <link rel=\"stylesheet\" media=\"screen and (max-width:768px)\" href=\"front/userJoinMobile.css\">\r\n");
      out.write("   <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/front/userCertification.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("   .info_ptag {\r\n");
      out.write("      color: red;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("   <script>\r\n");
      out.write("      window.onload = function(){\r\n");
      out.write("         $(\".invalid-feedback\").hide();\r\n");
      out.write("         $(\"#telSuccess\").hide();\r\n");
      out.write("         $(\"#showPW\").hide();\r\n");
      out.write("         $(\".info_ptag\").hide();\r\n");
      out.write("      }\r\n");
      out.write("   </script>\r\n");
      out.write("   <div class=\"findId_cover login_wrap\">\r\n");
      out.write("       <div id=\"findId_wrap\" class=\"login_contents\">\r\n");
      out.write("         <div id=\"login_wrap\" class=\"findId_wrap_content findId_input_content\">\r\n");
      out.write("            <h3>비밀번호 변경</h3>\r\n");
      out.write("            <div id=\"telcertification\" class=\"form-input find_id_form_input\">\r\n");
      out.write("               <div class=\"login-input\">\r\n");
      out.write("                  <div class=\"login-input findId_inputName\">\r\n");
      out.write("                     <p>아이디</p>\r\n");
      out.write("                     <input type=\"text\" name=\"user_id\" id=\"user_id\" class=\"check\" placeholder=\"아이디를 입력해주세요.\" autofocus>\r\n");
      out.write("                     <p class=\"info_ptag\"></p>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <p>이메일</p>\r\n");
      out.write("                  <input type=\"text\" name=\"user_email\" id=\"user_email\" class=\"check\" placeholder=\"이메일을 입력하세요.\">\r\n");
      out.write("                  <button type=\"button\" id=\"telCheck\" class=\"btn_recive_num\" onclick=\"emailSend()\" disabled>인증번호받기</button>\r\n");
      out.write("                  <p class=\"info_ptag\"></p>\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"telConfirmDiv certification_cover\">\r\n");
      out.write("                  <input type=\"text\" id=\"certificationEmail\" placeholder=\"인증번호\">\r\n");
      out.write("                  <span class=\"time\"></span>\r\n");
      out.write("                  <button id=\"telConfirmBtn\" class=\"btn_chk\" onclick=\"smsConfirm()\">인증하기</button>\r\n");
      out.write("                  <p class=\"info_ptag\"></p>\r\n");
      out.write("                  <input type=\"hidden\" id=\"checkTel\" value=\"false\">\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("         <div id=\"showPW\" class=\"input_wrap findId_show_content\">\r\n");
      out.write("            <h4>비밀번호를 재설정해주세요</h4>\r\n");
      out.write("                  <p>비밀번호</p>\r\n");
      out.write("                  <input name=\"user_pw\" type=\"password\" id=\"user_pw\" class=\"check\" placeholder=\"비밀번호를 입력해주세요\" required>\r\n");
      out.write("                  <p class=\"info_ptag\"></p>\r\n");
      out.write("                  \r\n");
      out.write("                  <div>\r\n");
      out.write("                     <p>비밀번호 확인</p>\r\n");
      out.write("                     <input name=\"user_pw2\" type=\"password\" id=\"user_pw2\" class=\"check\" placeholder=\"비밀번호를 입력해주세요.\" required>\r\n");
      out.write("                     <p class=\"info_ptag\"></p>\r\n");
      out.write("                  </div>\r\n");
      out.write("            <div class=\"page_btn\">\r\n");
      out.write("               <button type=\"button\" onclick=\"updatePW()\">비밀번호 수정</button>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("         <div class=\"findId_show_content\">\r\n");
      out.write("            <button type=\"button\" onclick=\"javascript:history.go(-1)\" class=\"goBack_findId\">뒤로가기</button>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("      \r\n");
      out.write("      <script>\r\n");
      out.write("      function updatePW(){\r\n");
      out.write("         user = $(\"#user_id\").val();\r\n");
      out.write("         pw = $(\"#user_pw\").val();\r\n");
      out.write("         pwre = $(\"#user_pw2\").val();\r\n");
      out.write("         \r\n");
      out.write("         $.ajax({\r\n");
      out.write("            type : \"POST\",\r\n");
      out.write("            url : \"updatePW\",\r\n");
      out.write("            cache : false,\r\n");
      out.write("            data : {\r\n");
      out.write("               \"user_id\" : user,\r\n");
      out.write("               \"user_pw\" : pw,\r\n");
      out.write("               \"user_pw2\" : pwre\r\n");
      out.write("            },\r\n");
      out.write("            success : function(data) {\r\n");
      out.write("               alert(\"비밀번호가 수정되었습니다.\")\r\n");
      out.write("               location.replace(\"index\");\r\n");
      out.write("            }\r\n");
      out.write("         });\r\n");
      out.write("      }\r\n");
      out.write("      //이메일 전송함수\r\n");
      out.write("      var mailData = \"\";\r\n");
      out.write("      \r\n");
      out.write("      function emailSend() {\r\n");
      out.write("         let clientEmail = $(\"#user_email\").val();\r\n");
      out.write("         \r\n");
      out.write("         console.log('입력 이메일 ' + clientEmail);\r\n");
      out.write("         \r\n");
      out.write("            $.ajax({\r\n");
      out.write("               type : \"POST\",\r\n");
      out.write("               url : \"sendEmail\",\r\n");
      out.write("               async : false,\r\n");
      out.write("               data : {\r\n");
      out.write("                  \"user_email\" : clientEmail\r\n");
      out.write("               },\r\n");
      out.write("               success : function(data) {\r\n");
      out.write("                  console.log(\"data : \", data);\r\n");
      out.write("                  mailData = data;\r\n");
      out.write("                  $(\"#certificationEmail\").focus();\r\n");
      out.write("               },\r\n");
      out.write("               error : function(e) {\r\n");
      out.write("                  alert('오류입니다. 잠시 후 다시 시도햐주세요');\r\n");
      out.write("               }\r\n");
      out.write("            });\r\n");
      out.write("         }\r\n");
      out.write("      \r\n");
      out.write("      //이메일 인증번호 확인 함수\r\n");
      out.write("      function smsConfirm() {\r\n");
      out.write("         var confirmNum = $(\"#certificationEmail\").val();\r\n");
      out.write("         var sendNum = mailData;\r\n");
      out.write("         console.log('confirmNum',confirmNum);\r\n");
      out.write("         console.log('sendNum',sendNum);\r\n");
      out.write("         \r\n");
      out.write("         $.ajax({\r\n");
      out.write("            type : \"POST\",\r\n");
      out.write("            url : \"confirmNum\",\r\n");
      out.write("            data: {\r\n");
      out.write("               \"confirmNum\" : confirmNum,\r\n");
      out.write("               \"sendNum\" : sendNum\r\n");
      out.write("            },\r\n");
      out.write("            cache : false,\r\n");
      out.write("            success: function(data) {\r\n");
      out.write("               if (data.check == \"success\") { //controller에서 넘겨준 성공여부 코드\r\n");
      out.write("                  findUser();\r\n");
      out.write("               } else {\r\n");
      out.write("                  console.log(\"실패\");\r\n");
      out.write("               }\r\n");
      out.write("            },\r\n");
      out.write("            error: function(request, status) {\r\n");
      out.write("               alert(\"오류가 발생했습니다.\")\r\n");
      out.write("            }\r\n");
      out.write("         });\r\n");
      out.write("         \r\n");
      out.write("         mailData = \"\";\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      //회원확인절차 (findPW)\r\n");
      out.write("      function findUser() {\r\n");
      out.write("         var id = $(\"#user_id\").val();\r\n");
      out.write("         var email = $(\"#user_email\").val();\r\n");
      out.write("         \r\n");
      out.write("         $.ajax({\r\n");
      out.write("            type : \"POST\",\r\n");
      out.write("            url : \"findUserPW\",\r\n");
      out.write("            data : {\r\n");
      out.write("               \"user_id\" : id,\r\n");
      out.write("               \"user_email\" : email\r\n");
      out.write("            },\r\n");
      out.write("            async : false,\r\n");
      out.write("            cache : false,\r\n");
      out.write("            success : function(data) {\r\n");
      out.write("               if(data == \"true\") {\r\n");
      out.write("                  console.log(\"성공\");\r\n");
      out.write("                  $(\"#showPW\").show();\r\n");
      out.write("                  $(\"#login_wrap\").hide();\r\n");
      out.write("                  $(\".goBack_findId\").hide();\r\n");
      out.write("               }else{\r\n");
      out.write("                  console.log(\"일치하는 정보가 없습니다.\");\r\n");
      out.write("               }\r\n");
      out.write("            },\r\n");
      out.write("            error : function(request, status) {\r\n");
      out.write("               alert(\"일치하는 정보가 없습니다.\")\r\n");
      out.write("            }\r\n");
      out.write("         });\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      //유효성 검사\r\n");
      out.write("      $(\".check\").keyup (function(){\r\n");
      out.write("           var checkText = \"\";\r\n");
      out.write("           var thisVal = $(this).val();\r\n");
      out.write("           var idRegex = /^[0-9A-Za-z]{4,10}$/;\r\n");
      out.write("           var emailRegex =  /^[0-9a-zA-Z]([-_\\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\\.]?[0-9a-zA-Z])*\\.[a-zA-Z]{2,3}$/i;\r\n");
      out.write("         var passwordRegex = /^(?=.*[A-Za-z])(?=.*\\d)(?=.*[$@$!%*#?&])[A-Za-z\\d$@$!%*#?&]{8,}$/;\r\n");
      out.write("                     \r\n");
      out.write("              switch($(this).attr(\"name\")){\r\n");
      out.write("                  case \"user_id\":\r\n");
      out.write("                     if(thisVal == \"\") {\r\n");
      out.write("                        checkText = \"아이디를 입력해주세요\";\r\n");
      out.write("                        const target = document.getElementById('telCheck');\r\n");
      out.write("                       target.disabled = true;\r\n");
      out.write("                     }else if (thisVal.length != 0 && idRegex.test(thisVal) == false){\r\n");
      out.write("                        checkText = \"아이디는 영문, 숫자조합으로 최소4자, 최대 10자를 입력해주세요.\";\r\n");
      out.write("                        const target = document.getElementById('telCheck');\r\n");
      out.write("                       target.disabled = true;\r\n");
      out.write("                     }\r\n");
      out.write("                     break;\r\n");
      out.write("                     \r\n");
      out.write("                     \r\n");
      out.write("                  case \"user_email\":\r\n");
      out.write("                     if(thisVal.length == 0) {\r\n");
      out.write("                        checkText = \"이메일을 입력해주세요.\";\r\n");
      out.write("                        const target = document.getElementById('emailCheck');\r\n");
      out.write("                     target.disabled = true;\r\n");
      out.write("                     }else if (thisVal.length != 0 && emailRegex.test(thisVal) == false){\r\n");
      out.write("                          checkText = \"이메일이 형식에 맞지 않습니다.\";\r\n");
      out.write("                          const target = document.getElementById('telCheck');\r\n");
      out.write("                       target.disabled = true;\r\n");
      out.write("                      }else{\r\n");
      out.write("                          const target = document.getElementById('telCheck');\r\n");
      out.write("                       target.disabled = false;\r\n");
      out.write("                      }\r\n");
      out.write("                     break;\r\n");
      out.write("                     \r\n");
      out.write("                  case \"user_pw\":\r\n");
      out.write("                     if(thisVal.length != 0 && $(\"#user_pw2\").val() != thisVal){\r\n");
      out.write("                        checkText = \"비밀번호가 일치하지 않습니다.\";\r\n");
      out.write("                        if(!($(\".edit_pw\").hasClass(\"editRequired\"))) {\r\n");
      out.write("                               $(\".edit_pw\").addClass(\"editRequired\");\r\n");
      out.write("                        }else{\r\n");
      out.write("                               $(\".edit_pw\").removeClass(\"editRequired\");\r\n");
      out.write("                        }\r\n");
      out.write("                     }\r\n");
      out.write("                     break;\r\n");
      out.write("                 \r\n");
      out.write("               case \"user_pw2\":\r\n");
      out.write("                  if(thisVal.length != 0 && $(\"#user_pw\").val() != thisVal) {\r\n");
      out.write("                     checkText = \"비밀번호가 일치하지 않습니다.\";\r\n");
      out.write("                     if(!($(\".edit_pw\").hasClass(\"editRequired\"))) {\r\n");
      out.write("                        $(\".edit_pw\").addClass(\"editRequired\");\r\n");
      out.write("                     }\r\n");
      out.write("                  }else{\r\n");
      out.write("                     $(\".edit_pw\").removeClass(\"editRequired\");\r\n");
      out.write("                  }\r\n");
      out.write("                  break;\r\n");
      out.write("                  \r\n");
      out.write("              }\r\n");
      out.write("              if(checkText != \"\"){\r\n");
      out.write("                    if($(this).attr(\"id\")==\"user_pw\"){\r\n");
      out.write("                       $(\"#user_pw2\").siblings(\".info_ptag\").html(checkText);\r\n");
      out.write("                        $(\"#user_pw2\").addClass(\"vali\");\r\n");
      out.write("                        $(\"#user_pw2\").siblings(\".info_ptag\").slideDown();\r\n");
      out.write("                         $(\"#user_pw2\").css({\r\n");
      out.write("                            \"borderColor\":\"red\"\r\n");
      out.write("                         });\r\n");
      out.write("                    }else{\r\n");
      out.write("                     $(this).siblings(\".info_ptag\").html(checkText);\r\n");
      out.write("                     $(this).addClass(\"vali\");\r\n");
      out.write("                     $(this).siblings(\".info_ptag\").slideDown();\r\n");
      out.write("                      $(this).css({\r\n");
      out.write("                         \"borderColor\":\"red\"\r\n");
      out.write("                      });\r\n");
      out.write("                    }\r\n");
      out.write("                 } else {\r\n");
      out.write("                  if($(this).attr(\"id\")==\"user_pw\"){\r\n");
      out.write("                     $(\"#user_pw2\").siblings(\".info_ptag\").slideUp();\r\n");
      out.write("                     $(\"#user_pw2\").siblings(\".info_ptag\").empty();\r\n");
      out.write("                     $(\"#user_pw2\").removeClass(\"vali\");\r\n");
      out.write("                           $(\"#user_pw2\").css({\r\n");
      out.write("                              \"borderColor\":\"green\"\r\n");
      out.write("                           });\r\n");
      out.write("                       }else{\r\n");
      out.write("                          $(this).siblings(\".info_ptag\").slideUp();\r\n");
      out.write("                           $(this).siblings(\".info_ptag\").empty();\r\n");
      out.write("                           $(this).removeClass(\"vali\");\r\n");
      out.write("                           $(this).css({\r\n");
      out.write("                              \"borderColor\":\"green\"\r\n");
      out.write("                           });\r\n");
      out.write("                       }\r\n");
      out.write("                  }\r\n");
      out.write("      });\r\n");
      out.write("      </script>\r\n");
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