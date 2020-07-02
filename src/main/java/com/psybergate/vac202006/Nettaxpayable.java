package com.psybergate.vac202006;

public class Nettaxpayable {
	private double taxpayable= 84628; //value to get from a different class need to get
	private double medicalcredit = 10000;
	private double primaryrebate = 14220;
	
	public Nettaxpayable(double taxpayable, double medicalcredit, double primaryrebate) {
		super();
		this.taxpayable = taxpayable;
		this.medicalcredit = medicalcredit;
		this.primaryrebate = primaryrebate;
	}

	public double getMedicalcredit() {
		return medicalcredit;
	}

	public double getPrimaryrebate() {
		return primaryrebate;
	}
	
	public double gettaxpayable() {
		return taxpayable;
	}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nettaxpayable tax= new Nettaxpayable();
		double totalnettax = tax.taxpayable - tax.medicalcredit; 
		System.out.print(totalnettax);
	}*/
	}


