package edu.ccsu.interfaces;
/**
 * 
 * @author Adrian
 *
 */
public interface Sensor {

	/**
	 * Returns a string representation of sensor data
	 * for the current moment
	 * @return
	 */
	public String getData();
	
	/**
	 * Returns a string representation of data for a sensor
	 * collected over a given number of seconds
	 * @param seconds
	 * @return
	 */
	public String getData(int seconds);
	
	/**
	 * Set next sensor to use in case of
	 * current sensor throwing error or failing.
	 * @param nextSensor
	 */
	public void setSensor(Sensor nextSensor);
	
	/**
	 * Check if sensor is available
	 * @param sensor
	 * @return
	 */
	public boolean isAvailable(Sensor sensor);
}
