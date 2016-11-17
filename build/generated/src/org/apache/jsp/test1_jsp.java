package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("            var nesne;\n");
      out.write("            if (navigator.appName.search('Microsoft') > -1) {\n");
      out.write("                nesne = new ActiveXObject('MSXML2.XMLHTTP');\n");
      out.write("            }\n");
      out.write("            else {\n");
      out.write("                nesne = new XMLHttpRequest();\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function yolla() {\n");
      out.write("                nesne.open('get', 'Questions\\\\myText.txt', true);\n");
      out.write("                nesne.onreadystatechange = cevap;\n");
      out.write("                nesne.send(null);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function cevap() {\n");
      out.write("                if (nesne.readyState == 4) {\n");
      out.write("                    var el = document.getElementById('bilgi');\n");
      out.write("                    el.innerHTML = nesne.responseText;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <input type=\"button\" value=\"\"  onclick=\"yolla()\">\n");
      out.write("\n");
      out.write("        <div id=\"bilgi\"></div>\n");
      out.write("\n");
      out.write("    </body>\n");
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
}
