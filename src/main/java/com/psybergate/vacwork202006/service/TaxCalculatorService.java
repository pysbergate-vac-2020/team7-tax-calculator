package com.psybergate.vacwork202006.service;

import com.psybergate.vacwork202006.dao.*;

public class TaxCalculatorService {
	
	public int getIncomeCapitalGain(String userTaxNumber) {
		try {
			PersonDAO dbManager = new PersonDAO();
			return dbManager.getPersonIncomeCapitalGain(userTaxNumber);
		} catch (Exception e) {
			System.out.println("Tax Calculator Service Error: Could not get Capital Gain from database.");
			return -1;
		}
	}
	
	public int getIncomeSalary(String userTaxNumber) {
		try {
			PersonDAO dbManager = new PersonDAO();
			return dbManager.getPersonIncomeSalary(userTaxNumber);
		} catch (Exception e) {
			System.out.println("Tax Calculator Service Error: Could not get Income Salary from database.");
			return -1;
		}
	}
	
	public int getIncomeBonus(String userTaxNumber) {
		try {
			PersonDAO dbManager = new PersonDAO();
			return dbManager.getPersonIncomeBonus(userTaxNumber);
		} catch (Exception e) {
			System.out.println("Tax Calculator Service Error: Could not get Income Bonus from database.");
			return -1;
		}
	}
	
	public int getExpensesRetirementFund(String userTaxNumber) {
		try {
			PersonDAO dbManager = new PersonDAO();
			return dbManager.getPersonExpensesRetirementFund(userTaxNumber);
		} catch (Exception e) {
			System.out.println("Tax Calculator Service Error: Could not get Retirement Fund from database.");
			return -1;
		}
	}
	
	public int getExpensesTravelAllowance(String userTaxNumber) {
		try {
			PersonDAO dbManager = new PersonDAO();
			return dbManager.getPersonExpensesTravelAllowance(userTaxNumber);
		} catch (Exception e) {
			System.out.println("Tax Calculator Service Error: Could not get Travel Allowance from database.");
			return -1;
		}
	}
	
	public static int getNetTaxPayable(String userTaxNumber) {
		return 700000;//dummy var
	}

	public static void main(String[] args) {
		
	}
}
