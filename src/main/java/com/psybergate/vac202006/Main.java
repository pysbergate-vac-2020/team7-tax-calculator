package com.psybergate.vac202006;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nettaxpayable net_tax_obj = new Nettaxpayable(679849.0, 78785.0, 783874.0);
		double a = net_tax_obj.getMedicalcredit();
		System.out.println(a);
		
		double net_capital_gains = CapitalGains.CalNetCapitalGains(78465.0, 78645.0, 756765.0, true);
		
		System.out.println(net_capital_gains);
	}

}
