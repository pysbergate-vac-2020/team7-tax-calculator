package com.psybergate.vacwork202006.service;

import com.psybergate.vacwork202006.dao.*;

public class TaxCalculatorService {
	
	private int getIncomeCapitalGain(String userTaxNumber) {
		try {
			DatabaseManager dbManager = new DatabaseManager();
			return dbManager.getPersonIncomeCapitalGain(userTaxNumber);
		} catch (Exception e) {
			System.out.println("Tax Calculator Service Error: Could not get Capital Gain from database.");
			return -1;
		}
	}
	
	private int getIncomeSalary(String userTaxNumber) {
		try {
			DatabaseManager dbManager = new DatabaseManager();
			return dbManager.getPersonIncomeSalary(userTaxNumber);
		} catch (Exception e) {
			System.out.println("Tax Calculator Service Error: Could not get Income Salary from database.");
			return -1;
		}
	}
	
	private int getIncomeBonus(String userTaxNumber) {
		try {
			DatabaseManager dbManager = new DatabaseManager();
			return dbManager.getPersonIncomeBonus(userTaxNumber);
		} catch (Exception e) {
			System.out.println("Tax Calculator Service Error: Could not get Income Bonus from database.");
			return -1;
		}
	}
	
	private int getExpensesRetirementFund(String userTaxNumber) {
		try {
			DatabaseManager dbManager = new DatabaseManager();
			return dbManager.getPersonExpensesRetirementFund(userTaxNumber);
		} catch (Exception e) {
			System.out.println("Tax Calculator Service Error: Could not get Retirement Fund from database.");
			return -1;
		}
	}
	
	private int getExpensesTravelAllowance(String userTaxNumber) {
		try {
			DatabaseManager dbManager = new DatabaseManager();
			return dbManager.getPersonExpensesTravelAllowance(userTaxNumber);
		} catch (Exception e) {
			System.out.println("Tax Calculator Service Error: Could not get Travel Allowance from database.");
			return -1;
		}
	}
	
	public static int getNetTaxPayable(String userTaxNumber) {
		
	}

	public static void main(String[] args) {
		
	}
}
