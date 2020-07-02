package com.psybergate.vac202006;

public class Expenses {
	
	//Retirement Funding
	private final double maxDeductablePercentage = 0.275;
	private final double maxDeductableAmount = 350000;
	
	private double salary;

	private double retirementFundingTotal;
	
	//Travel Allowance
	private final double maxTravelAllowance = 80000;
	
	private double travelAllowanceAmount;
	
	private double calcRetirementFundingDeductable() {
		if (retirementFundingTotal > (maxDeductablePercentage * salary)) {
			if (retirementFundingTotal > maxDeductableAmount) {
				return maxDeductableAmount;
			} else {
				return maxDeductablePercentage * salary;
			}
		} else {
			return retirementFundingTotal;
		}
	}
	
	private double calcTravelAllowanceDeductable() {
		if (travelAllowanceAmount > maxTravelAllowance) {
			return maxTravelAllowance;
		} else {
			return travelAllowanceAmount;
		}
	}
	
	public double returnExpenses() {
		return calcRetirementFundingDeductable() + calcTravelAllowanceDeductable();
	}
	
	private Expenses(double travelAllowanceAmount, double retirementFundingTotal, double salary) {
		this.travelAllowanceAmount = travelAllowanceAmount;
		this.retirementFundingTotal = retirementFundingTotal;
		this.salary = salary;
	}

	public static void main(String[] args) {
		System.out.println(new Expenses(40000, 150000, 500000).returnExpenses());
	}
}
