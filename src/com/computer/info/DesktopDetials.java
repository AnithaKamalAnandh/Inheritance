package com.computer.info;

public class DesktopDetials extends ComputerDetails {

	public void desktopSize() {

		String size = "25 inch";
		System.out.println("My Desktop Size Is " + size);

	}

	public static void main(String[] args) {

		DesktopDetials dd = new DesktopDetials();
		dd.computerModel();
		dd.desktopSize();
	}

}
