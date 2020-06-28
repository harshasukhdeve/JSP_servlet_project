package dao;

import model.Doctor;

public interface DoctorDaoInterface {
	
	boolean loginuser(Doctor doctor) throws ClassNotFoundException;

}