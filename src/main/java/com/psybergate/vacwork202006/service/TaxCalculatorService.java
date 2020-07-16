package com.psybergate.vacwork202006.service;

import com.psybergate.vacwork202006.dao.*;
import com.psybergate.vacwork202006.taxcalculator.*;

public class TaxCalculatorService {
	
<<<<<<< HEAD
	private static int getIncomeSalary(String userTaxNumber) {
=======
	public int getIncomeCapitalGain(String userTaxNumber) {
>>>>>>> 529db0ccfb2b8b00067d6ed807d1c748f6e52dce
		try {
			PersonDAO dbManager = new PersonDAO();
			return dbManager.getPersonIncomeSalary(userTaxNumber);
		} catch (Exception e) {
			System.out.println("Tax Calculator Service Error: Could not get Salary from database.");
			return -1;
		}
	}
	
<<<<<<< HEAD
	private static int getIncomeBonus(String userTaxNumber) {
=======
	public int getIncomeSalary(String userTaxNumber) {
>>>>>>> 529db0ccfb2b8b00067d6ed807d1c748f6e52dce
		try {
			PersonDAO dbManager = new PersonDAO();
			return dbManager.getPersonIncomeBonus(userTaxNumber);
		} catch (Exception e) {
			System.out.println("Tax Calculator Service Error: Could not get Bonus from database.");
			return -1;
		}
	}
	
<<<<<<< HEAD
	private static int getIncomeInterest(String userTaxNumber) {
=======
	public int getIncomeBonus(String userTaxNumber) {
>>>>>>> 529db0ccfb2b8b00067d6ed807d1c748f6e52dce
		try {
			PersonDAO dbManager = new PersonDAO();
			return dbManager.getPersonIncomeInterest(userTaxNumber);
		} catch (Exception e) {
			System.out.println("Tax Calculator Service Error: Could not get Interest from database.");
			return -1;
		}
	}
	
<<<<<<< HEAD
	private static int getIncomeCapitalGain(String userTaxNumber) {
		try {
			PersonDAO dbManager = new PersonDAO();
			return dbManager.getPersonIncomeCapitalGain(userTaxNumber);
		} catch (Exception e) {
			System.out.println("Tax Calculator Service Error: Could not get Capital Gain from database.");
			return -1;
		}
	}
	
	private static int getTaxableIncome(String userTaxNumber) {
		try {
			PersonDAO dbManager = new PersonDAO();
			return dbManager.getPersonTaxableIncome(userTaxNumber);
		} catch (Exception e) {
			System.out.println("Tax Calculator Service Error: Could not get Taxable Income from database.");
			return -1;
		}
	}
	
	private static int getExpensesRetirementFund(String userTaxNumber) {
=======
	public int getExpensesRetirementFund(String userTaxNumber) {
>>>>>>> 529db0ccfb2b8b00067d6ed807d1c748f6e52dce
		try {
			PersonDAO dbManager = new PersonDAO();
			return dbManager.getPersonExpensesRetirementFund(userTaxNumber);
		} catch (Exception e) {
			System.out.println("Tax Calculator Service Error: Could not get Retirement Fund from database.");
			return -1;
		}
	}
	
<<<<<<< HEAD
	private static int getExpensesTravelAllowance(String userTaxNumber) {
=======
	public int getExpensesTravelAllowance(String userTaxNumber) {
>>>>>>> 529db0ccfb2b8b00067d6ed807d1c748f6e52dce
		try {
			PersonDAO dbManager = new PersonDAO();
			return dbManager.getPersonExpensesTravelAllowance(userTaxNumber);
		} catch (Exception e) {
			System.out.println("Tax Calculator Service Error: Could not get Travel Allowance from database.");
			return -1;
		}
	}
	
	public static double getNetTaxPayable(String userTaxNumber) {
		//return 700000;//dummy var
		double salary = getIncomeSalary(userTaxNumber);
		double bonus = getIncomeBonus(userTaxNumber);
		double interest = getIncomeInterest(userTaxNumber);
		double capitalGain = getIncomeCapitalGain(userTaxNumber);
		double retirementFund = getExpensesRetirementFund(userTaxNumber);
		double travelAllowance = getExpensesTravelAllowance(userTaxNumber);
		
		double taxableIncome = getTaxableIncome(userTaxNumber);
		Expense expenses = new Expense(travelAllowance, retirementFund, salary + bonus);
		double minusExpenses = taxableIncome - expenses.returnExpenses();
		
		TaxTable taxTable = new TaxTable(minusExpenses);
		double fromTaxTable = taxTable.totalPayableTax();
		
		Nettaxpayable netTaxPayable = new Nettaxpayable(fromTaxTable);
		
		return netTaxPayable.CalcNetPayable();
	}

	public static void main(String[] args) {
		System.out.println(getNetTaxPayable("98976678"));
	}
}
