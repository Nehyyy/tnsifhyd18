package com.si.day2;

public class Program14_1 {
	private String doors;
	private String engine;
	private String driver;
	private int speed;
    Program14_1() {
    	doors = "closed";
		engine = "on";
		driver= "seated";
		speed = 10;
	}
	
	public String run() {
		if(doors.equals("closed") && engine.equals("on")&& driver.equals("seated") 
				&& speed >0) {
			return "car is running";
		}
		else{
			return "car is not running";
		}
	}

	
}

