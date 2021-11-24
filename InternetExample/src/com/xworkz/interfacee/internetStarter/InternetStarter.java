package com.xworkz.interfacee.internetStarter;

import com.xworkz.interfacee.internet.Internet;
import com.xworkz.interfacee.internet.AirtelInternet;
import com.xworkz.interfacee.internet.TataInternet;
import com.xworkz.interfacee.internet.Browser;

public class InternetStarter {

	public static void main(String[] args) {

		Internet internet=new AirtelInternet();

		Browser browser=new Browser(internet);

		browser.browse();


		Internet internet1=new TataInternet();

		Browser browser1=new Browser(internet1);

		browser1.browse();

	}

}
