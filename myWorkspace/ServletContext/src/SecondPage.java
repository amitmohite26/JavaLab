

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SecondPage
 */
public class SecondPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondPage() {
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
		ServletContext servletContext = getServletContext();
		String Fname=request.getParameter("Fname");
		String Lname=request.getParameter("Lname");
		
		
		servletContext.getAttribute("Fname");
		servletContext.getAttribute("Lname");
		servletContext.setAttribute("Fname", Fname);
		servletContext.setAttribute("Lname", Lname);
		
		PrintWriter out = response.getWriter();
		out.println("<hmtl><head>");
		out.println("</head><body>");
		out.println("<form name=\"f2\" method=\"POST\" action=\"ThirdPage\">");
		out.println("FName:"+Fname);
		
		out.println("<br><br>");
		out.println("LName:"+Lname);
		
		out.println("<br><br>");
		out.println("State:<input type=\"text\" name=\"State\">");
		out.println("<br>");
		out.println("<br>");
		out.println("City:<input type=\"text\" name=\"City\">");
		out.println("<br>");
		out.println("<br>");
		out.println("<input type=\"submit\" name=\"Submit\" value=\"submit\">");
		out.println("</form></body></html>");
		
	}

}
