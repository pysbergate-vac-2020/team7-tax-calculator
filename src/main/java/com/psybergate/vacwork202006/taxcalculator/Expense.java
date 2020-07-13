package com.psybergate.vacwork202006.taxcalculator;

public class Expense {
	
	//Retirement Funding
	private final double MAX_DEDUCTABLE_PERCENTAGE = 0.275;
	private final double MAX_DEDUCTABLE_AMOUNT = 350000;
	
	private double salary;
	private double retirementFundingTotal;
	
	//TODO separate classes.
	
	//Travel Allowance
	private final double MAX_TRAVEL_ALLOWANCE = 80000;
	
	private double travelAllowanceAmount;
	
	private double calcRetirementFundingDeductable() {
		if (retirementFundingTotal > (MAX_DEDUCTABLE_PERCENTAGE * salary)) {
			if (retirementFundingTotal > MAX_DEDUCTABLE_AMOUNT) {
				return MAX_DEDUCTABLE_AMOUNT;
			} else {
				return MAX_DEDUCTABLE_PERCENTAGE * salary;
			}
		} else {
			return retirementFundingTotal;
		}
	}
	
	private double calcTravelAllowanceDeductable() {
		if (travelAllowanceAmount > MAX_TRAVEL_ALLOWANCE) {
			return MAX_TRAVEL_ALLOWANCE;
		} else {
			return travelAllowanceAmount;
		}
	}
	
	public double returnExpenses() {
		return calcRetirementFundingDeductable() + calcTravelAllowanceDeductable();
	}
	
	public Expense(double travelAllowanceAmount, double retirementFundingTotal, double salary) {
		this.travelAllowanceAmount = travelAllowanceAmount;
		this.retirementFundingTotal = retirementFundingTotal;
		this.salary = salary;
	}
}
