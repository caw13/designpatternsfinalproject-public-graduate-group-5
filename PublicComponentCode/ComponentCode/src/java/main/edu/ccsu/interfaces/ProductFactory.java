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
	 * @param device
	 * @param name
	 * @return
	 */
	public Device makeDevice(String device, String name);
	
	/**
	 * Creates a sensor based on the name and returns it
	 * @param sensor
	 * @param name
	 * @return
	 */
	public Sensor makeSensor(String sensor, String name);
}