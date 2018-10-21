package edu.ccsu.devices;

import edu.ccsu.interfaces.Device;
/**
 * Class allows for operations on GrovePi LEDs.
 */
public class Led extends Device {

	private int brightness;
	private String name;
	private Device nextDevice;


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

	/**
	 * 
	 * @return
	 */
	public Device getNextDevice() {
		return nextDevice;
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
	
	//TODO implement object equality and hashCode
}
