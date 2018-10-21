package edu.ccsu.devices;

import java.util.ArrayList;
import java.util.List;

import edu.ccsu.interfaces.Device;
/**
 * Class connects to LCD RGB Backlight and allows
 * calling classes to print messages to the screen using
 * a variety of methods.  It maintains a list of messages 
 */
public class LcdScreen extends Device {

	private List<String> messages;
	private String color;
	
	public LcdScreen(String color) {
		this.messages = new ArrayList<String>();
		this.color = "Blue";
		this.name = "LCD Screen";
	}
	
	/**
	 * Print a message to the 
	 * @param message
	 */
	public void printMessage(String message) {
		//TODO implementation 
	}
	
	/**
	 * Print a message to the LCD RGB Backlight for
	 * a certain number of seconds
	 * @param message
	 * @param duration
	 */
	public void printMessage(String message, int duration) {
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
	public List<String> getMessages() {
		return messages;
	}

	/**
	 * 
	 * @param messages
	 */
	public void setMessages(List<String> messages) {
		this.messages = messages;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getColor() {
		return color;
	}

	/**
	 * 
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	//TODO implement object equality and hashCode
}
