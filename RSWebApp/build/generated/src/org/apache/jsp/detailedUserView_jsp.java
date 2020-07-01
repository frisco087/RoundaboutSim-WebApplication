package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.User;

public final class detailedUserView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0,  minimum-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"Enter Content\">\n");
      out.write("        <meta name=\"author\" content=\"Daniel O' Keeffe\">\n");
      out.write("\n");
      out.write("        <title>Roundabout Sim - Edit User</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\" integrity=\"sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <!--fonts-->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Poppins&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Raleway&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Roboto+Slab&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <!--animate-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://unpkg.com/aos@next/dist/aos.css\" />\n");
      out.write("        <!--Favicon-->\n");
      out.write("        <!--Favicon-->\n");
      out.write("        <link data-brackets-id='3508' rel=\"icon\" href=\"/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("        <meta name=\"msapplication-TileColor\" content=\"#ffffff\">\n");
      out.write("        <meta name=\"msapplication-TileImage\" content=\"/ms-icon-144x144.png\">\n");
      out.write("        <meta name=\"theme-color\" content=\"#ffffff\">\n");
      out.write("        <!--css-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <div class='thetop'></div>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <!--Nav-->\n");
      out.write("        <nav>\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <a href=\"#\"><img src=\"img/logo.png\"></a>\n");
      out.write("            </div>\n");
      out.write("            <a href=\"UserController?menu=Logout\"><button type=\"button\" class =\"logout\">Logout</button></a>\n");
      out.write("            <!--            <ul class=\"menu\">\n");
      out.write("                            <li><a href=\"UserController?menu=Home\">Home</a></li>\n");
      out.write("                            <li><a href=\"gallery.jsp\">Gallery</a></li>\n");
      out.write("                            <li><a href=\"about.jsp\">About</a></li>\n");
      out.write("                            <li><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("                            <li><a class=\"active\" href=\"#\">Sign In/Up</a></li>\n");
      out.write("                        </ul>-->\n");
      out.write("            <!--            <div class=\"burger\">\n");
      out.write("                            <div class=\"line1\"></div>\n");
      out.write("                            <div class=\"line2\"></div>\n");
      out.write("                            <div class=\"line3\"></div>\n");
      out.write("                        </div>-->\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--main wrapper-->\n");
      out.write("        <div class=\"main-wrap\">\n");
      out.write("            <div class=\"pusher\"></div>\n");
      out.write("            <div class=\"pusher\"></div>\n");
      out.write("            <div class=\"pusher\"></div>\n");
      out.write("            <div class=\"pusher\"></div>\n");
      out.write("            <!--breadcrumb-->\n");
      out.write("            <!--            <ol class=\"breadcrumb\">\n");
      out.write("                            <li class=\"breadcrumb-item\">\n");
      out.write("                                <a class=\"bc-link\" href=\"index.jsp\">Home</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"breadcrumb-item\">Sign In</li>\n");
      out.write("                        </ol>-->\n");
      out.write("\n");
      out.write("            <div class=\"login-box\">\n");
      out.write("                <div class=\"center-item\">\n");
      out.write("                    <h1 data-aos=\"fade-up\" data-aos-offset=\"10\" data-aos-delay=\"200\" data-aos-duration=\"400\" data-aos-easing=\"ease-in-out\" data-aos-mirror=\"true\" data-aos-once=\"true\" data-aos-anchor-placement=\"top\">Update User</h1>\n");
      out.write("                    <hr data-aos=\"fade-up\" data-aos-offset=\"10\" data-aos-delay=\"200\" data-aos-duration=\"400\" data-aos-easing=\"ease-in-out\" data-aos-mirror=\"true\" data-aos-once=\"true\" data-aos-anchor-placement=\"top\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"row\" data-aos=\"fade-up\" data-aos-offset=\"10\" data-aos-delay=\"200\" data-aos-duration=\"400\" data-aos-easing=\"ease-in-out\" data-aos-mirror=\"true\" data-aos-once=\"true\" data-aos-anchor-placement=\"top\">\n");
      out.write("                    <div class=\"\">\n");
      out.write("                        <div class=\"rowpad\">\n");
      out.write("                            <div class=\"form\">\n");
      out.write("                                <form action=\"UserController\" method=\"get\" class=\"show-form\" name=\"user\">\n");
      out.write("                                    <br>\n");
      out.write("                                    <i class=\"fa fa-user icon\"></i>\n");
      out.write("                                    <label>Username</label><br>\n");
      out.write("                                    <input class=\"fullWidthField form-control\" type=\"text\" name=\"username\" id=\"username\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                                    <br>\n");
      out.write("                                    <i class=\"fa fa-key icon\"></i>\n");
      out.write("                                    <label>Password</label><br>\n");
      out.write("                                    <input class=\"fullWidthField form-control\" type=\"text\" name=\"password\" id=\"password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                                    <br>\n");
      out.write("                                    <i class=\"fa fa-envelope-open-text icon\"></i>\n");
      out.write("                                    <label>Email</label><br>\n");
      out.write("                                    <input class=\"fullWidthField form-control\" type=\"text\" name=\"email\" id=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                                    <br>\n");
      out.write("                                    <input class=\"btn btn-primary hvr-sweep-to-right\" type=\"submit\" name=\"menu\" value=\"Update\" />\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- /.row -->\n");
      out.write("            </div>\n");
      out.write("            <div class=\"pusher\"></div>\n");
      out.write("            <div class=\"pusher\"></div>\n");
      out.write("        </div>\n");
      out.write("        <!--Main wrap end-->\n");
      out.write("\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <div class=\"footer-wrap\">\n");
      out.write("                <img class=\"foot-logo\" src=\"img/logo.png\">\n");
      out.write("                <div class=\"black-line\"></div>\n");
      out.write("                <div class=\"social-icon-wrap\">\n");
      out.write("                    <a href=\"\"><img src=\"img/iconmonstr-facebook-3-240.png\" alt=\"facebook logo\"></a>\n");
      out.write("                    <a href=\"\"><img src=\"img/iconmonstr-instagram-1-240.png\" alt=\"instagram logo\"></a>\n");
      out.write("                    <a href=\"\"><img src=\"img/iconmonstr-twitter-3-240.png\" alt=\"twitter logo\"></a>\n");
      out.write("                    <a href=\"\"><img src=\"img/iconmonstr-youtube-3-240.png\" alt=\"youtube logo\"></a>\n");
      out.write("                </div>\n");
      out.write("                <a data-brackets-id='3631' href=\"mailto:RoundaboutSim@live.com?Subject=Hello%20again\">\n");
      out.write("                    <p data-brackets-id='3632'><i data-brackets-id='3633' class=\"fas fa-envelope-open-text fa-1x\"></i>Email: RoundaboutSim@live.com</p>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"tel:3530003333\">\n");
      out.write("                    <p><i class=\"fas fa-phone-volume fa-1x\"></i>Phone: +353 (0)00 3333</p>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <p class=\"footer-company-name\">Website built by <br>Daniel O' Keeffe &copy; 2019</p>\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"foot-nav\">\n");
      out.write("                    <a class=\"smaller\" href=\"cookies.html\">\n");
      out.write("                        <li class=\"smaller\">Cookie Policy</li>\n");
      out.write("                    </a>\n");
      out.write("                    <a class=\"smaller\" href=\"terms.html\">\n");
      out.write("                        <li class=\"smaller\">Terms &#38 Conditons</li>\n");
      out.write("                    </a>\n");
      out.write("                    <a class=\"smaller\" href=\"privacy-policy.html\">\n");
      out.write("                        <li class=\"smaller\">Privacy Policy</li>\n");
      out.write("                    </a>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <!--scroll top-->\n");
      out.write("            <div class='scrolltop'>\n");
      out.write("                <div class='scroll icon'><i class=\"fa fa-4x fa-angle-up\"></i></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--scripts-->\n");
      out.write("        <script src=\"js/app.js\"></script>\n");
      out.write("        <!--    <script src=\"js/testimonial.js\"></script>-->\n");
      out.write("        <script src=\"js/scrollToTop.js\"></script>\n");
      out.write("        <!--animate on scroll-->\n");
      out.write("        <script src=\"https://unpkg.com/aos@next/dist/aos.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            AOS.init();\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            /* Scroll to top*/\n");
      out.write("            $(window).scroll(function () {\n");
      out.write("                if ($(this).scrollTop() > 50) {\n");
      out.write("                    $('.scrolltop:hidden').stop(true, true).fadeIn();\n");
      out.write("                } else {\n");
      out.write("                    $('.scrolltop').stop(true, true).fadeOut();\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("            $(function () {\n");
      out.write("                $(\".scroll\").click(function () {\n");
      out.write("                    $(\"html,body\").animate({\n");
      out.write("                        scrollTop: $(\".thetop\").offset().top\n");
      out.write("                    }, \"1000\");\n");
      out.write("                    return false\n");
      out.write("                })\n");
      out.write("            })\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            function myFunction() {\n");
      out.write("                var x = document.getElementById(\"password\");\n");
      out.write("                if (x.type === \"password\") {\n");
      out.write("                    x.type = \"text\";\n");
      out.write("                } else {\n");
      out.write("                    x.type = \"password\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <!-- Bootstrap core JavaScript -->\n");
      out.write("        <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("        <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <!-- Contact form JavaScript -->\n");
      out.write("        <!-- Do not edit these files! In order to set the email address and subject line for the contact form go to the bin/contact_me.php file. -->\n");
      out.write("        <script src=\"js/jqBootstrapValidation.js\"></script>\n");
      out.write("        <script src=\"js/contact_me.js\"></script>\n");
      out.write("    </body></html>");
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
