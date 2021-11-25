package com.xworkz.busroute.starters;

import com.xworkz.interfaceexamples.dto.BusRouteDTO;
import com.xworkz.interfaceexamples.dao.BusRouteDAO;
import com.xworkz.busroute.implementation.BusRoute;
import com.xworkz.busroute.implementation.BusManager;

public class BusRouteStarter {

	public static void main(String[] args) {

		BusRouteDAO daos=new BusRoute();

		BusRouteDTO dto1=new BusRouteDTO(1,"Kodagu","Mysore","Ramesh");
		BusRouteDTO dto2=new BusRouteDTO(2,"Bangalore","Manglore","Krishna");
		BusRouteDTO dto3=new BusRouteDTO(3,"Mumbai","Pune","Avi");
		daos.save(dto1);
		daos.save(dto2);
		daos.save(dto3);

		BusManager manager=new BusManager(daos);

		manager.saveRoute(dto3);
        manager.findRoute("Virajpet");
        manager.displayRoute();

	}

}
