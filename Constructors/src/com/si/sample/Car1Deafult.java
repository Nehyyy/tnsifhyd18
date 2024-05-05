package com.si.sample;
//default constructor
public class Car1Deafult {
private String doors;
private String engine;
private String driver;
private int speed;


public Car1Deafult() {
	doors="closed";
	engine="on";
	driver="seated";
	speed=45;
}
public String run() {
	if(doors.equals("closed")&&engine.equals("on")&&driver.equals("seated")&&speed>0) {
		return "car is running";
	}
	else {
		return "car is not running";
	}
}
}
