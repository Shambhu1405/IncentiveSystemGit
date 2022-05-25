package com.incentive.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "cardealer")
public class CarDealer {

	@Id
	private int dealerID;
	@Column(name = "dealername", length = 30)
	private String dealerName;
	@SequenceGenerator(name = "booking_seq", initialValue = 44444, sequenceName = "booking_seq", allocationSize = 1)
	@GeneratedValue(generator = "booking_seq", strategy = GenerationType.SEQUENCE)
	private int bookingID;
	@Column(nullable = false)
	private int carChassisNo;
	@Column(name = "doj", columnDefinition = "date")
	private Date bookingDate;
	@Column
	private int customerId;

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public int getDealerID() {
		return dealerID;
	}

	public void setDealerID(int dealerID) {
		this.dealerID = dealerID;
	}

	public int getBookingID() {
		return bookingID;
	}

	public void setBookingID(int bookingID) {
		this.bookingID = bookingID;
	}

	public int getCarChassisNo() {
		return carChassisNo;
	}

	public void setCarChassisNo(int carChassisNo) {
		this.carChassisNo = carChassisNo;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "CarDealer [dealerName=" + dealerName + ", dealerID=" + dealerID + ", bookingID=" + bookingID
				+ ", carChassisNo=" + carChassisNo + ", bookingDate=" + bookingDate + ", customerId=" + customerId
				+ "]";
	}

}
