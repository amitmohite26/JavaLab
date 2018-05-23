

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ThirdPage
 */
@WebServlet("/ThirdPage")
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		HttpSession session=request.getSession(); 
		
//		String state = request.getParameter("state");
//		String city = request.getParameter("city");
		String Fname=(String)session.getAttribute("Fname");
		String Lname=(String)session.getAttribute("Lname");
		String State=request.getParameter("State");
		String City=request.getParameter("City");
		
		PrintWriter out = response.getWriter();
		out.println("<hmtl><head>");
		out.println("</head><body>");
		out.println("<form name=\"f3\" method=\"POST\" action=\"ForthPage\">");
		out.println("FName:"+Fname);
		
		out.println("<br><br>");
		out.println("LName:"+Lname);
		
		out.println("<br><br>");
        out.println("state:"+State);
		
		out.println("<br><br>");
        out.println("city:"+City);
		
		out.println("<br><br>");
		out.println("Phone:<input type=\"text\" name=\"Phone\">");
		out.println("<br>");
		out.println("<br>");
		out.println("Gmail:<input type=\"text\" name=\"Gmail\">");
		out.println("<br>");
		out.println("<br>");
		out.println("<input type=\"submit\" name=\"Submit\" value=\"submit\">");
		out.println("</form></body></html>");
		session.setAttribute("State", request.getParameter("state"));
		session.setAttribute("City", request.getParameter("city"));
	}

}
