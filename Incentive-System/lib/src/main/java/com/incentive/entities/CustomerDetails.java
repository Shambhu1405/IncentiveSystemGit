package com.incentive.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customerdetails")
public class CustomerDetails {

	@Id
	private int bookingID;
	@Column(name = "customername", length = 30)
	private String customerName;
	@Column(nullable = false, length = 10)
	private long custContactNo;
	@Column(nullable = false)
	private int carChassisNo;
	@Column(name = "dealername", length = 30)
	private String customerMail;

	@Override
	public String toString() {
		return "CustomerDetails [bookingID=" + bookingID + ", customerName=" + customerName + ", custContactNo="
				+ custContactNo + ", carChassisNo=" + carChassisNo + ", customerMail=" + customerMail + "]";
	}

	public int getBookingID() {
		return bookingID;
	}

	public void setBookingID(int bookingID) {
		this.bookingID = bookingID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getCustContactNo() {
		return custContactNo;
	}

	public void setCustContactNo(long custContactNo) {
		this.custContactNo = custContactNo;
	}

	public int getCarChassisNo() {
		return carChassisNo;
	}

	public void setCarChassisNo(int carChassisNo) {
		this.carChassisNo = carChassisNo;
	}

	public String getCustomerMail() {
		return customerMail;
	}

	public void setCustomerMail(String customerMail) {
		this.customerMail = customerMail;
	}

}
