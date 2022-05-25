package com.incentive.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "cardetails")
public class CarDetails {
	@Id
	@SequenceGenerator(name = "chassis_seq", initialValue = 12000290, sequenceName = "chassis_seq", allocationSize = 2)
	@GeneratedValue(generator = "chassis_seq", strategy = GenerationType.SEQUENCE)
	private int carChassisNo;
	@Column(name = "carmodel", length = 30)
	private String carModel;
	@Column
	private double price;
	@Column(name = "specification", length = 100)
	private String specifications;

	public int getCarChassisNumber() {
		return carChassisNo;
	}

	public void setCarChassisNumber(int carChassisNumber) {
		this.carChassisNo = carChassisNumber;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSpecifications() {
		return specifications;
	}

	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}

}
