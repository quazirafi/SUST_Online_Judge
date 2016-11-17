package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class publicview_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
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
      out.write("\r\n");
 response.setHeader("Cache-Control", "no-cache");
    /*HTTP 1.1*/ response.setHeader("Pragma", "no-cache");
    /*HTTP 1.0*/ response.setDateHeader("Expires", 0);

      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width-device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>SUST Judge</title>\r\n");
      out.write("        <link href=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("              rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("        <link href=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("              rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <link href=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("              rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <link href=\"");
      if (_jspx_meth_c_url_3(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("              rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <link href=\"");
      if (_jspx_meth_c_url_4(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("              rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <link href=\"");
      if (_jspx_meth_c_url_5(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("              rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("        <script\r\n");
      out.write("            src=\"");
      if (_jspx_meth_c_url_6(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("        type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"");
      if (_jspx_meth_c_url_7(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("        type=\"text/javascript\"></script>\r\n");
      out.write("        <script\r\n");
      out.write("            src=\"");
      if (_jspx_meth_c_url_8(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("        type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("    <nav class=\"navbar navbar-default navbar-fixed-top\">\r\n");
      out.write("        <div class=\"row topbar\">\r\n");
      out.write("            <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("            <div\r\n");
      out.write("                class=\"\r\n");
      out.write("                col-sm-4 col-sm-offset-1\r\n");
      out.write("                col-xs-12\">\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/sign-in.html\">SUST Judge<sup>alpha</sup></a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div\r\n");
      out.write("                class=\"\r\n");
      out.write("                col-sm-5 col-sm-offset-1\r\n");
      out.write("                col-xs-12\">\r\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    <!-- \t\t\t<li><a href=\"#\">Settings</a></li> -->\r\n");
      out.write("                    <!-- \t\t\t<li><a href=\"sign-in.html\">Log Out</a></li> -->\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <input type=\"hidden\" id=\"hidden_username\" name=\"username\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("></input>\r\n");
      out.write("        <!--  <form method=\"get\" action=\"publicview\">-->\r\n");
      out.write("        <!--  <select name=\"session\">\r\n");
      out.write("                <option value=\"2010\">2010</option>\r\n");
      out.write("                <option value=\"2011\">2011</option>\r\n");
      out.write("                <option value=\"2012\">2012</option>\r\n");
      out.write("                <option value=\"2013\">2013</option>\r\n");
      out.write("        </select>-->\r\n");
      out.write("        <div class=\"row searchbar\">\r\n");
      out.write("            <div class=\"col-xs-8\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-xs-2\">\r\n");
      out.write("                <select id=\"filter_session\" class=\"form-control\">\r\n");
      out.write("\r\n");
      out.write("                    <option value=\"2010\">2010</option>\r\n");
      out.write("                    <option value=\"2011\">2011</option>\r\n");
      out.write("                    <option value=\"2012\">2012</option>\r\n");
      out.write("                    <option value=\"2013\">2013</option>\r\n");
      out.write("                </select>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-xs-2\">\r\n");
      out.write("                <button onclick=\"go()\" id=\"button_add_task\" class=\"btn btn-success col-xs-12\">\r\n");
      out.write("\r\n");
      out.write("                    <i class=\"glyphicon glyphicon-plus-sign\"></i> Go\r\n");
      out.write("                </button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- <input type=\"submit\" value=\"go\"> </input> -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- </form> -->\r\n");
      out.write("        <p>Session : 2012 </p>\r\n");
      out.write("        <div class=\"panel\">\r\n");
      out.write("            <table id=\"courseTable\"\r\n");
      out.write("                   class=\"table table-striped table-bordered table-hover\">\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th class=\"col-md-1 col-sm-1 col-xs-1\">ID</th>\r\n");
      out.write("                        <th class=\"col-md-3 col-sm-3 col-xs-3\">Course Code</th>\r\n");
      out.write("                        <th class=\"col-md-2 col-sm-2 col-xs-2\">Course Title</th>\r\n");
      out.write("                        <th class=\"col-md-2 col-sm-2 col-xs-2\">Course Credit</th>\r\n");
      out.write("                        <th class=\"col-md-2 col-sm-2 col-xs-2\">Actions(Current exams)</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody>\r\n");
      out.write("                    \r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td> 1 </td>\r\n");
      out.write("                            <td> <a href=\"#\"> CSE 400 </a></td>\r\n");
      out.write("                            <td> Project 400</td>\r\n");
      out.write("                            <td> 2.0</td>\r\n");
      out.write("                            <td><a class=\"btn btn-info btn-sm editbutton\" onclick=\"\" title=\"Add Exam\"><i\r\n");
      out.write("                                        class=\"glyphicon glyphicon-edit\"></i></a> (3)\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                          <tr>\r\n");
      out.write("                            <td> 1 </td>\r\n");
      out.write("                            <td> <a href=\"#\"> CSE 400 </a></td>\r\n");
      out.write("                            <td> Project 400</td>\r\n");
      out.write("                            <td> 2.0</td>\r\n");
      out.write("                            <td><a class=\"btn btn-info btn-sm editbutton\" onclick=\"\" title=\"Add Exam\"><i\r\n");
      out.write("                                        class=\"glyphicon glyphicon-edit\"></i></a> (3)\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                          <tr>\r\n");
      out.write("                            <td> 1 </td>\r\n");
      out.write("                            <td> <a href=\"#\"> CSE 400 </a></td>\r\n");
      out.write("                            <td> Project 400</td>\r\n");
      out.write("                            <td> 2.0</td>\r\n");
      out.write("                            <td><a class=\"btn btn-info btn-sm editbutton\" onclick=\"\" title=\"Add Exam\"><i\r\n");
      out.write("                                        class=\"glyphicon glyphicon-edit\"></i></a> (2)\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                          <tr>\r\n");
      out.write("                            <td> 1 </td>\r\n");
      out.write("                            <td> <a href=\"#\"> CSE 400 </a></td>\r\n");
      out.write("                            <td> Project 400</td>\r\n");
      out.write("                            <td> 2.0</td>\r\n");
      out.write("                            <td><a class=\"btn btn-info btn-sm editbutton\" onclick=\"\" title=\"Add Exam\"><i\r\n");
      out.write("                                        class=\"glyphicon glyphicon-edit\"></i></a> (3)\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                          <tr>\r\n");
      out.write("                            <td> 1 </td>\r\n");
      out.write("                            <td> <a href=\"#\"> CSE 400 </a></td>\r\n");
      out.write("                            <td> Project 400</td>\r\n");
      out.write("                            <td> 2.0</td>\r\n");
      out.write("                            <td><a class=\"btn btn-info btn-sm editbutton\" onclick=\"\" title=\"Add Exam\"><i\r\n");
      out.write("                                        class=\"glyphicon glyphicon-edit\"></i></a> (1)\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                   \r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <a href=\"");
      if (_jspx_meth_c_url_9(_jspx_page_context))
        return;
      out.write("\">Login Page</a>\r\n");
      out.write("    </body>\r\n");
      out.write("    <script>\r\n");
      out.write("        $(document).ready(function () {\r\n");
      out.write("            $('#courseTable').DataTable();\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        function go() {\r\n");
      out.write("            var t = document.getElementById('filter_session').value.toString();\r\n");
      out.write("            var jspcall = \"publicview?session=\" + t;\r\n");
      out.write("            window.location.href = jspcall;\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
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
    _jspx_th_c_url_9.setValue("/sign-in.html");
    int _jspx_eval_c_url_9 = _jspx_th_c_url_9.doStartTag();
    if (_jspx_th_c_url_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_9);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_9);
    return false;
  }
}
