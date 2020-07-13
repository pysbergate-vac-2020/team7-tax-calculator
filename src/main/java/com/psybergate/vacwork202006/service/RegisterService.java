package com.psybergate.vacwork202006.service;

import com.psybergate.vacwork202006.dao.*;

public class RegisterService {
	
	public static int registerUser(String userFirstName, String userLastName, String userTaxNumber) {
		PersonDAO dbManager = new PersonDAO();
		
		try {
			dbManager.insertNewPerson(userFirstName, userLastName, userTaxNumber);
			return 0;
		} catch (Exception e) {
			System.out.println("RegisterService Error: Could not register new user.");
			return -1;
		}
	}
}
