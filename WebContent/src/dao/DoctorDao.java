package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Doctor;
import utility.ConnectionManager;

public class DoctorDao implements DoctorDaoInterface {

	@Override
	public boolean loginuser(Doctor doctor) throws ClassNotFoundException {
		boolean status = false;
		
		try {
			try
			{
				Connection con = ConnectionManager.getConnection();
				PreparedStatement ps = con.prepareStatement("select * from doctor_login where username = ? and pass = ?");
				ps.setString(1, doctor.getEmail());
				ps.setString(2, doctor.getPassword());
				System.out.println(ps);
				ResultSet rs = ps.executeQuery();
				status = rs.next();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}

}