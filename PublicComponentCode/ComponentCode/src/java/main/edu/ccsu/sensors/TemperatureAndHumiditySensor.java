package edu.ccsu.sensors;

import edu.ccsu.interfaces.Sensor;

/***
 * Temperature and humidity sensor that reads data from
 * the GrovePi temp/humidity sensor and returns that data
 *
 */
public class TemperatureAndHumiditySensor implements Sensor {

	private Sensor nextSensor;
	private double degreesFahrenheit;
	private double humidityValue;
	private String portNumber; 
	private String name;
	
	public TemperatureAndHumiditySensor(String name) {
		this.name = name;
		//should be set defaults???
	}
	
	@Override
	public String getData(String desiredData) {
		//if user just wants humidity only get that
		//if user just wants temp just get that
		//if user wants both grab both 
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getData(int seconds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNextSensor(Sensor nextSensor, String portNumber) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Returns the next sensor in the chain 
	 * @return
	 */
	private Sensor getNextSensor() {
		return nextSensor;
	}

	@Override
	public boolean isAvailable(Sensor sensor, String portNumber) {
		// TODO Auto-generated method stub
		return false;
	}	
	
	/**
	 * 
	 * @return
	 */
	@Override
	public String getPortNumber() {
		return portNumber;
	}

	/**
	 * 
	 * @param portNumber
	 */
	@Override
	public void setPortNumber(String portNumber) {
		this.portNumber = portNumber;
	}

	@Override
	public String toString() {
		return "Name: " + this.name;
	}
	//TODO implement object equality and hashCode
}