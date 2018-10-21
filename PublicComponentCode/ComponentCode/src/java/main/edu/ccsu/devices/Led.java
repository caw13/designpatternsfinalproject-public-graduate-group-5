package edu.ccsu.devices;

import edu.ccsu.interfaces.Device;
/**
 * Class allows for operations on GrovePi LEDs.
 */
public class Led implements Device {

	private int brightness;
	private String name;
	private Device nextDevice;
	
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
	public void setDevice(Device nextDevice) {
		// TODO Auto-generated method stub
		
	}

	public Device getNextDevice() {
		return nextDevice;
	}

	@Override
	public boolean isAvailable(Device device, String portNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	public int getBrightness() {
		return brightness;
	}

	public void setBrightness(int brightness) {
		this.brightness = brightness;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//TODO implement object equality and hashCode
}