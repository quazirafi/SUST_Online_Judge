package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class QuestionPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_url_value_nobody.release();
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("   ");
 response.setHeader("Cache-Control","no-cache"); 
/*HTTP 1.1*/ response.setHeader("Pragma","no-cache"); 
/*HTTP 1.0*/ response.setDateHeader ("Expires", 0);

      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width-device-width, initial-scale=1.0\">\r\n");
      out.write("<title>SUST Judge</title>\r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_url_3(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_url_4(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_url_5(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"");
      if (_jspx_meth_c_url_6(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      if (_jspx_meth_c_url_7(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"");
      if (_jspx_meth_c_url_8(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"");
      if (_jspx_meth_c_url_9(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- \ttype=\"text/javascript\"></script> -->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<nav class=\"navbar navbar-default navbar-fixed-top\">\r\n");
      out.write("\t<div class=\"row topbar\">\r\n");
      out.write("\t\t<!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("\t\t<div\r\n");
      out.write("\t\t\tclass=\"\r\n");
      out.write("                 col-sm-4 col-sm-offset-1\r\n");
      out.write("                 col-xs-12\">\r\n");
      out.write("\t\t\t<a class=\"navbar-brand\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/sign-in.html\">SUST Judge<sup>alpha</sup></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div\r\n");
      out.write("\t\t\tclass=\"\r\n");
      out.write("                 col-sm-5 col-sm-offset-1\r\n");
      out.write("                 col-xs-12\">\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right\">\\\r\n");
      out.write("                                <li><a href=\"#\">Questions</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Student Performance</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"sign-in.html\">Log out</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row searchbar\">\r\n");
      out.write("\t\t\t<div class=\"col-xs-8\">\r\n");
      out.write("                            <p class=\"table-headertext\">\r\n");
      out.write("\t\t\t\tSummary: <span id=\"course_code\">54 Students attended,101 submissions</span>\r\n");
      out.write("                            </p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-xs-2\">\r\n");
      out.write("                            <button id=\"button_add_task\" class=\"btn btn-success col-xs-12\" onClick=\"goToAddTaskPage()\">\r\n");
      out.write("\t\t\t\t<i class=\"glyphicon glyphicon-plus-sign\"></i> Add Question\r\n");
      out.write("                            </button>\t\t\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-xs-2\">\r\n");
      out.write("                            <button id=\"button_add_task\" class=\"btn btn-success col-xs-12\" onClick=\"goToAddTaskPage()\">\r\n");
      out.write("\t\t\t\t<i class=\"glyphicon glyphicon-plus-sign\"></i> Start Exam\r\n");
      out.write("                            </button>\t\t\r\n");
      out.write("                        </div>\r\n");
      out.write("                </div>       \r\n");
      out.write("                 \r\n");
      out.write("\t<!--\t<div class=\"clearfix\"></div> -->\r\n");
      out.write("\t\t<!-- TABLE -->\r\n");
      out.write("\t\t<div class=\"panel\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<table id=\"taskTable\"\r\n");
      out.write("\t\t\t\tclass=\"table table-striped table-bordered table-hover\">\r\n");
      out.write("\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t<tr>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<th class=\"col-md-3 col-sm-3 col-xs-3\">Ques. Id</th>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<th class=\"col-md-3 col-sm-3 col-xs-3\">Title</th>\r\n");
      out.write("\t\t\t\t\t\t<th class=\"col-md-3 col-sm-3 col-xs-3\">Score</th>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<th class=\"col-md-2 col-sm-2 col-xs-2\">Actions</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t<tbody>\t\t\t\t\r\n");
      out.write("                                \t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>1</td>\r\n");
      out.write("                                                <td><a data-toggle=\"modal\" data-target=\"#myModal\" >Question 1</a></td>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<td>100</td>\r\n");
      out.write("\t\t\t\t\t\t<td><a class=\"btn btn-info btn-sm removebutton\" onclick=\"\" title=\"Remove\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-remove \"></i></a>\r\n");
      out.write("                                                            <a class=\"btn btn-info btn-sm editbutton\" onclick=\"\" title=\"Edit Test Case File\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-edit \"></i></a>\r\n");
      out.write("                                                            <a class=\"btn btn-info btn-sm editbutton\" onclick=\"\" title=\"Edit Question File\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-edit \"></i></a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("\t\t\t\t\t\t<td>1</td>\r\n");
      out.write("\t\t\t\t\t\t<td><a>Question 1</a></td>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<td>100</td>\r\n");
      out.write("\t\t\t\t\t\t<td><a class=\"btn btn-info btn-sm removebutton\" onclick=\"\" title=\"Remove\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-remove \"></i></a>\r\n");
      out.write("                                                            <a class=\"btn btn-info btn-sm editbutton\" onclick=\"\" title=\"Edit Test Case File\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-edit \"></i></a>\r\n");
      out.write("                                                            <a class=\"btn btn-info btn-sm editbutton\" onclick=\"\" title=\"Edit Question File\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-edit \"></i></a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("\t\t\t\t\t\t<td>1</td>\r\n");
      out.write("\t\t\t\t\t\t<td><a>Question 1</a></td>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<td>100</td>\r\n");
      out.write("\t\t\t\t\t\t<td><a class=\"btn btn-info btn-sm removebutton\" onclick=\"\" title=\"Remove\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-remove \"></i></a>\r\n");
      out.write("                                                            <a class=\"btn btn-info btn-sm editbutton\" onclick=\"\" title=\"Edit Test Case File\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-edit \"></i></a>\r\n");
      out.write("                                                            <a class=\"btn btn-info btn-sm editbutton\" onclick=\"\" title=\"Edit Question File\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-edit \"></i></a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("\t\t\t\t\t\t<td>1</td>\r\n");
      out.write("\t\t\t\t\t\t<td><a>Question 1</a></td>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<td>100</td>\r\n");
      out.write("\t\t\t\t\t\t<td><a class=\"btn btn-info btn-sm removebutton\" onclick=\"\" title=\"Remove\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-remove \"></i></a>\r\n");
      out.write("                                                            <a class=\"btn btn-info btn-sm editbutton\" onclick=\"\" title=\"Edit Test Case File\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-edit \"></i></a>\r\n");
      out.write("                                                            <a class=\"btn btn-info btn-sm editbutton\" onclick=\"\" title=\"Edit Question File\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-edit \"></i></a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("\t\t\t\t\t\t<td>1</td>\r\n");
      out.write("\t\t\t\t\t\t<td><a>Question 1</a></td>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<td>100</td>\r\n");
      out.write("\t\t\t\t\t\t<td><a class=\"btn btn-info btn-sm removebutton\" onclick=\"\" title=\"Remove\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-remove \"></i></a>\r\n");
      out.write("                                                            <a class=\"btn btn-info btn-sm editbutton\" onclick=\"\" title=\"Edit Test Case File\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-edit \"></i></a>\r\n");
      out.write("                                                            <a class=\"btn btn-info btn-sm editbutton\" onclick=\"\" title=\"Edit Question File\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-edit \"></i></a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- panel -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"modal fade\" id=\"modalTaskInfo\" tabindex=\"-1\" role=\"dialog\"\r\n");
      out.write("\t\t\taria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("\t\t\t<div class=\"modal-dialog\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
      out.write("\t\t\t\t\t\t\taria-label=\"Close\">\r\n");
      out.write("\t\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t<h4 class=\"modal-title\" id=\"myModalLabel\">Task details</h4>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>ID</label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p id=\"view_task_id\"></p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>Title</label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p id=\"view_task_title\"></p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>Type</label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p id=\"view_task_type\"></p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>Description</label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p id=\"view_task_description\"></p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>Deadline</label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p id=\"view_task_deadline\"></p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>Total Group</label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p id=\"view_task_total_group\"></p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>Total Submission</label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p id=\"view_task_total_submission\"></p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- Modal Details -->\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"modal fade\" id=\"modalTaskEdit\" tabindex=\"-1\" role=\"dialog\"\r\n");
      out.write("\t\t\taria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("\t\t\t<div class=\"modal-dialog\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t\t<form id=\"edit_task\" name=\"edit_task\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
      out.write("\t\t\t\t\t\t\t\taria-label=\"Close\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"modal-title\" id=\"modal_label\">Edit Task</h4>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" name=\"taskId\" id=\"edit_task_id\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row bottom-buffer\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>Session</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select name=\"session\" id=\"session\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"form-control\"></select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row bottom-buffer\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>Title</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input name=\"taskTitle\" id=\"edit_task_title\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"form-control\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row bottom-buffer\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>Description</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<textarea name=\"taskDesc\" id=\"edit_task_description\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype=\"text\" class=\"form-control\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row bottom-buffer\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>Final Submission Deadline</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<textarea name=\"taskDeadline\" id=\"edit_task_deadline\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype=\"text\" class=\"form-control\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row bottom-buffer\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>Maximum Allowed Groups</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select name=\"taskTotalGroupNo\" id=\"edit_task_group_number\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"form-control\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option selected=\"selected\">1</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option>2</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option>3</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option>4</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option>5</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row bottom-buffer\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>Maximum Allowed Submissions</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<textarea name=\"taskTotalSubmissonNo\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"edit_task_total_submission\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"form-control\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row bottom-buffer\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-8 col-md-offset-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"isOpen\" id=\"edit_task_sopen\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"true\" checked> Submissions open<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row bottom-buffer\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>Type</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- Changed name from 'taskTypeId' to 'taskType' for switching from Entity to Bean -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select name=\"taskType\" id=\"edit_task_type\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"form-control\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option>Assignment</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option selected=\"selected\">Project</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-dismiss=\"modal\">Close</button>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- <button type=\"submit\" class=\"btn btn-info\">Save changes</button> -->\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"Submit\" class=\"btn btn-info\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--Modal Edit -->\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"modal fade\" id=\"modalTaskDelete\" tabindex=\"-1\"\r\n");
      out.write("\t\t\trole=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("\t\t\t<div class=\"modal-dialog\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t\t<form id=\"delete_task\" name=\"delete_task\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
      out.write("\t\t\t\t\t\t\t\taria-label=\"Close\" disabled=\"isMe\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"modal-title\">Delete Task</h4>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-body\">Are you sure you want to delete this\r\n");
      out.write("\t\t\t\t\t\t\tentry?</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-dismiss=\"modal\">Cancel</button>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"Delete\" class=\"btn btn-info\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- Modal delete -->\r\n");
      out.write("                \r\n");
      out.write("                <!-- Button trigger modal -->\r\n");
      out.write("\r\n");
      out.write("<!-- Modal -->\r\n");
      out.write("<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\r\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("      <div class=\"modal-header\">\r\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("        <h4 class=\"modal-title\" id=\"myModalLabel\">Modal title</h4>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-body\">\r\n");
      out.write("           <textarea id=\"text1\" cols=\"80\" rows=\"20\" ></textarea>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-footer\">\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/courseback\">Previous Page</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- body container -->\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("    $('#taskTable').DataTable();\r\n");
      out.write("    \r\n");
      out.write("            \r\n");
      out.write("                $.ajax({\r\n");
      out.write("                    url: \"Questions\\2012\\CSE300\\exam1\\Q1\\q1.txt\",\r\n");
      out.write("                    dataType: \"text\",\r\n");
      out.write("                    success: function (data) {\r\n");
      out.write("                        $(\"#text1\").html(data);\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            \r\n");
      out.write("        \r\n");
      out.write("});\r\n");
      out.write("function goToUpdateTaskPage(taskId){\r\n");
      out.write("\talert(\"whoops!!!!\");\r\n");
      out.write("\twindow.location.href = \"goToUpdateTaskPage?taskId=\"+taskId;\r\n");
      out.write("}\r\n");
      out.write("function goToAddTaskPage(){\r\n");
      out.write("\talert(\"whoops!!!!\");\r\n");
      out.write("\twindow.location.href = \"goToAddTaskPage\";\r\n");
      out.write("}\r\n");
      out.write("function fun1(){\r\n");
      out.write("    $('#myText2').load(\"myText.txt\");\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/resources/css/topbar.css");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent(null);
    _jspx_th_c_url_1.setValue("/resources/css/bootstrap.min.css");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
    return false;
  }

  private boolean _jspx_meth_c_url_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_2.setPageContext(_jspx_page_context);
    _jspx_th_c_url_2.setParent(null);
    _jspx_th_c_url_2.setValue("/resources/css/bootstrap-theme.min.css");
    int _jspx_eval_c_url_2 = _jspx_th_c_url_2.doStartTag();
    if (_jspx_th_c_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
    return false;
  }

  private boolean _jspx_meth_c_url_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_3.setPageContext(_jspx_page_context);
    _jspx_th_c_url_3.setParent(null);
    _jspx_th_c_url_3.setValue("/resources/css/jquery.dataTables.min.css");
    int _jspx_eval_c_url_3 = _jspx_th_c_url_3.doStartTag();
    if (_jspx_th_c_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
    return false;
  }

  private boolean _jspx_meth_c_url_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_4.setPageContext(_jspx_page_context);
    _jspx_th_c_url_4.setParent(null);
    _jspx_th_c_url_4.setValue("/resources/css/dataTables.bootstrap.css");
    int _jspx_eval_c_url_4 = _jspx_th_c_url_4.doStartTag();
    if (_jspx_th_c_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
    return false;
  }

  private boolean _jspx_meth_c_url_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_5.setPageContext(_jspx_page_context);
    _jspx_th_c_url_5.setParent(null);
    _jspx_th_c_url_5.setValue("/resources/css/thesis-list.css");
    int _jspx_eval_c_url_5 = _jspx_th_c_url_5.doStartTag();
    if (_jspx_th_c_url_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
    return false;
  }

  private boolean _jspx_meth_c_url_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_6.setPageContext(_jspx_page_context);
    _jspx_th_c_url_6.setParent(null);
    _jspx_th_c_url_6.setValue("/resources/javascript/jquery-1.11.3.min.js");
    int _jspx_eval_c_url_6 = _jspx_th_c_url_6.doStartTag();
    if (_jspx_th_c_url_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_6);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_6);
    return false;
  }

  private boolean _jspx_meth_c_url_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_7 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_7.setPageContext(_jspx_page_context);
    _jspx_th_c_url_7.setParent(null);
    _jspx_th_c_url_7.setValue("/resources/javascript/bootstrap.min.js");
    int _jspx_eval_c_url_7 = _jspx_th_c_url_7.doStartTag();
    if (_jspx_th_c_url_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_7);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_7);
    return false;
  }

  private boolean _jspx_meth_c_url_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_8 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_8.setPageContext(_jspx_page_context);
    _jspx_th_c_url_8.setParent(null);
    _jspx_th_c_url_8.setValue("/resources/javascript/jquery.dataTables.min.js");
    int _jspx_eval_c_url_8 = _jspx_th_c_url_8.doStartTag();
    if (_jspx_th_c_url_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_8);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_8);
    return false;
  }

  private boolean _jspx_meth_c_url_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_9 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_9.setPageContext(_jspx_page_context);
    _jspx_th_c_url_9.setParent(null);
    _jspx_th_c_url_9.setValue("/resources/javascript/dataTables.bootstrap.js");
    int _jspx_eval_c_url_9 = _jspx_th_c_url_9.doStartTag();
    if (_jspx_th_c_url_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_9);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_9);
    return false;
  }
}
