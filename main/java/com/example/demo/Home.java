package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Home {
	private int doorNum;
	private String owner;
	
	public int getDoorNum() {
		return doorNum;
	}
	
	public void setDoorNum(int doorNum) {
		this.doorNum = doorNum;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public void connect() {
		System.out.print("connecting...");
	}

}
