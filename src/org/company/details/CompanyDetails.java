package org.company.details;

import org.client.details.Clientdetails;

public class CompanyDetails extends Clientdetails {

	public void CompanyName() {

		String Cname = "Aarushi Builders";
		System.out.println("Company Name Is " + Cname);

	}

	public static void main(String[] args) {
		CompanyDetails cd = new CompanyDetails();
		cd.ClientName();
		cd.CompanyName();
	}
}
