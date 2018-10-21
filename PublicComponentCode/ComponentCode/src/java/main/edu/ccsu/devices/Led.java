package edu.ccsu.devices;

import edu.ccsu.interfaces.Sensor;
/**
 * Class allows for operations on GrovePi LEDs.
 */
public class Led implements Sensor {

	private Sensor nextSensor;
	private int brightness;
	
	public Led() {
		
	}
	
	public void turnOn() {
		//TODO implementation
	}
	
	public void turnOff() {
		//TODO implementation
	}
	
	public void blink(int numberOfSeconds) {
		//TODO implementation
	}
	
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
}