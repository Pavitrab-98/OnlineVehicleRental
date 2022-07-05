package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.postgresql.Driver;

@Entity
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int vehicleId;
	@Column
	private String  vehicleNumber;
	@Column
	private Driver driver;
	@Column
	private String Type;
	@Column
	private String category;
	@Column
	private String description;
	@Column
	private String location;
	@Column
	private int capacity;
	@Column
	private double chargesPerKM;
	@Column
	private double fixedCharges;
	
	
	public Vehicle() {}
	
	public Vehicle(int vehicleId, String vehicleNumber, Driver driver, String type, String category, String description,
			String location, int capacity, double chargesPerKM, double fixedCharges) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleNumber = vehicleNumber;
		this.driver = driver;
		Type = type;
		this.category = category;
		this.description = description;
		this.location = location;
		this.capacity = capacity;
		this.chargesPerKM = chargesPerKM;
		this.fixedCharges = fixedCharges;
	}
	
	
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public double getChargesPerKM() {
		return chargesPerKM;
	}
	public void setChargesPerKM(double chargesPerKM) {
		this.chargesPerKM = chargesPerKM;
	}
	public double getFixedCharges() {
		return fixedCharges;
	}
	public void setFixedCharges(double fixedCharges) {
		this.fixedCharges = fixedCharges;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleNumber=" + vehicleNumber + ", driver=" + driver + ", Type="
				+ Type + ", category=" + category + ", description=" + description + ", location=" + location
				+ ", capacity=" + capacity + ", chargesPerKM=" + chargesPerKM + ", fixedCharges=" + fixedCharges + "]";
	}
	
	

}
