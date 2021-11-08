package com.xworkz.woodshop.design;

public class Furniture {
	public String materialType="Beech";
	double price;
	private int quantity;
	protected String color;

	public Furniture() {
		super();
		System.out.println("Invoked no-arg constructor");
	}
	
	public Furniture(String matrialtype,double price)
	{
		super();
		this.materialType = materialType;
		this.price = price;
		System.out.println("invoked parametrized constructor");
		
		 System.out.println("MaterialType:"+this.materialType);
		
		
	}
}
