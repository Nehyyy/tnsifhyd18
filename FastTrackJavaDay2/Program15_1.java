package com.si.day2;

public class Program15_1 {
	String doors;
	String engine;
	String driver;
	int speed;
Program15_1(String doors, String engine, String driver, int speed){
	this.doors = doors;
	this.engine = engine;
	this.driver = driver;
	this.speed = speed;
}
String run() {
	if(doors.equals("closed") && engine.equals("on") && driver.equals("seated") && speed>0) {
		return "Car is running";
	}
	else {
		return"car is not running";
	}
}

}
