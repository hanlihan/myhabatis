package com.ittx.car.model;

public class Car {
	private int uid;
	private String name;
	private String model;
	private String carnumber;
	private String number;

	public Car() {

	}

	public Car(int uid, String name, String model, String carnumber, String number) {
		
		this.uid = uid;
		this.name = name;
		this.model = model;
		this.carnumber = carnumber;
		this.number = number;
	}
	public Car(String name, String model, String carnumber, String number) {

		this.name = name;
		this.model = model;
		this.carnumber = carnumber;
		this.number = number;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCarnumber() {
		return carnumber;
	}

	public void setCarnumber(String carnumber) {
		this.carnumber = carnumber;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}


	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	@Override
	public String toString() {
		return "Car [ name=" + name + ", model=" + model + ", carnumber=" + carnumber + ", number="
				+ number + "]";
	}

}
