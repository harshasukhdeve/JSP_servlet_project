package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DoctorDao;
import dao.UserDao;
import model.Doctor;
import model.User;

/**
 * Servlet implementation class DoctorLoginController
 */
@WebServlet(urlPatterns = {"/DoctorLoginController"})
public class DoctorLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoctorLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/DoctorLoginView.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		Doctor doctor = new Doctor();
		doctor.setEmail(email);
		doctor.setPassword(password);
		
		
		DoctorDao doctordao = new DoctorDao();
		boolean validateuser = false;
		try {
			validateuser = doctordao.loginuser(doctor);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(validateuser)
		{
			RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/ReportView.jsp");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/ReportView.jsp");
			rd.forward(request, response);
		}
	}

}