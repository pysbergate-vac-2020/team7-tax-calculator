package com.psybergate.vac202006;

public class taxtables {
	
	final double RATE1 = 0.18 ;
	final double RATE2 = 0.26;
	final double RATE3 = 0.31;
	final double RATE4 = 0.36;
	final double RATE5 = 0.39;
	final double RATE6 = 0.41 ;
	final double RATE7 = 0.45 ;
	
	final double noTaxBracket = 14_220;
	final double bracketOne = 205_900_00 ;
	final double bracketTwo  = 321_600_00;
	final double bracketThree = 445_100_00;
	final double bracketFour = 584_200_00;
	final double bracketFive = 744_800_00 ;
	final double bracketSix = 1_577_300_00 ;
	
	
	private double netIncome;

	public taxtables(double netIncome) {
		this.netIncome = netIncome;
	}

	public double getNetIncome() {
		return netIncome;
	}
	
	public double noTax() {
		return 0.00;
	}

	public double taxBracketOne() {
		return RATE1 * getNetIncome();
	}

	public double taxBracketTwo() {
		return taxBracketOne() 
                + RATE2 * (getNetIncome() - bracketOne );
	}
	
	public double taxBracketThree() {
		return taxBracketTwo()
                + RATE3 * (getNetIncome() - bracketOne - bracketThree);
	}
	
	public double taxBracketFour() {
		return taxBracketThree()
                + RATE4 * (getNetIncome() - bracketOne - 
                		bracketThree-bracketFour);
	}
	
	public double taxBracketFive() {
		return taxBracketFive()
                + RATE5 * (getNetIncome() - bracketOne - 
                		bracketThree-bracketFour- bracketFive);
	}
	
	public double taxBracketsix() {
		return taxBracketFive()
                + RATE6 * (getNetIncome() - bracketOne - 
                		bracketThree-bracketFour-bracketFive
                		-bracketSix);
	}
	
	public double taxBracketseven() {
		return taxBracketsix()
                + RATE7 * (getNetIncome() - bracketOne - 
                		bracketThree-bracketFour-bracketFive
                		-bracketSix-bracketSeven);
	}
	
	public void calctax() {
		if (netIncome < noTaxBracket) {
			System.out.println("This will be printed");
		}
		else if (netIncome < bracketOne) {
			System.out.println("This will be printed");
		}
		else if (netIncome < bracketTwo) {
			System.out.println("This will be printed");
		}
		else if (netIncome < bracketThree) {
			System.out.println("This will be printed");
		}
		else if (netIncome < bracketFour)
		{
			System.out.println("This will be printed");
		}
		else if (netIncome < bracketFive)
		{
			System.out.println("This will be printed");
		}
		else if (netIncome < bracketSix)
		{
			System.out.println("This will be printed");
		}
		else if (netIncome < bracketSeven)
		{
			System.out.println("This will be printed");
		}
		else
		{
			System.out.println("This will be printed");
			
		}
			
		
	}




	public static void main(String[] args) {
		System.out.println("hello");

	}

}
