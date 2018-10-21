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
	 * @param desiredData
	 * @return
	 */
	public String getData(String desiredData);
	
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
	 * @param portNumber
	 */
	public void setNextSensor(Sensor nextSensor, String portNumber);
	
	/**
	 * Check if sensor is available
	 * @param sensor
	 * @param portNumber
	 * @return
	 */
	public boolean isAvailable(Sensor sensor, String portNumber);

	/**
	 * Returns port number of Sensor
	 * @return
	 */
	public String getPortNumber();

	/**
	 * Set port number of Sensor
	 * @param portNumber
	 */
	public void setPortNumber(String portNumber);
	
}
