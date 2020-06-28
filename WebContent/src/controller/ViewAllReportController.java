package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ReportDao;
import model.Report;

/**
 * Servlet implementation class ViewAllReportController
 */
@WebServlet(urlPatterns = {"/ViewAllReportController"})
public class ViewAllReportController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewAllReportController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("view all report");
		System.out.println("getting all report");
		
		ReportDao reportdao = new ReportDao();
		List<Report> listreport = null;
		
		try
		{
			System.out.println("in try");
			listreport = reportdao.selectallreports();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		for(Report reportlist: listreport)
		{
			System.out.println(reportlist.getId());
			System.out.println(reportlist.getName());
			System.out.println(reportlist.getAge());
			System.out.println(reportlist.getGender());
			System.out.println(reportlist.getWeight());
			System.out.println(reportlist.getHeight());
			System.out.println(reportlist.getQuery());
			System.out.println(reportlist.getMobile());
		}
		request.setAttribute("listreport", listreport);
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/ReportView.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}