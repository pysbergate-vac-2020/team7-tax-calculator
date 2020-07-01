package com.psybergate.vac202006;

class Nettaxpayable {
	private double taxpayable= 84628; //value to get from a different class need to get
	private double medicalcredit = 10000;
	private double primaryrebate = 14220;
	
	public double getMedicalcredit() {
		return medicalcredit;
	}

	public double getPrimaryrebate() {
		return primaryrebate;
	}
	
	public double gettaxpayable() {
		return taxpayable;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nettaxpayable tax= new Nettaxpayable();
		double totalnettax = tax.taxpayable - tax.medicalcredit; 
		System.out.print(totalnettax);
	}
	}


