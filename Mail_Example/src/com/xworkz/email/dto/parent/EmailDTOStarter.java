package com.xworkz.email.dto.parent;

public class EmailDTOStarter {

	public static void main(String[] args) {
		EmailDTO email=new EmailDTO();
		email.setStorageSize(698);
		email.setFree(true);
		email.setNoOfEmailPerDay(125);
		email.setEmailId("lavanya@gmail.com");

		System.out.println(email.getStorageSize());
		System.out.println(email.getFree());
		System.out.println(email.getNoOfEmailPerDay());
		System.out.println(email.getEmailId());


		EmailDTO email1=new EmailDTO(700,false,45,"vr123@gamil.com");

		System.out.println(email1.getStorageSize());
		System.out.println(email1.getFree());
		System.out.println(email1.getNoOfEmailPerDay());
		System.out.println(email1.getEmailId());


	}

}
