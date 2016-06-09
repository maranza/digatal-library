package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.swing.JOptionPane;
import java.sql.*;;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    public class sqlconnection{
    
    Connection conn=null;
    PreparedStatement prep = null;
    ResultSet res =null;

    public sqlconnection()
{
            
    try
        {

            Connection conn = DriverManager.getConnection("jdbc:sqlite:/home/master/library.db");
            
            prep = conn.prepareStatement("Select * from catalog");

            //return conn;
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }

    //return conn;
    }
    
     public ResultSet getBooks(){
     
            try
            {  
                res = prep.executeQuery();

            }catch(SQLException e)
            {
                    e.printStackTrace();
            }

    return res;
        }
    
}

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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
 Class.forName("org.sqlite.JDBC");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
      out.write("\n");
      out.write("    ");
      out.write('\n');

    sqlconnection objct = new sqlconnection();
    ResultSet books = objct.getBooks();

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\" />\n");
      out.write("        <title>Library Catalog</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Welcome to the Mahikeng Community Library catalog</h1>\n");
      out.write("    \n");
      out.write("        \n");
      out.write("          \t<div class=\"datagrid\">\n");
      out.write("\t<table>\n");
      out.write("\t\t<thead>\n");
      out.write("\t\t\t<tr>\n");
      out.write("                            <th>Id</th>\n");
      out.write("                            <th>Title</th>\n");
      out.write("                            <th>Author</th>\n");
      out.write("                            <th>Edition</th>\n");
      out.write("                            <th>Category</th>\n");
      out.write("                            <th>Date</th>\n");
      out.write("                            <th>ISBN</th>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</thead>\n");
      out.write("\t\t<tfoot>\n");
      out.write("\t\t\t<tr><td colspan=\"4\">\n");
      out.write("\t\t\t\t\t<div id=\"paging\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\"><span>Previous</span></a>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"active\"><span>1</span></a>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\"><span>2</span></a>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\"><span>3</span></a>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\"><span>4</span></a>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\"><span>5</span></a>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\"><span>Next</span></a>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</tfoot>\n");
      out.write("\t\t<tbody>\n");
      out.write("                     ");
 while(books.next()){ 
      out.write("\n");
      out.write("\t\t\t<tr class=\"alt\">\n");
      out.write("\t\t\t\t<td>");
      out.print( books.getInt("id") );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( books.getString("title") );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( books.getString("author") );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( books.getString("edition") );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( books.getString("category") );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( books.getString("date") );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( books.getInt("isbn") );
      out.write("</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("                     ");
 } 
      out.write("\n");
      out.write("\t\t</tbody>\n");
      out.write("\t</table>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("    \n");
      out.write("   ");
      out.write("\n");
      out.write("        \n");
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
