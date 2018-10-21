README

*** Kim Niehaus, Ga Young Lee, Adrian Ward-Manthey (Group 5)
***The functionality we will be providing and how other groups can use it****

The interface provided will allow users to interact with the sensors without having to use GrovePi API, allowing the user to work strictly with Java code.

For example, methods would allow users to specify what data they want from the light sensor, such as light intensity, or specify certain messages for the LCD RGB Backlight to display to their users.

We will initially provide code that incorporates light sensors and temperature and humidity sensors. The devices we will include are LEDs and the LCD RGB Backlight. The interfaces are expandable to easily add other sensors and devices.

#CS505 - GrovePi Interaction Simplified

Authors: Kim Niehaus, Ga Young Lee, Adrian Ward-Manthey

##What it Does

The interface provided will allow users to interact with the sensors without having to use GrovePi API, allowing the user to work strictly with Java code.

For example, methods would allow users to specify what data they want from the light sensor, such as light intensity, or specify certain messages for the LCD RGB Backlight to display to their users.

##Classes and Interfaces

Device Interface- Specifies a method to set the device and a method to check if device is available to use. Concrete classes of actual devices will realize.

Sensor Interface- Specifies a method to set the sensor and a method to get data from the sensor. Concrete classes of actual sensors will realize.

ProductFactory Interface- Specifies a method to create a device object and a method to create a sensor object

DeviceAndSensorFactory Class - the class that implements the ProductFactory and will have the functionality to create devices and sensors