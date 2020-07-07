package com.psybergate.vac202006.taxcalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Income {
	private double Salary, Bonus, interestRecieved;
	private double totalCapitalGainTaxable;
	private CapitalGain capitalGain;
	
	
	public Income(double personSalary, double personBonus, double interestRecieved ,CapitalGain capitalGain) {
		this.Salary = personSalary;
		this.Bonus = personBonus;
		this.interestRecieved = interestRecieved;
		this.capitalGain=capitalGain;
	}

	public double getPersonSalary() {
		return Salary;
	}

	public double getPersonBonus() {
		return Bonus;
	}

	public double getInterestRecieved() {
		return interestRecieved;
	}
	
	public CapitalGain getCapitalGain() {
		return capitalGain;
	}

	private double calculateTaxableIncomeFromInterest() {
		double interestRecieved = getInterestRecieved();
		double taxableIncomeFromIntReceived = interestRecieved - 23500.0;
		if (taxableIncomeFromIntReceived <= 0) {
			return 0;
		} else {
			return taxableIncomeFromIntReceived;
		}

	}

	
	public  double calTotalTaxableIncome() {
		double taxableSalary = getPersonSalary();
		double taxableBonus = getPersonBonus();
		double TaxableInterest = calculateTaxableIncomeFromInterest();
		double totalTaxableCapitalGain = capitalGain.capitalGainFromAsset() ;
		double totalTaxableIncome = taxableSalary + taxableBonus + TaxableInterest + totalTaxableCapitalGain;
		System.out.println("Total Taxable income = " + totalTaxableIncome);
		return totalTaxableIncome;
	}

}
