package edu.ccsu.factory;

import edu.ccsu.interfaces.Device;
import edu.ccsu.interfaces.ProductFactory;
import edu.ccsu.interfaces.Sensor;
/**
 * Class used to dynamically create Device and Sensor objects
 * to be used by client code.
 */
public class DeviceAndSensorFactory implements ProductFactory{

	public DeviceAndSensorFactory() {
		
	}

	@Override
	public Device makeDevice(String deviceName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sensor makeSensor(String sensorName) {
		// TODO Auto-generated method stub
		return null;
	}	
}