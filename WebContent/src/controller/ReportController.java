package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ReportDao;
import model.Report;

/**
 * Servlet implementation class ReportController
 */
@WebServlet("/ReportController")
public class ReportController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReportController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/ReportListView.jsp");
    	rd.forward(request, response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Entering do post");
		String name = request.getParameter("patientname");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		String weight = request.getParameter("weight");
		String height = request.getParameter("height");
		String query = request.getParameter("query");
		String mobile = request.getParameter("mobile");
		
		Report report = new Report();
		System.out.println(name);
		report.setName(name);
		report.setAge(age);
		report.setGender(gender);
		report.setWeight(weight);
		report.setHeight(height);
		report.setQuery(query);
		report.setMobile(mobile);
		
		ReportDao reportdao = new ReportDao();
		try
		{
			reportdao.insertreport(report);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		response.sendRedirect("HomePageViewController");

	}

}