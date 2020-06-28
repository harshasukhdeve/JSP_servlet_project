package dao;

import model.User;

public interface UserDaoInterface {
	
	boolean signup(User user) throws ClassNotFoundException;
	boolean loginuser(User user) throws ClassNotFoundException;

}