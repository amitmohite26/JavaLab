

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ForthPage
 */
@WebServlet("/ForthPage")
public class ForthPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForthPage() {
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
		String Fname = (String)session.getAttribute("Fname");
		String Lname = (String)session.getAttribute("Lname");
		String State = (String)session.getAttribute("State");
		String City = (String)session.getAttribute("City");
		String Phone = request.getParameter("Phone");
		String Gmail = request.getParameter("Gmail");
		
		session.setAttribute("Phone", Phone);
		session.setAttribute("Gmail", Gmail);
		PrintWriter out = response.getWriter();
		out.println("<hmtl><head>");
		out.println("</head><body>");
		out.println("<form name=\"f4\" method=\"POST\">");
		out.println("FName:"+Fname);
		
		out.println("<br><br>");
		out.println("LName:"+Lname);
		
		out.println("<br><br>");
        out.println("state:"+State);
		
		out.println("<br><br>");
        out.println("city:"+City);
		
		out.println("<br><br>");
		
		out.println("Phone:" +Phone);
		out.println("<br>");
		out.println("<br>");
		out.println("Gmail:" +Gmail);
		out.println("<br>");
		out.println("<br>");
		
		out.println("</form></body></html>");
	}

}
