package requestdispatcher;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String password=request.getParameter("password");
		if(password.equalsIgnoreCase("admin")) {
			RequestDispatcher rd=request.getRequestDispatcher("welcome");
			rd.forward(request, response);
		}else {
			pw.print("<html><body>Wrong UserName or password</body><html>");
			RequestDispatcher rd=request.getRequestDispatcher("/Login.html");
			rd.include(request, response);
			
		}
	}

}
