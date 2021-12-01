package com.xworkz.exception;
import com.xworkz.exception.event.TicketType;
import com.xworkz.exception.event.Theatre;
public class TheatreStarter {

	public static void main(String[] args) {


		Theatre theatre=new Theatre("Mimi");

		theatre.bookTicket("Mimi",TicketType.GANDHI_CLASS, 5);

		theatre.bookTicket1("Mimi", TicketType.MIDDLE_CLASS, 5);

		theatre.bookTicket2("Mimi", TicketType.BALCONY, 2);

		System.out.println("No logical error in the code");

	}

}
