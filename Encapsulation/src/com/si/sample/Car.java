package com.si.sample;

public class Car {
private String doors;
public String getDoors() {
	return doors;
}
public void setDoors(String doors) {
	this.doors = doors;
}
private String drivers;
public String getDrivers() {
	return drivers;
}
public void setDrivers(String drivers) {
	this.drivers = drivers;
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
public String getEngine() {
	return engine;
}
public void setEngine(String engine) {
	this.engine = engine;
}
private int speed;
private String engine;
public void run() {
	if(doors.equals("closed")&&engine.equals("on")&&drivers.equals("seated")&&speed>0) {
		System.out.println("Car is running");
	}
}
}

