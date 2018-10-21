package edu.ccsu.sensors;

import edu.ccsu.interfaces.Sensor;

public class LightSensor implements Sensor {

	private Sensor nextSensor;
	private String name;
	private String portNumber;
	
	public LightSensor(String name) {
		this.name = name;
	}
	
	@Override
	public String getData(String desiredData) {
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
	public Sensor getNextSensor() {
		return nextSensor;
	}

	/**
	 * 
	 * @param nextSensor
	 */
	public void setNextSensor(Sensor nextSensor) {
		this.nextSensor = nextSensor;
	}

	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name;
	}
	//TODO implement object equality and hashCode
}