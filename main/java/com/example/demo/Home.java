package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Home {
	private int doorNum;
	private String owner;
	@Autowired
	InternetConnection fibre;
	
	Home(){
		System.out.println("Creating Home..");
	}
	
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
		fibre.switchOn();
		System.out.println("connecting...");
	}

}
