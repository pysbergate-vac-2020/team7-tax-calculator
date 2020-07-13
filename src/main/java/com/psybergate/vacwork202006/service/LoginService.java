package com.psybergate.vacwork202006.service;

import com.psybergate.vacwork202006.dao.PersonDAO;

public class LoginService {
	
	String UserTaxNumber;
	
	private boolean checkUser(String taxNumber) {
		PersonDAO sqlconnect = new PersonDAO();
		int personID=sqlconnect.getPersonID(taxNumber);
		if( personID == -1 ) {
			return false;
		}else {
			 return true;
		}
		
	}
}
