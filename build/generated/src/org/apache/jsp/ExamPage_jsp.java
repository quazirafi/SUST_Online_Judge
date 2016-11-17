package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ExamPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("   ");
 response.setHeader("Cache-Control","no-cache"); 
/*HTTP 1.1*/ response.setHeader("Pragma","no-cache"); 
/*HTTP 1.0*/ response.setDateHeader ("Expires", 0);

      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<meta name=\"viewport\" content=\"width-device-width, initial-scale=1.0\">\n");
      out.write("<title>SUST Judge</title>\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\"\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\"\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\"\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_url_3(_jspx_page_context))
        return;
      out.write("\"\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_url_4(_jspx_page_context))
        return;
      out.write("\"\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_url_5(_jspx_page_context))
        return;
      out.write("\"\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("<script\n");
      out.write("\tsrc=\"");
      if (_jspx_meth_c_url_6(_jspx_page_context))
        return;
      out.write("\"\n");
      out.write("\ttype=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      if (_jspx_meth_c_url_7(_jspx_page_context))
        return;
      out.write("\"\n");
      out.write("\ttype=\"text/javascript\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"");
      if (_jspx_meth_c_url_8(_jspx_page_context))
        return;
      out.write("\"\n");
      out.write("\ttype=\"text/javascript\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"");
      if (_jspx_meth_c_url_9(_jspx_page_context))
        return;
      out.write("\"\n");
      out.write("\ttype=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<!-- \ttype=\"text/javascript\"></script> -->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<nav class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("\t<div class=\"row topbar\">\n");
      out.write("\t\t<!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("\t\t<div\n");
      out.write("\t\t\tclass=\"\n");
      out.write("                 col-sm-4 col-sm-offset-1\n");
      out.write("                 col-xs-12\">\n");
      out.write("\t\t\t<a class=\"navbar-brand\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/sign-in.html\">SUST Judge<sup>alpha</sup></a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div\n");
      out.write("\t\t\tclass=\"\n");
      out.write("                 col-sm-5 col-sm-offset-1\n");
      out.write("                 col-xs-12\">\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right\">\\\n");
      out.write("\t\t\t\t<li><a href=\"#\">Quazi Rafi</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"sign-in.html\">Log out</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t</nav>\n");
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"row searchbar\">\n");
      out.write("\t\t\t<div class=\"col-xs-8\">\n");
      out.write("                            <p class=\"table-headertext\">\n");
      out.write("\t\t\t\tCourse Title: <span id=\"course_code\">Project 400</span>\n");
      out.write("                            </p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-2\">\n");
      out.write("                            <button id=\"button_add_task\" class=\"btn btn-success col-xs-12\" onClick=\"goToAddTaskPage()\">\n");
      out.write("\t\t\t\t<i class=\"glyphicon glyphicon-plus-sign\"></i> Add New Exam\n");
      out.write("                            </button>\t\t\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xs-2\">\n");
      out.write("                            <button id=\"button_add_task\" class=\"btn btn-success col-xs-12\" onClick=\"goToAddTaskPage()\">\n");
      out.write("\t\t\t\t<i class=\"glyphicon glyphicon-plus-sign\"></i> Add From Previous\n");
      out.write("                            </button>\t\t\n");
      out.write("                        </div>\n");
      out.write("                </div>       \n");
      out.write("                 \n");
      out.write("\t<!--\t<div class=\"clearfix\"></div> -->\n");
      out.write("\t\t<!-- TABLE -->\n");
      out.write("\t\t<div class=\"panel\">\n");
      out.write("\n");
      out.write("\t\t\t<table id=\"taskTable\"\n");
      out.write("\t\t\t\tclass=\"table table-striped table-bordered table-hover\">\n");
      out.write("\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t<tr>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<th class=\"col-md-1 col-sm-1 col-xs-1\">Exam. Id</th>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<th class=\"col-md-3 col-sm-3 col-xs-3\">Title</th>\n");
      out.write("                                                <th class=\"col-md-2 col-sm-2 col-xs-2\">Date</th>\n");
      out.write("\t\t\t\t\t\t<th class=\"col-md-2 col-sm-2 col-xs-2\">Start Time</th>\t\t\t\t\t\t\n");
      out.write("                                                <th class=\"col-md-2 col-sm-2 col-xs-2\">Duration(Hours)</th>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<th class=\"col-md-2 col-sm-2 col-xs-2\">Actions</th>\n");
      out.write("                                                <th class=\"col-md-2 col-sm-2 col-xs-2\">Status</th>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</thead>\n");
      out.write("\t\t\t\t<tbody>\t\t\t\t\n");
      out.write("                                \t <tr>\n");
      out.write("\t\t\t\t\t\t<td>1</td>\n");
      out.write("\t\t\t\t\t\t<td><a>Exam 1</a></td>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<td>20.12.16</td>\n");
      out.write("                                                <td>3:00</td>\n");
      out.write("                                                <td>1.5</td>\n");
      out.write("\t\t\t\t\t\t<td><a class=\"btn btn-info btn-sm removebutton\" onclick=\"\" title=\"Remove\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-remove \"></i></a>\n");
      out.write("                                                            <a class=\"btn btn-info btn-sm editbutton\" onclick=\"\" title=\"Edit Exam\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-edit \"></i></a>\n");
      out.write("             \n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("                                                <td>Not Started</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("                                        \t\t\t\t\n");
      out.write("                                \t <tr>\n");
      out.write("\t\t\t\t\t\t<td>1</td>\n");
      out.write("\t\t\t\t\t\t<td><a>Exam 1</a></td>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<td>20.12.16</td>\n");
      out.write("                                                <td>3:00</td>\n");
      out.write("                                                <td>1.5</td>\n");
      out.write("\t\t\t\t\t\t<td><a class=\"btn btn-info btn-sm removebutton\" onclick=\"\" title=\"Remove\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-remove \"></i></a>\n");
      out.write("                                                            <a class=\"btn btn-info btn-sm editbutton\" onclick=\"\" title=\"Edit Exam\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-edit \"></i></a>\n");
      out.write("             \n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("                                                <td>Not Started</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("                                        \t\t\t\t\n");
      out.write("                                \t <tr>\n");
      out.write("\t\t\t\t\t\t<td>1</td>\n");
      out.write("\t\t\t\t\t\t<td><a>Exam 3</a></td>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<td>20.12.16</td>\n");
      out.write("                                                <td>3:00</td>\n");
      out.write("                                                <td>1.5</td>\n");
      out.write("\t\t\t\t\t\t<td><a class=\"btn btn-info btn-sm removebutton\" onclick=\"\" title=\"Remove\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-remove \"></i></a>\n");
      out.write("                                                            <a class=\"btn btn-info btn-sm editbutton\" onclick=\"\" title=\"Edit Exam\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-edit \"></i></a>\n");
      out.write("             \n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("                                                <td>Not Started</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("                                        \t\t\t\t\n");
      out.write("                                \t <tr>\n");
      out.write("\t\t\t\t\t\t<td>1</td>\n");
      out.write("\t\t\t\t\t\t<td><a>Exam 2</a></td>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<td>20.12.16</td>\n");
      out.write("                                                <td>3:00</td>\n");
      out.write("                                                <td>1.5</td>\n");
      out.write("\t\t\t\t\t\t<td><a class=\"btn btn-info btn-sm removebutton\" onclick=\"\" title=\"Remove\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-remove \"></i></a>\n");
      out.write("                                                            <a class=\"btn btn-info btn-sm editbutton\" onclick=\"\" title=\"Edit Exam\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-edit \"></i></a>\n");
      out.write("             \n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("                                                <td>Not Started</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("                                        \t\t\t\t\n");
      out.write("                                \t <tr>\n");
      out.write("\t\t\t\t\t\t<td>1</td>\n");
      out.write("\t\t\t\t\t\t<td><a>Exam 2</a></td>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<td>20.12.16</td>\n");
      out.write("                                                <td>3:00</td>\n");
      out.write("                                                <td>1.5</td>\n");
      out.write("\t\t\t\t\t\t<td><a class=\"btn btn-info btn-sm removebutton\" onclick=\"\" title=\"Remove\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-remove \"></i></a>\n");
      out.write("                                                            <a class=\"btn btn-info btn-sm editbutton\" onclick=\"\" title=\"Edit Exam\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-edit \"></i></a>\n");
      out.write("             \n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("                                                <td>Not Started</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("                                        \t\t\t\t\n");
      out.write("                                \t <tr>\n");
      out.write("\t\t\t\t\t\t<td>1</td>\n");
      out.write("\t\t\t\t\t\t<td><a>Exam 2</a></td>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<td>20.12.16</td>\n");
      out.write("                                                <td>3:00</td>\n");
      out.write("                                                <td>1.5</td>\n");
      out.write("\t\t\t\t\t\t<td><a class=\"btn btn-info btn-sm removebutton\" onclick=\"\" title=\"Remove\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-remove \"></i></a>\n");
      out.write("                                                            <a class=\"btn btn-info btn-sm editbutton\" onclick=\"\" title=\"Edit Exam\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-edit \"></i></a>\n");
      out.write("             \n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("                                                <td>Not Started</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</tbody>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- panel -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<div class=\"modal fade\" id=\"modalTaskInfo\" tabindex=\"-1\" role=\"dialog\"\n");
      out.write("\t\t\taria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("\t\t\t<div class=\"modal-dialog\">\n");
      out.write("\t\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\n");
      out.write("\t\t\t\t\t\t\taria-label=\"Close\">\n");
      out.write("\t\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t<h4 class=\"modal-title\" id=\"myModalLabel\">Task details</h4>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-1\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>ID</label>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-1\">\n");
      out.write("\t\t\t\t\t\t\t\t<p id=\"view_task_id\"></p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-3\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>Title</label>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-3\">\n");
      out.write("\t\t\t\t\t\t\t\t<p id=\"view_task_title\"></p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-1\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>Type</label>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-1\">\n");
      out.write("\t\t\t\t\t\t\t\t<p id=\"view_task_type\"></p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-1\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>Description</label>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-1\">\n");
      out.write("\t\t\t\t\t\t\t\t<p id=\"view_task_description\"></p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>Deadline</label>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t\t\t\t<p id=\"view_task_deadline\"></p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>Total Group</label>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t\t\t\t<p id=\"view_task_total_group\"></p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>Total Submission</label>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t\t\t\t<p id=\"view_task_total_submission\"></p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- Modal Details -->\n");
      out.write("\n");
      out.write("\t\t<div class=\"modal fade\" id=\"modalTaskEdit\" tabindex=\"-1\" role=\"dialog\"\n");
      out.write("\t\t\taria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("\t\t\t<div class=\"modal-dialog\">\n");
      out.write("\t\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t\t<form id=\"edit_task\" name=\"edit_task\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\n");
      out.write("\t\t\t\t\t\t\t\taria-label=\"Close\"\">\n");
      out.write("\t\t\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\n");
      out.write("\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"modal-title\" id=\"modal_label\">Edit Task</h4>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" name=\"taskId\" id=\"edit_task_id\"></input>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row bottom-buffer\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-8\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>Session</label>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<select name=\"session\" id=\"session\" type=\"text\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"form-control\"></select>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row bottom-buffer\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>Title</label>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-8\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input name=\"taskTitle\" id=\"edit_task_title\" type=\"text\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"form-control\"></input>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row bottom-buffer\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>Description</label>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-8\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<textarea name=\"taskDesc\" id=\"edit_task_description\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype=\"text\" class=\"form-control\"></textarea>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row bottom-buffer\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>Final Submission Deadline</label>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-8\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<textarea name=\"taskDeadline\" id=\"edit_task_deadline\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype=\"text\" class=\"form-control\"></textarea>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row bottom-buffer\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>Maximum Allowed Groups</label>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-8\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<select name=\"taskTotalGroupNo\" id=\"edit_task_group_number\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"form-control\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option selected=\"selected\">1</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option>2</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option>3</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option>4</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option>5</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row bottom-buffer\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>Maximum Allowed Submissions</label>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-8\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<textarea name=\"taskTotalSubmissonNo\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"edit_task_total_submission\" type=\"text\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"form-control\"></textarea>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row bottom-buffer\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-8 col-md-offset-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"isOpen\" id=\"edit_task_sopen\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"true\" checked> Submissions open<br>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row bottom-buffer\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>Type</label>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-8\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- Changed name from 'taskTypeId' to 'taskType' for switching from Entity to Bean -->\n");
      out.write("\t\t\t\t\t\t\t\t\t<select name=\"taskType\" id=\"edit_task_type\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"form-control\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option>Assignment</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option selected=\"selected\">Project</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\"\n");
      out.write("\t\t\t\t\t\t\t\tdata-dismiss=\"modal\">Close</button>\n");
      out.write("\t\t\t\t\t\t\t<!-- <button type=\"submit\" class=\"btn btn-info\">Save changes</button> -->\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"Submit\" class=\"btn btn-info\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!--Modal Edit -->\n");
      out.write("\n");
      out.write("\t\t<div class=\"modal fade\" id=\"modalTaskDelete\" tabindex=\"-1\"\n");
      out.write("\t\t\trole=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("\t\t\t<div class=\"modal-dialog\">\n");
      out.write("\t\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t\t<form id=\"delete_task\" name=\"delete_task\" method=\"post\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\n");
      out.write("\t\t\t\t\t\t\t\taria-label=\"Close\" disabled=\"isMe\">\n");
      out.write("\t\t\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\n");
      out.write("\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"modal-title\">Delete Task</h4>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-body\">Are you sure you want to delete this\n");
      out.write("\t\t\t\t\t\t\tentry?</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\"\n");
      out.write("\t\t\t\t\t\t\t\tdata-dismiss=\"modal\">Cancel</button>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"Delete\" class=\"btn btn-info\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- Modal delete -->\n");
      out.write("\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/courseback\">Previous Page</a>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- body container -->\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("$(document).ready(function(){\n");
      out.write("    $('#taskTable').DataTable();\n");
      out.write("});\n");
      out.write("function goToUpdateTaskPage(taskId){\n");
      out.write("\talert(\"whoops!!!!\");\n");
      out.write("\twindow.location.href = \"goToUpdateTaskPage?taskId=\"+taskId;\n");
      out.write("}\n");
      out.write("function goToAddTaskPage(){\n");
      out.write("\talert(\"whoops!!!!\");\n");
      out.write("\twindow.location.href = \"goToAddTaskPage\";\n");
      out.write("}\n");
      out.write("</script>\n");
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
