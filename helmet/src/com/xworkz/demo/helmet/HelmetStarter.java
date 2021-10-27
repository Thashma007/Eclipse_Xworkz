package com.xworkz.demo.helmet;

import com.xworkz.demo.helmet.helmetbrand.Helmet;

public class HelmetStarter {

	public static void main(String[] args) {

		Helmet helmet = new Helmet();
		helmet.add("Vega");
		helmet.displayDetails();
		helmet.add("Aerostar");
		helmet.add(null);
		helmet.add("Wrangler");
		helmet.add("Royal Enfield");
		helmet.add("Steelbird");
		helmet.displayDetails();
	}

}