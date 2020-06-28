package controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import model.User;

/**
 * Servlet implementation class SignupController
 */
@WebServlet("/SignupController")
public class SignupController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/SignupView.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String confirmpassword = request.getParameter("confirmpassword");
		System.out.println(username);
		System.out.println(password);
		User user = new User();
		user.setUsername(username);;
		user.setPassword(password);
		UserDao userdao = new UserDao();
		boolean checkuser = false;
		try {
			checkuser = userdao.signup(user);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(checkuser)
		{
			System.out.println(user.getUsername());
			System.out.println(user.getPassword());
			request.setAttribute("message", "REGISTERATION SUCCESSFUL");
			RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/LoginView.jsp");
			rd.forward(request, response);
		}
		else
		{
			request.setAttribute("message", "CHECK YOUR CREDENTIALS");
			RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/LoginView.jsp");
			rd.forward(request, response);
		}
	}

}