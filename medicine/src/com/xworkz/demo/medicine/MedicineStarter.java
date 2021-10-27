package com.xworkz.demo.medicine;

import com.xworkz.demo.medicine.patient.PatientMedicine;

public class MedicineStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PatientMedicine patient =new PatientMedicine();

		patient.add("Paracetamol");
		patient.displayDetails();
		patient.add("Montecop");
		patient.add("Omee");
		patient.add("Gudcef");
		patient.add("Maxodom");
		patient.displayDetails();
	}

}
