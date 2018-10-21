package edu.ccsu.interfaces;

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
	 * 
	 * @param nextSensor
	 */
	public void setSensor(Sensor nextSensor);
}
