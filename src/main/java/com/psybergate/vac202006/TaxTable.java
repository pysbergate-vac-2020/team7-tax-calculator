package com.psybergate.vac202006;

public class TaxTable {
	
	final double RATE_ONE = 0.18 ;
	final double RATE_TWO = 0.26;
	final double RATE_THREE = 0.31;
	final double RATE_FOUR = 0.36;
	final double RATE_FIVE = 0.39;
	final double RATE_SIX = 0.41 ;
	final double RATE_SEVEN = 0.45 ;
	
	final double NO_BRACKET_TAX = 79_000.00;
	final double BRACKET_ONE = 205_900.00 ;
	final double BRACKET_TWO  = 321_600.00;
	final double BRACKE_THREE = 445_100.00;
	final double BRACKET_FOUR = 584_200.00;
	final double BRACKET_FIVE = 744_800.00 ;
	final double BRACKET_SIX = 1_577_300.00 ;
	
	
	private double netIncome;
	private double taxAmount;

	public TaxTable(double netIncome) {
		this.netIncome = netIncome;
	}

	private double getNetIncome() {
		return this.netIncome;
	}
	
	private double getNoTax() {
		return 0.00;
	}
	
	
	private double getTaxBracketOne() {
		return RATE_ONE * getNetIncome();
	}
	
	private double getTaxBracketTwo() {
		return RATE_ONE*BRACKET_ONE 
                + RATE_TWO * (getNetIncome() - BRACKET_ONE );
	}
	
	private double getTaxBracketThree() {
		return RATE_ONE*BRACKET_ONE + RATE_TWO* (BRACKET_TWO-BRACKET_ONE-1)
                + RATE_THREE * (getNetIncome() - BRACKET_ONE - (BRACKET_TWO-BRACKET_ONE-1));
	}
	
	private double getTaxBracketFour() {
		return RATE_ONE*BRACKET_ONE + RATE_TWO* (BRACKET_TWO-BRACKET_ONE-1)
				+ RATE_THREE*(BRACKE_THREE-BRACKET_TWO-1)
				+RATE_FOUR*(getNetIncome()-BRACKET_ONE - 
						(BRACKET_TWO-BRACKET_ONE-1)-(BRACKE_THREE-BRACKET_TWO-1));
	}
	
	private double getTaxBracketFive() {
		return RATE_ONE*BRACKET_ONE + RATE_TWO* (BRACKET_TWO-BRACKET_ONE-1)
				+ RATE_THREE*(BRACKE_THREE-BRACKET_TWO-1)
				+RATE_FOUR*(BRACKET_FOUR-BRACKE_THREE-1)
                + RATE_FIVE * (getNetIncome() - BRACKET_ONE - 
                		(BRACKET_TWO-BRACKET_ONE-1)-
                		(BRACKE_THREE-BRACKET_TWO-1)-
                		(BRACKET_FOUR-BRACKE_THREE-1)
                		);
	}
	
	private double getTaxBracketSix() {
		return RATE_ONE*BRACKET_ONE + 
				RATE_TWO* (BRACKET_TWO-BRACKET_ONE-1)
				+ RATE_THREE*(BRACKE_THREE-BRACKET_TWO-1)
				+RATE_FOUR*(BRACKET_FOUR-BRACKE_THREE-1)+
				RATE_FIVE*(BRACKET_FIVE-BRACKET_FOUR-1)+
				RATE_SIX * (getNetIncome() - BRACKET_ONE - 
                		(BRACKET_TWO-BRACKET_ONE-1)-
                		(BRACKE_THREE-BRACKET_TWO-1)-
                		(BRACKET_FOUR-BRACKE_THREE-1)-
                		(BRACKET_FIVE-BRACKET_FOUR-1)
                		);
				
	}
	
	private double getTaxBracketSeven() {
		return RATE_ONE*BRACKET_ONE+ 
			   RATE_TWO* (BRACKET_TWO-BRACKET_ONE-1)+ 
			   RATE_THREE*(BRACKE_THREE-BRACKET_TWO-1)
			   +RATE_FOUR*(BRACKET_FOUR-BRACKE_THREE-1)+
			   +RATE_FIVE*(BRACKET_FIVE-BRACKET_FOUR-1)+
			   RATE_SIX*(BRACKET_SIX-BRACKET_FIVE-1)+
			   RATE_SEVEN * (getNetIncome() - BRACKET_ONE - 
               		(BRACKET_TWO-BRACKET_ONE-1)-
               		(BRACKE_THREE-BRACKET_TWO-1)-
               		(BRACKET_FOUR-BRACKE_THREE-1)-
               		(BRACKET_FIVE-BRACKET_FOUR-1)-
               		(BRACKET_SIX-BRACKET_FIVE-1)
               		);
			   
	}
	

	
	
	public int getCalcTaxAmount() {
		if (getNetIncome() <= NO_BRACKET_TAX) {
			taxAmount=getNoTax();
		}
		else if (netIncome <= BRACKET_ONE) {
			taxAmount=getTaxBracketOne();
		}
		else if (netIncome <= BRACKET_TWO) {
			taxAmount=getTaxBracketTwo();
		}
		else if (netIncome <= BRACKE_THREE) {
			taxAmount=getTaxBracketThree();
		}
		else if (netIncome <= BRACKET_FOUR)
		{
			taxAmount=getTaxBracketFour();
		}
		else if (netIncome <= BRACKET_FIVE)
		{
			taxAmount=getTaxBracketFive();
		}
		else if (netIncome <= BRACKET_SIX)
		{
			taxAmount=getTaxBracketSix();
		}
		else
		{
			taxAmount=getTaxBracketSeven();
			
		}
		return (int) taxAmount;
		
		}
			

	public static void main(String[] args) {
		TaxTable tax = new TaxTable(215900);
		System.out.println(tax.getCalcTaxAmount());
		//double amount=tax.calctax();
		

	}

}
