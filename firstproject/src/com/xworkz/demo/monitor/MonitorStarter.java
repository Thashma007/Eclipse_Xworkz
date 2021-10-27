package com.xworkz.demo.monitor;

import com.xworkz.demo.monitor.monitorbrand.Monitor;

public class MonitorStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monitor monitor =new Monitor();

		monitor.add("DELL");
		monitor.displayDetails();
		monitor.add("Acer");
		monitor.add("HP");
		monitor.add("Apple");
		monitor.add("Lenovo");
		monitor.displayDetails();
		monitor.add("ASUS");
	}

}
