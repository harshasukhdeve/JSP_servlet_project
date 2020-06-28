
package dao;

import java.sql.SQLException;
import java.util.List;

import model.Report;

public interface ReportDaoInterface {
	
	void insertreport(Report report) throws SQLException, ClassNotFoundException;
	List<Report> selectallreports() throws SQLException, Exception;
	boolean deletereport(int id) throws SQLException, Exception;
	
}
