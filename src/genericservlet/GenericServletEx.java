package genericservlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class GenericServletEx
 */
@WebServlet("/GenericServletEx")
public class GenericServletEx extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public GenericServletEx() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		  
		PrintWriter out=response.getWriter();  
		out.print("<html><body>");  
		out.print("<b>Hello  Generic Servlet</b>");  
		out.print("</body></html>");  
		  
	}

}
