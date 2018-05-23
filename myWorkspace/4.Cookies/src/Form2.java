

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Page2
 */
public class Form2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Form2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		String Firstname=request.getParameter("firstname");
		String Lastname=request.getParameter("lastname");
		Cookie c1 = new Cookie("firstname",Firstname);
		Cookie c2 = new Cookie("lastname",Lastname);
		response.addCookie(c1);
		response.addCookie(c2);
		out.println("<html><body><h2>");
		out.println("<form action=\"Form3\" method=\"POST\">");
		out.println("Firstname: " +Firstname + "<br>");
		out.println("Lastname: " +Lastname + "<br>"); 
		out.println("State <input name=\"state\" type=\"text\"><br>");
		out.println("City <input name=\"city\" type=\"text\"><br>");
		out.println("<input type=\"Submit\" value=\"Submit\">");
		out.println("</form></h2></body></html>"); 


	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
