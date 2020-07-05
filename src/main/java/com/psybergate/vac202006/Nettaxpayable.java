package com.psybergate.vac202006;

public class Nettaxpayable {
	private double taxpayable= 84628; //value to get from a different class need to get
	private final double medicalcredit = 10000;
	private final double primaryrebate = 14220;
	
	public Nettaxpayable(double taxpayable) {
		super();
		this.taxpayable = taxpayable;
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
	
	public double CalcNetPayable() {
		double output = taxpayable - (primaryrebate + medicalcredit);
		if (output < 0) {
			return 0;
		} else {
			return output;
		}
	}
}


