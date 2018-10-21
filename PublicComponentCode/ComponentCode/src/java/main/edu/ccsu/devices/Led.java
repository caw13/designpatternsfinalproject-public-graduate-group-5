package edu.ccsu.devices;

import edu.ccsu.interfaces.Device;
/**
 * Class allows for operations on GrovePi LEDs.
 */
public class Led extends Device {

	private int brightness;

	/*
	 * constructor
	 * */

	public Led() {
		
	}

	public void turnOn() {
		//TODO implementation
	}
	
	public void turnOff() {
		//TODO implementation
	}
	
	/**
	 * 
	 * @param numberOfSeconds
	 */
	public void blink(int numberOfSeconds) {
		//TODO implementation
	}
	
	@Override
	public void setNextDevice(Device nextDevice, String portNumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isAvailable(Device device, String portNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * 
	 * @return
	 */
	public int getBrightness() {
		return brightness;
	}

	/**
	 * 
	 * @param brightness
	 */
	public void setBrightness(int brightness) {
		this.brightness = brightness;
	}
	//TODO implement object equality and hashCode
}
