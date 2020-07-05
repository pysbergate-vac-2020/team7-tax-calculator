package com.psybergate.vac202006;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Income {
	private double Salary, Bonus, interestRecieved;
	private double totalCapitalGainTaxable;
	private int numberofAssetsDisposed;
	private List<CapitalGain>listOFCapitalGains=new ArrayList();
	private CapitalGain capitalgain;
	
	
	public Income(double personSalary, double personBonus, double interestRecieved, int numberofAssetsDisposed) {
		this.Salary = personSalary;
		this.Bonus = personBonus;
		this.interestRecieved = interestRecieved;
		this.numberofAssetsDisposed = numberofAssetsDisposed;
	}

	private double getPersonSalary() {
		return Salary;
	}

	private double getPersonBonus() {
		return Bonus;
	}

	private double getInterestRecieved() {
		return interestRecieved;
	}

	private int getNumberofAssetsDisposed() {
		return numberofAssetsDisposed;
	}
	
	private void getCapitalGains() {
		for(int i=0;i<numberofAssetsDisposed;i++) {
			Scanner in= new Scanner(System.in);
			System.out.println("Purchase Price?");
			double purchasePrice=in.nextDouble();
			System.out.println("Additional expenses made?");
			double additionalExpenses=in.nextDouble();
			System.out.println("Sell Price?");
			double sellPrice=in.nextDouble();
			System.out.println("Was the Asset a primary residence");
			boolean primaryRes=in.nextBoolean();
			capitalgain=new CapitalGain(purchasePrice,additionalExpenses,sellPrice,primaryRes);
			listOFCapitalGains.add(capitalgain);
		}	
	}

	private double calTaxFromInterest() {
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
		double TaxableInterest = calTaxFromInterest();
		getCapitalGains();
		double totalTaxableCapitalGain = CapitalGain.getTotalTaxableCapitalGain(listOFCapitalGains);
		double totalTaxableIncome = taxableSalary + taxableBonus + TaxableInterest + totalTaxableCapitalGain;
		System.out.println("Total Taxable income = " + totalTaxableIncome);
		return totalTaxableIncome;
	}

}
