package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class InternetConnection {
	private int speed;
	private String ipAddress;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public void switchOn() {
		System.out.println( "Switching on...");
	}

}
