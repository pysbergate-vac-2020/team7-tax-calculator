package com.psybergate.vacwork202006.service;

import com.psybergate.vacwork202006.dao.*;

import com.psybergate.vacwork202006.taxcalculator.*;

public class RegisterService {
	
	public static int registerUser(String userFirstName, String userLastName, String userTaxNumber,
			double salary, double bonus, double interest, double purchasePrice, double additionalExpenses, double sellingPrice,
			double retirementFund, double travelAllowance) {
		PersonDAO dbManager = new PersonDAO();
		
		try {
			dbManager.insertNewPerson(userFirstName, userLastName, userTaxNumber);
			CapitalGain capitalGain = new CapitalGain(purchasePrice, additionalExpenses, sellingPrice);
			Income income = new Income(salary, bonus, interest, capitalGain);
			int taxableIncome = (int)income.calTotalTaxableIncome();
			dbManager.insertPersonIncome(userTaxNumber, income, taxableIncome);
			dbManager.insertPersonExpenses(userTaxNumber, (int)retirementFund, (int)travelAllowance);
			return 0;
		} catch (Exception e) {
			System.out.println("RegisterService Error: Could not register new user.");
			return -1;
		}
	}
}
