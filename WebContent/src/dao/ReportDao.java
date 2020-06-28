package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Report;
import utility.ConnectionManager;

public class ReportDao implements ReportDaoInterface
{
	final String INSERT_REPORT = "INSERT INTO report VALUES(seq_report.nextval, ?, ?, ?, ?, ?, ?, ?)";
	final String SELECT_ALL_REPORT = "SELECT * FROM report";
	final String DELETE_REPORT = "DELETE FROM report WHERE ID = ?";

	@Override
	public void insertreport(Report report) throws ClassNotFoundException 
	{
		
		try
		{
			Connection con = ConnectionManager.getConnection();
			PreparedStatement ps = con.prepareStatement(INSERT_REPORT);
			ps.setString(1, report.getName());
			ps.setInt(2, report.getAge());
			ps.setString(3, report.getGender());
			ps.setString(4, report.getWeight());
			ps.setString(5, report.getHeight());
			ps.setString(6, report.getQuery());
			ps.setString(7, report.getMobile());
			
			ps.executeUpdate();
			con.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Report> selectallreports() throws ClassNotFoundException, SQLException {
		
		Report report = null;
		List<Report> reportlist = new ArrayList<Report>();
		
		Connection con = ConnectionManager.getConnection();
		try
		{
			PreparedStatement ps = con.prepareStatement(SELECT_ALL_REPORT);
			System.out.println(ps);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String gender = rs.getString("gender");
				String weight = rs.getString("weight");
				String height = rs.getString("height");
				String query = rs.getString("query");
				String mobile = rs.getString("mobile");
				
				report = new Report();
				
				report.setId(id);
				report.setName(name);
				report.setAge(age);
				report.setGender(gender);
				report.setWeight(weight);
				report.setHeight(height);
				report.setQuery(query);
				report.setMobile(mobile);
				
				reportlist.add(report);	
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return reportlist;
	}

	@Override
	public boolean deletereport(int id) throws SQLException, Exception {
		System.out.println(id);
		boolean deleted;
		Connection con = ConnectionManager.getConnection();
		PreparedStatement ps = con.prepareStatement(DELETE_REPORT);
		ps.setInt(1, id);
		deleted = ps.executeUpdate()>0;
		return deleted;
	}

}