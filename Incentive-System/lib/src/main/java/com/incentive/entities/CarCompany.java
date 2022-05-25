package com.incentive.entities;

public class CarCompany {

	private int dealerId;
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
