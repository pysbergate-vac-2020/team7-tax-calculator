package com.psybergate.vac202006.taxcalculator;

public class Main {

	public static void main(String[] args) {
		CapitalGain capitalGain=new CapitalGain(1000000.0,3000000,5000000);
		Income income_items = new Income(500000.0, 25000.0, 30000.0, capitalGain);
		String taxNumber="12345678";
		DatabaseManager sqlconnect = new DatabaseManager();
		sqlconnect.getPersonIncomeCapitalGain("76576578");
		double total_income = income_items.calTotalTaxableIncome();
		
		Expense expenses = new Expense(40000, 150000, 525000);
		
		double taxableIncome = total_income - expenses.returnExpenses();
		
		System.out.println("Taxable Income: " + taxableIncome);
		
		TaxTable tax_table = new TaxTable(taxableIncome);
		
		int total_payable_tax = tax_table.totalPayableTax();
		
		Nettaxpayable net_tax = new Nettaxpayable(total_payable_tax);
		
		System.out.println("Net Tax Payable: " + net_tax.CalcNetPayable());
	}

}
