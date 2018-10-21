package edu.ccsu.interfaces;
/**
 * 
 */
public abstract class Device {

	protected String name;
	protected Device nextDevice;
	protected String portNumber;
	
	/**
	 * Sets another devices to be used in Chain of Responsiblity.
	 * If accessing current device fails and there is another device in the chain,
	 * device will try to use that next device to perform operations.
	 * @param device
	 * @param portNumber
	 * @return 
	 */
	public abstract void setNextDevice(Device nextDevice, String portNumber);
	
	/**
	 * Given a device and port number, checks to see if device
	 * is available for use.
	 * @param device
	 * @param portNumber
	 * @return
	 */
	public abstract boolean isAvailable(Device device, String portNumber);
	
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

	public String getPortNumber() {
		return portNumber;
	}

	public void setPortNumber(String portNumber) {
		this.portNumber = portNumber;
	}

	/**
	 * 
	 * @return
	 */
	public Device getNextDevice() {
		return nextDevice;
	}
}
