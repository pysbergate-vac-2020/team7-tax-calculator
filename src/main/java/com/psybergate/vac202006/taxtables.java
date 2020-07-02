package com.psybergate.vac202006;

public class taxtables {
	
	final double RATE1 = 0.18 ;
	final double RATE2 = 0.26;
	final double RATE3 = 0.31;
	final double RATE4 = 0.36;
	final double RATE5 = 0.39;
	final double RATE6 = 0.41 ;
	final double RATE7 = 0.45 ;
	
	final double noTaxBracket = 79_000.00;
	final double bracketOne = 205_900.00 ;
	final double bracketTwo  = 321_600.00;
	final double bracketThree = 445_100.00;
	final double bracketFour = 584_200.00;
	final double bracketFive = 744_800.00 ;
	final double bracketSix = 1_577_300.00 ;
	
	
	private double netIncome;
	private double Taxamount;

	public taxtables(double netIncome) {
		this.netIncome = netIncome;
	}

	public double getNetIncome() {
		return this.netIncome;
	}
	
	private double noTax() {
		return 0.00;
	}

	private double taxBracketOne() {
		return RATE1 * getNetIncome();
	}

	private double taxBracketTwo() {
		return RATE1*bracketOne 
                + RATE2 * (getNetIncome() - bracketOne );
	}
	
	private double taxBracketThree() {
		return RATE1*bracketOne + RATE2* (bracketTwo-bracketOne-1)
                + RATE3 * (getNetIncome() - bracketOne - (bracketTwo-bracketOne-1));
	}
	
	private double taxBracketFour() {
		return RATE1*bracketOne + RATE2* (bracketTwo-bracketOne-1)
				+ RATE3*(bracketThree-bracketTwo-1)
				+RATE4*(getNetIncome()-bracketOne - 
						(bracketTwo-bracketOne-1)-(bracketThree-bracketTwo-1));
	}
	
	private double taxBracketFive() {
		return RATE1*bracketOne + RATE2* (bracketTwo-bracketOne-1)
				+ RATE3*(bracketThree-bracketTwo-1)
				+RATE4*(bracketFour-bracketThree-1)
                + RATE5 * (getNetIncome() - bracketOne - 
                		(bracketTwo-bracketOne-1)-
                		(bracketThree-bracketTwo-1)-
                		(bracketFour-bracketThree-1)
                		);
	}
	
	private double taxBracketSix() {
		return RATE1*bracketOne + 
				RATE2* (bracketTwo-bracketOne-1)
				+ RATE3*(bracketThree-bracketTwo-1)
				+RATE4*(bracketFour-bracketThree-1)+
				RATE5*(bracketFive-bracketFour-1)+
				RATE6 * (getNetIncome() - bracketOne - 
                		(bracketTwo-bracketOne-1)-
                		(bracketThree-bracketTwo-1)-
                		(bracketFour-bracketThree-1)-
                		(bracketFive-bracketFour-1)
                		);
				
	}
	
	private double taxBracketSeven() {
		return RATE1*bracketOne+ 
			   RATE2* (bracketTwo-bracketOne-1)+ 
			   RATE3*(bracketThree-bracketTwo-1)
			   +RATE4*(bracketFour-bracketThree-1)+
			   +RATE5*(bracketFive-bracketFour-1)+
			   RATE6*(bracketSix-bracketFive-1)+
			   RATE7 * (getNetIncome() - bracketOne - 
               		(bracketTwo-bracketOne-1)-
               		(bracketThree-bracketTwo-1)-
               		(bracketFour-bracketThree-1)-
               		(bracketFive-bracketFour-1)-
               		(bracketSix-bracketFive-1)
               		);
			   
	}
	

	
	
	public int calctax() {
		if (getNetIncome() <= noTaxBracket) {
			Taxamount=noTax();
		}
		else if (netIncome <= bracketOne) {
			Taxamount=taxBracketOne();
		}
		else if (netIncome <= bracketTwo) {
			Taxamount=taxBracketTwo();
		}
		else if (netIncome <= bracketThree) {
			Taxamount=taxBracketThree();
		}
		else if (netIncome <= bracketFour)
		{
			Taxamount=taxBracketFour();
		}
		else if (netIncome <= bracketFive)
		{
			Taxamount=taxBracketFive();
		}
		else if (netIncome <= bracketSix)
		{
			Taxamount=taxBracketSix();
		}
		else
		{
			Taxamount=taxBracketSeven();
			
		}
		return (int) Taxamount;
		
		}
			

	public static void main(String[] args) {
		taxtables tax = new taxtables(215900);
		System.out.println(tax.calctax());
		//double amount=tax.calctax();
		

	}

}
