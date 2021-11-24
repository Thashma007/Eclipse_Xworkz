package com.xworkz.interfacee.internet;

public class AirtelInternet implements Internet {

	public AirtelInternet()
	{
		System.out.println("invoked no arg constructor");
	}

	public boolean connect()
	{
		System.out.println("invoked connect from AirtelInternet");
		return true;
	}

	public int speed()
	{
		System.out.println("invoked speed from AirtelInternet");
		return 7;
	}

	public void disconnect()
	{
		System.out.println("disconnected from AirtelInternet");
	}
}

