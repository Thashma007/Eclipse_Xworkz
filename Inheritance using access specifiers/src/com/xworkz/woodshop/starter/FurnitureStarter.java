package com.xworkz.woodshop.starter;

import com.xworkz.woodshop.design.Furniture;
import com.xworkz.woodshop.design.ComputerTable;
import com.xworkz.woodshop.sell.DineTable;

public class FurnitureStarter {

	public static void main(String[] args) {


		ComputerTable compt=new ComputerTable();
        System.out.println(compt.materialType);
        Furniture furniture =new Furniture("Sofa set",23456.987);
        System.out.println(furniture.materialType);
        DineTable dine=new DineTable();
        System.out.println(dine.materialType);



	}

}
