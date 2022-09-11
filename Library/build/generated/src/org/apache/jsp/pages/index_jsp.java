package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>Online Library: Entrance</title>\n");
      out.write("        <link href=\"css/style_index.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"main\">\n");
      out.write("\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <p class=\"title\"><span class=\"text\"><img src=\"images/lib.png\" width=\"76\" height=\"77\" hspace=\"10\" vspace=\"10\" align=\"middle\"></span></p>\n");
      out.write("                <p class=\"title\">Online Library</p>\n");
      out.write("                <p class=\"text\">Welcome to the online Library, where you can find whatever book you whant. Data search is available, there is a flexible system of filters, sorting is well thought out.</p>\n");
      out.write("                <p class=\"text\">Currently, the project in development. So mast be updated soon.</p>\n");
      out.write("                <p class=\"text\">For cooperation please contact <a href=\"mailto:gregory.shtanko@yahoo.com\">gregory.shtanko@yahoo.com\n");
      out.write("                    </a></p>\n");
      out.write("                <p>&nbsp;</p>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <p class=\"title\">Type the nickname to use for log:</p>\n");
      out.write("                <form class=\"login_form\" name=\"username\" action=\"pages/main.jsp\" method=\"POST\">\n");
      out.write("                    Your name: <input type=\"text\" name=\"username\" value=\"\" size=\"20\" />\n");
      out.write("                    <input type=\"submit\" value=\"Enter\" />\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"footer\">\n");
      out.write("                 designed by Hryhorii Shtanko, 2022\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
