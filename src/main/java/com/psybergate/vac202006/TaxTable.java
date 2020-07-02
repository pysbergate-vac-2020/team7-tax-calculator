package com.psybergate.vac202006;

public class TaxTable {
	
	final double rate1 = 0.18 ;
	final double rate2 = 0.26;
	final double rate3 = 0.31;
	final double rate4 = 0.36;
	final double rate5 = 0.39;
	final double rate6 = 0.41 ;
	final double rate7 = 0.45 ;
	
	final double noTaxBracket = 79_000.00;
	final double bracketOne = 205_900.00 ;
	final double bracketTwo  = 321_600.00;
	final double bracketThree = 445_100.00;
	final double bracketFour = 584_200.00;
	final double bracketFive = 744_800.00 ;
	final double bracketSix = 1_577_300.00 ;
	
	
	private double netIncome;
	private double taxAmount;

	public TaxTable(double netIncome) {
		this.netIncome = netIncome;
	}

	public double getNetIncome() {
		return this.netIncome;
	}
	
	private double noTax() {
		return 0.00;
	}

	private double taxBracketOne() {
		return rate1 * getNetIncome();
	}

	private double taxBracketTwo() {
		return rate1*bracketOne 
                + rate2 * (getNetIncome() - bracketOne );
	}
	
	private double taxBracketThree() {
		return rate1*bracketOne + rate2* (bracketTwo-bracketOne-1)
                + rate3 * (getNetIncome() - bracketOne - (bracketTwo-bracketOne-1));
	}
	
	private double taxBracketFour() {
		return rate1*bracketOne + rate2* (bracketTwo-bracketOne-1)
				+ rate3*(bracketThree-bracketTwo-1)
				+rate4*(getNetIncome()-bracketOne - 
						(bracketTwo-bracketOne-1)-(bracketThree-bracketTwo-1));
	}
	
	private double taxBracketFive() {
		return rate1*bracketOne + rate2* (bracketTwo-bracketOne-1)
				+ rate3*(bracketThree-bracketTwo-1)
				+rate4*(bracketFour-bracketThree-1)
                + rate5 * (getNetIncome() - bracketOne - 
                		(bracketTwo-bracketOne-1)-
                		(bracketThree-bracketTwo-1)-
                		(bracketFour-bracketThree-1)
                		);
	}
	
	private double taxBracketSix() {
		return rate1*bracketOne + 
				rate2* (bracketTwo-bracketOne-1)
				+ rate3*(bracketThree-bracketTwo-1)
				+rate4*(bracketFour-bracketThree-1)+
				rate5*(bracketFive-bracketFour-1)+
				rate6 * (getNetIncome() - bracketOne - 
                		(bracketTwo-bracketOne-1)-
                		(bracketThree-bracketTwo-1)-
                		(bracketFour-bracketThree-1)-
                		(bracketFive-bracketFour-1)
                		);
				
	}
	
	private double taxBracketSeven() {
		return rate1*bracketOne+ 
			   rate2* (bracketTwo-bracketOne-1)+ 
			   rate3*(bracketThree-bracketTwo-1)
			   +rate4*(bracketFour-bracketThree-1)+
			   +rate5*(bracketFive-bracketFour-1)+
			   rate6*(bracketSix-bracketFive-1)+
			   rate7 * (getNetIncome() - bracketOne - 
               		(bracketTwo-bracketOne-1)-
               		(bracketThree-bracketTwo-1)-
               		(bracketFour-bracketThree-1)-
               		(bracketFive-bracketFour-1)-
               		(bracketSix-bracketFive-1)
               		);
			   
	}
	

	
	
	public int calctax() {
		if (getNetIncome() <= noTaxBracket) {
			taxAmount=noTax();
		}
		else if (netIncome <= bracketOne) {
			taxAmount=taxBracketOne();
		}
		else if (netIncome <= bracketTwo) {
			taxAmount=taxBracketTwo();
		}
		else if (netIncome <= bracketThree) {
			taxAmount=taxBracketThree();
		}
		else if (netIncome <= bracketFour)
		{
			taxAmount=taxBracketFour();
		}
		else if (netIncome <= bracketFive)
		{
			taxAmount=taxBracketFive();
		}
		else if (netIncome <= bracketSix)
		{
			taxAmount=taxBracketSix();
		}
		else
		{
			taxAmount=taxBracketSeven();
			
		}
		return (int) taxAmount;
		
		}
			

	public static void main(String[] args) {
		TaxTable tax = new TaxTable(215900);
		System.out.println(tax.calctax());
		//double amount=tax.calctax();
		

	}

}
