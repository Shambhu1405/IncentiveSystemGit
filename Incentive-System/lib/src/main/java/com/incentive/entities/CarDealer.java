package com.incentive.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "cardealer")
public class CarDealer {

	@Id
	@SequenceGenerator(name = "booking_seq", initialValue = 44444, sequenceName = "booking_seq", allocationSize = 1)
	@GeneratedValue(generator = "booking_seq", strategy = GenerationType.SEQUENCE)
	private int bookingID;
	@Column(name = "dealername", length = 30)
	private String dealerName;

	@Column(name = "doj", columnDefinition = "date")
	private Date bookingDate;

	@OneToOne
	@JoinColumn(name = "dealerID")
	private CarCompany comp;
	@OneToOne
	@JoinColumn(name = "carChassisNo")
	private CarDetails car;

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public int getBookingID() {
		return bookingID;
	}

	public void setBookingID(int bookingID) {
		this.bookingID = bookingID;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	@Override
	public String toString() {
		return "CarDealer [dealerName=" + dealerName + ", bookingID=" + bookingID + ", bookingDate=" + bookingDate
				+ "]";
	}

	public CarCompany getComp() {
		return comp;
	}

	public void setComp(CarCompany comp) {
		this.comp = comp;
	}

}
