package edu.ccsu.interfaces;
/**
 * 
 */
public abstract class Device {

	private String name;
	private Device nextDevice;
	private String portNumber;
	
	/**
	 * Sets another devices to be used in Chain of Responsiblity.
	 * If accessing current device fails and there is another device in the chain,
	 * device will try to use that next device to perform operations.
	 * @param device
	 * @param portNumber
	 */
	public void abstract setNextDevice(Device nextDevice, String portNumber);
	
	/**
	 * Given a device and port number, checks to see if device
	 * is available for use.
	 * @param device
	 * @param portNumber
	 * @return
	 */
	public boolean abstract isAvailable(Device device, String portNumber);
}
