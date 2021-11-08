package com.xworkz.woodshop.design;

import com.xworkz.woodshop.design.Furniture;

public class ComputerTable extends Furniture {
	
	public String materialType="Walnut";
	
	public ComputerTable() {
		super();
		System.out.println("Invoked computer table no-arg constructor");
	}

	public ComputerTable(String matrialtype,double price)
	{
		super();
		super.materialType = materialType;
		super.price = price;
		System.out.println("invoked parametrized constructor");
		
		 System.out.println("MaterialType:"+this.materialType);
		
		
	}
}