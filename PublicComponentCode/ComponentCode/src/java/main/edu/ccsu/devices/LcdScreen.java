package edu.ccsu.devices;

import java.util.ArrayList;
import java.util.List;
/**
 * Class connects to LCD RGB Backlight and allows
 * calling classes to print messages to the screen using
 * a variety of methods.  It maintains a list of messages 
 */
public class LcdScreen {

	private List<String> messages;
	private String color;
	
	public LcdScreen(String color) {
		this.messages = new ArrayList<String>();
		this.color = color;
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
}
