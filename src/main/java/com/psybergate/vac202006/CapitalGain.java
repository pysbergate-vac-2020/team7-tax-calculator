package com.psybergate.vac202006;

import java.util.ArrayList;
import java.util.List;

public class CapitalGain {

	private double purchasePrice;
	private double sellPrice;
	private double additionalExpenses;
	private boolean primaryRes;
	private double INCLUSION_RATE = 0.4;
	private double PRIMARY_ASSET_EXEMPTION = -2000000.0;

	public CapitalGain(double pPrice, double aExpenses, double sPrice, boolean primaryRes) {
		super();
		this.purchasePrice = pPrice;
		this.additionalExpenses = aExpenses;
		this.sellPrice = sPrice;
		this.primaryRes = primaryRes;
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

	private boolean isPrimaryRes() {
		return primaryRes;
	}

	// Calculate Base cost
	private double BaseCost(double purchaseprice, double additionalExpenditure) {
		double baseCost = purchaseprice + additionalExpenditure;
		return baseCost;
	}

	// Calculate Capital gain for Primary Res
	private double CalCapitalGain(double sellprice, double basecosts) {
		double CG = sellprice - basecosts + PRIMARY_ASSET_EXEMPTION;
		if (CG > 0) {			
			double CGwithInclusion = CG * INCLUSION_RATE;
			return CGwithInclusion;
		} else
			return 0;
	}

	// Calculate Capital gain for NON Primary Res
	private double CalCapitalGainNONPrimary(double sellprice, double basecosts) {
		double CG = sellprice - basecosts;
		double CGwithInclusion = CG * INCLUSION_RATE;
		return CGwithInclusion;
	}

	public double CalNetCapitalGains(double originalPrice, double totalExpendituresMadetoAsset, double PriceSold,
			boolean PrimaryRes) {

		if (PrimaryRes == true) {
			double basecost = BaseCost(originalPrice, totalExpendituresMadetoAsset);
			double capitalgain = CalCapitalGain(PriceSold, basecost);
			System.out.println("This is a Primary Res and base cost= " + basecost + " and Capital Gain = " + capitalgain);
			System.out.println();
			return capitalgain;

		} else {
			
			double basecost = BaseCost(originalPrice, totalExpendituresMadetoAsset);
			double capitalgain = CalCapitalGainNONPrimary(PriceSold, basecost);
			System.out.println("This is a non primary Res therefor the base cost= " + basecost + " and Capital Gain = "+ capitalgain);
			System.out.println();
			return capitalgain;

		}

	}

	public double capitalGainFromAsset() {
		double additionalExpensesmade = getAdditionalExpenses();
		double sellPrice = getSellPrice();
		double purchasePrice = getPurchasePrice();
		boolean primaryResStatus = isPrimaryRes();
		double taxable_capital_gain = CalNetCapitalGains(purchasePrice, additionalExpensesmade, sellPrice,primaryResStatus);
		return taxable_capital_gain;

	}
	
	public static double getTotalTaxableCapitalGain(List<CapitalGain>listOfCapitalGains) {
 		double totalCapitalGains = 0;
		for (int i = 0; i < listOfCapitalGains.size(); i++) {
			totalCapitalGains += ((CapitalGain) listOfCapitalGains.get(i)).capitalGainFromAsset();
		}
		System.out.println("Total Capital gain fromm all assets = " + totalCapitalGains);
		return totalCapitalGains;
	}
	
	

}
