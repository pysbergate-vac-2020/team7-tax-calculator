package com.psybergate.vac202006;


public class CapitalGains {

	private static double Inclusionrate = 0.4;
 	
	//Calculate Base cost
	private static double BaseCostofProperty(double purchaseprice, double additionalExpenditure) {
		double baseCost = purchaseprice + additionalExpenditure;
		return baseCost;
	}
	//Calculate Capital gain for Primary Res
	private static double CalCapitalGain(double sellprice, double basecosts) {
		double CG = sellprice - basecosts-2000000;
		if (CG > 0) {
		double CGwithInclusion = CG * Inclusionrate; 
		return CGwithInclusion;
		}else return 0;
		
	}
	
	//Calculate Capital gain for NON Primary Res
		private static double CalCapitalGainNONPrimary(double sellprice, double basecosts) {
			double CG = sellprice - basecosts;
			double CGwithInclusion = CG * Inclusionrate;  
			return CGwithInclusion;
		}

	private static double CalNetCapitalGains(double originalPrice,double totalExpendituresMadetoAsset,double PriceSold,boolean PrimaryRes) {
		
		if (PrimaryRes==true) {
			double basecost=BaseCostofProperty(originalPrice,totalExpendituresMadetoAsset);
			double capitalgain=CalCapitalGain(PriceSold,basecost);
			System.out.println("This is a Primary Res and base cost= "+ basecost+ " and Capital Gain = "+ capitalgain);
			return capitalgain;
		}else {
			double basecost=BaseCostofProperty(originalPrice,totalExpendituresMadetoAsset);
			double capitalgain=CalCapitalGainNONPrimary(PriceSold,basecost);
			System.out.println("This is a non primary Res therefor the base cost= "+ basecost+ " and Capital Gain = "+ capitalgain);
			return capitalgain;

		}
      
		
	}
	
	
 

	public static void main(String[] args) {
		
		double Answer=CalNetCapitalGains(1000000,300000,5000000,false);
		System.out.println("Total Taxable capital gains income for you is :"+ Answer + ".");
		
		
	}

}
