package com.xworkz.outlook.dto.child;

public class OutLookStarter {
	
	public static void main(String[] args) {
		OutLookEmailDTO outlook=new OutLookEmailDTO();
		outlook.setCloudStorage(966);
		outlook.setBackUp(true);


		System.out.println(outlook.getCloudStorage());
		System.out.println(outlook.isBackUp());


	}

}

