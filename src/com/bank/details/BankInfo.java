package com.bank.details;

public class BankInfo extends AxisBank {

	public int saving(int a, int b) {

		int total;
		total = a + b;
		return total;

	}

	public int fixed(int x, int y) {

		int Overall;
		Overall = x + y;
		return Overall;

	}

	public static void main(String[] args) {
		BankInfo bi = new BankInfo();
		int saveans = bi.saving(25000, 18000);
		System.out.println("total saving amount for this month is " + saveans);
		int fixans = bi.fixed(200000, 200000);
		System.out.println("total Fixed amount is " + fixans);
		bi.deposit();

	}
}
