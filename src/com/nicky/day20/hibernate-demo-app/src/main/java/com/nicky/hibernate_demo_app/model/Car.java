package com.nicky.hibernate_demo_app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car_table")
public class Car {
	@Id
	private int vin;
	private String name;
	private String model;

	public Car() {

	}

	public Car(int vin, String name, String model) {
		super();
		this.vin = vin;
		this.name = name;
		this.model = model;
	}

	public int getVin() {
		return vin;
	}

	public void setVin(int vin) {
		this.vin = vin;
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

	@Override
	public String toString() {
		return "Car [vin=" + vin + ", name=" + name + ", model=" + model + "]";
	}

}
