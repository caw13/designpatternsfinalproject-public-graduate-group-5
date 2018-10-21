package edu.ccsu.sensors;

import edu.ccsu.interfaces.Sensor;

public class TemperatureAndHumiditySensor implements Sensor {

	private Sensor nextSensor;
	private double degreesFahrenheit;
	public double humidityValue;
	
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
	public void setSensor(Sensor nextSensor) {
		// TODO Auto-generated method stub
		
	}

	public double getDegreesFahrenheit() {
		return degreesFahrenheit;
	}

	public void setDegreesFahrenheit(double degreesFahrenheit) {
		this.degreesFahrenheit = degreesFahrenheit;
	}

	public double getHumidityValue() {
		return humidityValue;
	}

	public void setHumidityValue(double humidityValue) {
		this.humidityValue = humidityValue;
	}

	/**
	 * Returns the next sensor in the chain 
	 * @return
	 */
	public Sensor getNextSensor() {
		return nextSensor;
	}

	@Override
	public boolean isAvailable(Sensor sensor) {
		// TODO Auto-generated method stub
		return false;
	}	
	//TODO implement object equality and hashCode
}