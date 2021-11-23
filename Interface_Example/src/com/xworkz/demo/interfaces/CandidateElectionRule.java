package com.xworkz.demo.interfaces;

public class CandidateElectionRule implements ElectionRule{

	@Override
	public int validAge() {
		System.out.println("invoked valid age method");
		return 25;
	}

	@Override
	public int wardNo() {
		System.out.println("invoked ward no. method");
		return 20;
	}

	@Override
	public String address() {
		System.out.println("invoked address method");
		return "Mysore LokaShaba";
	}

}

