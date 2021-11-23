package com.xworkz.demo.interfaces;

import com.xworkz.demo.interfaces.ElectionRule;
import com.xworkz.demo.interfaces.CandidateElectionRule;

public class ElectionStarter {

	public static void main(String[] args) {

		ElectionRule electionRule = new CandidateElectionRule();
		ElectionCommision commision = new ElectionCommision(electionRule);
		commision. ElectionProcedure();


	}

}
