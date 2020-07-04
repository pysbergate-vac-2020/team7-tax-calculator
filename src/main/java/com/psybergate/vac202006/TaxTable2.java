package com.psybergate.vac202006;

public class TaxTable2 {
	final double TAX_RATES[]= {0.18,0.26,0.31,0.36,0.39,0.41,0.45};
	final double HIGH_TAX_BOUNDARY[] = {79_000.00,205_900.00,321_600.00,
									445_100.00,584_200.00,744_800.00,1_577_300.00};
	final double TAX_RANGES[] = {0,205_900.00,115_699.00,123_499.00,139_099.00,
								160_599.00,832_499.00};
	final double TAX_PAYABLE_RANGES[] = {0,37_062.00,30_081.74,38_284.69,50_075.64,
											62_633.61,341_324.59};
	
	
	private double taxableIncome;
	
	
	public TaxTable2(double taxableIncome) {
		this.taxableIncome = taxableIncome;
	}

	private double getNetIncome() {
		return this.taxableIncome;
	}
	
	private int determinetaxRangeNo() {
		int taxRangeNo=0;
		if(getNetIncome()>1_577_300.00) {
			taxRangeNo=7;
		}
		else {
		while(getNetIncome() > HIGH_TAX_BOUNDARY[taxRangeNo]) {
			taxRangeNo++;
		}
		}
		return taxRangeNo;
	}
	
	private double sumPreviousTaxRange() {
		double subTotalTaxamount=0;
		for(int sumrange=0;sumrange<determinetaxRangeNo();sumrange++) {
			subTotalTaxamount+=TAX_PAYABLE_RANGES[sumrange];
		}
		return subTotalTaxamount;
	}

	private double sumTaxRanges() {
		double sumTaxRanges=0;
		for(int sumrange=0;sumrange<determinetaxRangeNo();sumrange++) {
			sumTaxRanges+=TAX_RANGES[sumrange];
		}
		return sumTaxRanges;
	}
	
	private double subtractRangeAmounts() {
		double amountToCalculate = getNetIncome()-sumTaxRanges();
		return amountToCalculate;
	}
	
	private double determineCalcAmountPercent() {
		double calcAmount ;
		if ((determinetaxRangeNo()-1) <0)
	{
		calcAmount = 0;
	}
	else {
		calcAmount=subtractRangeAmounts()*TAX_RATES[determinetaxRangeNo()-1];
	}
		return calcAmount;
	}
	public int totalPayableTax() {
		return (int) (sumPreviousTaxRange()+determineCalcAmountPercent());
	}
	
	public static void main(String[] args) {
		TaxTable2 tax = new TaxTable2(90000);
		System.out.println(tax.totalPayableTax());
		//double amount=tax.calctax();
	}
}

	