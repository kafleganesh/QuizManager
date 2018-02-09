package fr.epita.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Authenticate
 */
public class Authenticate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Authenticate() {
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
		final String email = request.getParameter("email");
		final String password = request.getParameter("password");
		final HttpSession session = request.getSession();
		// TODO you have to implement a *REAL* authentication mechanism

		if ("teacher@gmail.com".equals(email) && "teacher".equals(password)) {
			session.setAttribute("authenticated", true);
			request.getRequestDispatcher("Teacher.jsp").forward(request, response);
			


		
		}
		else if("student@gmail.com".equals(email) && "student".equals(password)){
			session.setAttribute("authenticated", true);
			request.getRequestDispatcher("Student.jsp").forward(request, response);
		}
			
		
		else{
			request.getRequestDispatcher("LoginFailed.jsp").forward(request, response);
		}
	}

}
