package edu.ccsu.interfaces;
/**
 * 
 * @author Adrian
 * @author Kim
 * @author GaYoung
 */
public interface ProductFactory {

	/**
	 * Creates a device based on the name and returns it
	 * @param deviceName
	 * @return
	 */
	public Device makeDevice(String deviceName);
	
	/**
	 * Creates a sensor based on the name and returns it
	 * @param sensorName
	 * @return
	 */
	public Sensor makeSensor(String sensorName);
}