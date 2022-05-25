package com.incentive.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name ="incentivedetails")
public class IncentiveDetails {
@Id
private int incentiveId;
@JoinColumn
private int dealerId;
private Date bookingDate;
private int noOfbookings;
private double incentive;
public int getIncentiveId() {
	return incentiveId;
}
public void setIncentiveId(int incentiveId) {
	this.incentiveId = incentiveId;
}
public int getDealerId() {
	return dealerId;
}
public void setDealerId(int dealerId) {
	this.dealerId = dealerId;
}
public Date getBookingDate() {
	return bookingDate;
}
public void setBookingDate(Date bookingDate) {
	this.bookingDate = bookingDate;
}
public int getNoOfbookings() {
	return noOfbookings;
}
public void setNoOfbookings(int noOfbookings) {
	this.noOfbookings = noOfbookings;
}
public double getIncentive() {
	return incentive;
}
public void setIncentive(double incentive) {
	this.incentive = incentive;
}


}
