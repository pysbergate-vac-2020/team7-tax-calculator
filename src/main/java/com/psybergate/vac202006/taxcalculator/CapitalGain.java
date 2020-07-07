package com.psybergate.vac202006.taxcalculator;

import java.util.List;

public class CapitalGain {

	private double purchasePrice;
	private double sellPrice;
	private double additionalExpenses;
	private double INCLUSION_RATE = 0.4;

	public CapitalGain(double pPrice, double aExpenses, double sPrice) {
		super();
		this.purchasePrice = pPrice;
		this.additionalExpenses = aExpenses;
		this.sellPrice = sPrice;
	}

	private double getAdditionalExpenses() {
		return additionalExpenses;
	}

	private double getPurchasePrice() {
		return purchasePrice;
	}

	private double getSellPrice() {
		return sellPrice;
	}
	
	// Calculate Base cost
	private double BaseCost(double purchaseprice, double additionalExpenditure) {
		double baseCost = purchaseprice + additionalExpenditure;
		return baseCost;
	}

	// Calculate Capital gain for NON Primary Res
	private double CalculateTaxableCapitalGain(double sellprice, double basecosts) {
		double CG = sellprice - basecosts;
		double CGwithInclusion = CG * INCLUSION_RATE;
		return CGwithInclusion;
	}
 
	public double capitalGainFromAsset() {
		double additionalExpensesmade = getAdditionalExpenses();
		double sellPrice = getSellPrice();
		double purchasePrice = getPurchasePrice();
		double basecost = BaseCost(purchasePrice, additionalExpensesmade);
		double taxable_capital_gain = CalculateTaxableCapitalGain(sellPrice, basecost);
		return taxable_capital_gain;

	}
	 
	

}
