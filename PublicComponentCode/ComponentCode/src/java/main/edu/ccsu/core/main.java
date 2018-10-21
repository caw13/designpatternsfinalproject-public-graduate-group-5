package edu.ccsu.core;

import edu.ccsu.factory.DeviceAndSensorFactory;
import edu.ccsu.interfaces.Device;
import edu.ccsu.interfaces.Sensor;

public class main {

	public static void main(String[] args) {
		//instatiate factory to create objects 
		DeviceAndSensorFactory productFactory = new DeviceAndSensorFactory();
		
		//sample devices
		Device display = productFactory.makeDevice("LCD", "MYLCD");
		Device ledOne = productFactory.makeDevice("LED", "MYLCD");
		
		System.out.println(display);
		System.out.println(ledOne);
		
		//sample sensors
		Sensor lightSensor = productFactory.makeSensor("LightSensor", "First Light Sensor");
		Sensor tempSensor = productFactory.makeSensor("TempAndHumiditySensor", "Humidity");
	
		System.out.println(lightSensor);
		System.out.println(tempSensor);
	}
}