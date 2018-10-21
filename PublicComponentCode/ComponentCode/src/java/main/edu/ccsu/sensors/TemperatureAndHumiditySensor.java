package edu.ccsu.sensors;

import edu.ccsu.interfaces.Sensor;

public class TemperatureAndHumiditySensor implements Sensor {

	private Sensor nextSensor;
	private double degreesFahrenheit;
	private double humidityValue;
	private String portNumber; 
	
	@Override
	public String getData() {
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
	public Sensor getNextSensor() {
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
	public String getPortNumber() {
		return portNumber;
	}

	/**
	 * 
	 * @param portNumber
	 */
	public void setPortNumber(String portNumber) {
		this.portNumber = portNumber;
	}

	/**
	 * 
	 * @return
	 */
	public double getDegreesFahrenheit() {
		return degreesFahrenheit;
	}

	/**
	 * 
	 * @param degreesFahrenheit
	 */
	public void setDegreesFahrenheit(double degreesFahrenheit) {
		this.degreesFahrenheit = degreesFahrenheit;
	}

	/**
	 * 
	 * @return
	 */
	public double getHumidityValue() {
		return humidityValue;
	}

	/**
	 * 
	 * @param humidityValue
	 */
	public void setHumidityValue(double humidityValue) {
		this.humidityValue = humidityValue;
	}

	
	//TODO implement object equality and hashCode
}