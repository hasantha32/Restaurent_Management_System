package Reservation;

import java.util.Date;

public class BookingModel {
	
	 String reservationType;
	 String reservationName;
	 Date checkIN;
	 Date checkOut;
	 String occupancy;
	 int adults;
	 int children;
	 int infants;
	 double unitPrice;
	 int duration;
	 double total;
	 String cusName;
	 int contactnumber;
	 String address;
	
	
	public BookingModel(String reservationType, String reservationName, Date checkIN, Date checkOut, String occupancy, int adults, int children,
			int infants, double unitPrice, int duration, double total, String cusName, int contactnumber, String address) {
		super();
		this.reservationType = reservationType;
		this.reservationName = reservationName;
		this.checkIN = checkIN;
		this.checkOut = checkOut;
		this.occupancy = occupancy;
		this.adults = adults;
		this.children = children;
		this.infants = infants;
		this.unitPrice = unitPrice;
		this.duration = duration;
		this.total = total;
		this.cusName = cusName;
		this.contactnumber = contactnumber;
		this.address = address;
	}


	public BookingModel() {
		super();
	}
	
	
	public String getReservationType() {
		return reservationType;
	}


	public void setReservationType(String reservationType) {
		this.reservationType = reservationType;
	}


	public String getReservationName() {
		return reservationName;
	}


	public void setReservationName(String reservationName) {
		this.reservationName = reservationName;
	}


	public Date getCheckIN() {
		return checkIN;
	}


	public void setCheckIN(Date checkIN) {
		this.checkIN = checkIN;
	}


	public Date getCheckOut() {
		return checkOut;
	}


	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}


	public String getOccupancy() {
		return occupancy;
	}


	public void setOccupancy(String occupancy) {
		this.occupancy = occupancy;
	}


	public int getAdults() {
		return adults;
	}


	public void setAdults(int adults) {
		this.adults = adults;
	}


	public int getChildren() {
		return children;
	}


	public void setChildren(int children) {
		this.children = children;
	}


	public int getInfants() {
		return infants;
	}


	public void setInfants(int infants) {
		this.infants = infants;
	}
	
	
	public double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	public String getCusName() {
		return cusName;
	}


	public void setCusName(String cusName) {
		this.cusName = cusName;
	}


	public int getContactnumber() {
		return contactnumber;
	}


	public void setContactnumber(int contactnumber) {
		this.contactnumber = contactnumber;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	


}
