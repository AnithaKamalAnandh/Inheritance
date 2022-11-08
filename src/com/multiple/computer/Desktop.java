package com.multiple.computer;

public class Desktop implements Software, Hardware {

	public void softwareResourses() {
		System.out.println("Some Of Softwares Are :");
		System.out.println("Eclipse");
		System.out.println("MS- Office");

		System.out.println("Media Player");

	}

	public void hardwareResourses() {

		System.out.println("Some Of Hardwares Are :");
		System.out.println("Desktop");
		System.out.println("Keyboard");

		System.out.println("Printer");

	}

	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.softwareResourses();
		d.hardwareResourses();

	}

}
