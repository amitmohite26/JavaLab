

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThirdPage
 */
public class ThirdPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThirdPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String State=request.getParameter("State");
		String City=request.getParameter("City");
		PrintWriter out = response.getWriter();
		out.println("<hmtl><head>");
		out.println("</head><body>");
		out.println("<form name=\"f3\" method=\"POST\" action=\"FourthPage\">");
		out.println("First Name:"+fname);
		out.println("<br><br>");
		out.println("Last Name:"+lname);
		out.println("<br><br>");
		out.println("State:"+State);
		out.println("<br><br>");
		out.println("City:"+City);
		out.println("<br><br>");
		out.println("Phone:<input type=\"text\" name=\"Phone\">");
		out.println("<br>");
		out.println("<br>");
		out.println("Email:<input type=\"text\" name=\"Email\">");
		out.println("<br>");
		out.println("<br>");
		out.println("<input type=\"submit\" name=\"Submit\" value=submit>");
		out.println("</form></body></html>");
	}

}
