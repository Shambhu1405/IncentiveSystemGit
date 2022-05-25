package com.incentive.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "carcompany")
public class CarCompany {
	@Id
	@SequenceGenerator(name = "dealer_seq", initialValue = 10001, sequenceName = "dealer_seq", allocationSize = 1)
	@GeneratedValue(generator = "dealer_seq", strategy = GenerationType.SEQUENCE)
	private int dealerId;
	@Column
	private int noOfBooking;

	public int getDealerId() {
		return dealerId;
	}

	public void setDealerId(int dealerId) {
		this.dealerId = dealerId;
	}

	public int getNoOfBooking() {
		return noOfBooking;
	}

	public void setNoOfBooking(int noOfBooking) {
		this.noOfBooking = noOfBooking;
	}

	@Override
	public String toString() {
		return "CarCompany [dealerId=" + dealerId + ", noOfBooking=" + noOfBooking + "]";
	}

}
