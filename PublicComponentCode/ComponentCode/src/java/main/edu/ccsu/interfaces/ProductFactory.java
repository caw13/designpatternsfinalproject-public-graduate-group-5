package edu.ccsu.interfaces;

public interface ProductFactory {

	public Device makeDevice(String deviceName);
	public Sensor makeSensor(String sensorName);
}
