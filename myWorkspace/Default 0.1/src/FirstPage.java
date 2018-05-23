

import java.io.IOException;
import java.io.PrintWriter;

//import javax.servlet.RequestDispatcher;
//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstPage
 */
public class FirstPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<hmtl><head>");
		out.println("</head><body>");
		out.println("<form name=\"f1\" method=\"POST\" action=\"SecondPage\">");
		out.println("First Name:<input type=\"text\" name=\"Fname\">");
		out.println("<br>");
		out.println("<br>");
		out.println("Last Name:<input type=\"text\" name=\"Lname\">");
		out.println("<br>");
		out.println("<br>");
		out.println("<input type=\"submit\" name=\"submit\" value=\"Submit\">");
		out.println("</form></body></html>");
		
			}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//RequestDispatcher myDispatch = request.getRequestDispatcher("SecondPage.java");

		doGet(request, response);
	}

}
