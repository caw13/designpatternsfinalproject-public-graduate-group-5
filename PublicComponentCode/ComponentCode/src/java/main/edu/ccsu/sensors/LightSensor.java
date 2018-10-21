package edu.ccsu.sensors;

import edu.ccsu.interfaces.Sensor;

public class LightSensor implements Sensor {

	private Sensor nextSensor;
	private String name;
	
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

	@Override
	public boolean isAvailable(Sensor sensor) {
		// TODO Auto-generated method stub
		return false;
	}

	public Sensor getNextSensor() {
		return nextSensor;
	}

	public void setNextSensor(Sensor nextSensor) {
		this.nextSensor = nextSensor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//TODO implement object equality and hashCode
}