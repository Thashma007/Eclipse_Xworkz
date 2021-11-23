package com.xworkz.demo.interfaces;

import com.xworkz.demo.interfaces.ElectionRule;

public class ElectionCommision {


		private ElectionRule electionRule;

		public ElectionCommision(ElectionRule electionRule) {
			this.electionRule = electionRule;
		}

		public void ElectionProcedure()
		{
			System.out.println("invoked election procedure");
			if(electionRule!=null)
			{
				int age = electionRule.validAge();
				int wardNo = electionRule.wardNo();
				String address = electionRule.address();
				if(age>18 && wardNo>=1 && wardNo <=100 && address.length()>=10 && address.length()<=50)
				{
					System.out.println("Eligible to vote");
				}
				else
				{
					System.err.println("Not elegible to vote");
				}
			}
			else
			{
				System.err.println("implementation is not provided");
			}
		}
		


}
