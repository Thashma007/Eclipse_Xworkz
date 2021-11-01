package com.xworkz.starters;

import com.xworkz.dto.examples.BlueToothDTO;
import com.xworkz.dto.examples.dao.BlueToothDAO;

public class BluetoothDAOStarter {

	public static void main(String[] args) {
		BlueToothDAO dao=new BlueToothDAO() ;
		BlueToothDTO bluetoothDTO=new BlueToothDTO("redmi","head-set",8975.0f,3.45f,3.0f);
		dao.add(bluetoothDTO);
		BlueToothDTO bluetoothDTO1=new BlueToothDTO("samsung","Wireless",7975.0f,2.45f,1.0f);
		BlueToothDTO bluetoothDTO2=new BlueToothDTO("JBL","air podes",6975.0f,2.45f,1.0f);
		dao.add(bluetoothDTO1);
		dao.add(bluetoothDTO2);
		dao.delete(2);

	}

}
