package com.incentive.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customerdetails")
public class CustomerDetails {

	@Column(name = "customername", length = 30)
	private String customerName;
	@Id
	@Column(name = "custcontactno", length = 10)
	private String custContactNo;

	@Column(name = "customermail", length = 30)
	private String customerMail;

	@OneToOne
	@JoinColumn(name = "bookingID")
	private CarDealer dealer;
	@OneToOne
	@JoinColumn(name = "carChassisNo")
	private CarDetails car;

	public CarDetails getCar() {
		return car;
	}

	public void setCar(CarDetails car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "CustomerDetails [customerName=" + customerName + ", custContactNo=" + custContactNo + ", customerMail="
				+ customerMail + ", dealer=" + dealer + ", car=" + car + "]";
	}

	public CarDealer getDealer() {
		return dealer;
	}

	public void setDealer(CarDealer dealer) {
		this.dealer = dealer;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustContactNo() {
		return custContactNo;
	}

	public void setCustContactNo(String custContactNo) {
		this.custContactNo = custContactNo;
	}

	public String getCustomerMail() {
		return customerMail;
	}

	public void setCustomerMail(String customerMail) {
		this.customerMail = customerMail;
	}

}
