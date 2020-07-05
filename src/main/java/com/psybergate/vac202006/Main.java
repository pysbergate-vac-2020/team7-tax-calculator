package com.psybergate.vac202006;

public class Main {

	public static void main(String[] args) {
		Income income_items = new Income(500000.0, 25000.0, 30000.0, 2);
		
		double total_income = income_items.calTotalTaxableIncome();
		
		Expense expenses = new Expense(40000, 150000, 525000);
		
		double taxableIncome = total_income - expenses.returnExpenses();
		
		System.out.println("Taxable Income: " + taxableIncome);
		
		TaxTable2 tax_table = new TaxTable2(taxableIncome);
		
		int total_payable_tax = tax_table.totalPayableTax();
		
		Nettaxpayable net_tax = new Nettaxpayable(total_payable_tax);
		
		System.out.println("Net Tax Payable: " + net_tax.CalcNetPayable());
	}

}
