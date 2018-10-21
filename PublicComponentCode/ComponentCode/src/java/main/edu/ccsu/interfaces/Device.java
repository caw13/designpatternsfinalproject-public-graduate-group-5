package edu.ccsu.interfaces;
/**
 * 
 */
public interface Device {

	/**
	 * Sets another devices to be used in Chain of Responsiblity.
	 * If accessing current device fails and there is another device in the chain,
	 * device will try to use that next device to perform operations.
	 * @param device
	 */
	public void setDevice(Device nextDevice);
	
	/**
	 * Given a device and port number, checks to see if device
	 * is available for use.
	 * @param device
	 * @param portNumber
	 * @return
	 */
	public boolean isAvailable(Device device, String portNumber);
}
