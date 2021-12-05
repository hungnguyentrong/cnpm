package Backend.model;

import java.sql.Time;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name ="Bills")
public class Bills {
	@Id
	@Column(name="Bill_ID")
	private int billID;
	
	@Column(name="Customer_ID")
	private int customerID;
	
	@Column(name="Vehicle_ID")
	private int vehicleID;
	
	@Column(name="Time_started_renting")
	private Time startRentalTime;
	
	@Column(name="Time_ended_renting")
	private Time endRentalTime;
	
	@Column(name="Parking_Lot_ID")
	private int parkingLotID;

	public int getBillID() {
		return billID;
	}

	public void setBillID(int billID) {
		this.billID = billID;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public int getVehicleID() {
		return vehicleID;
	}

	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}

	public Time getStartRentalTime() {
		return startRentalTime;
	}

	public void setStartRentalTime(Time startRentalTime) {
		this.startRentalTime = startRentalTime;
	}

	public Time getEndRentalTime() {
		return endRentalTime;
	}

	public void setEndRentalTime(Time endRentalTime) {
		this.endRentalTime = endRentalTime;
	}

	public int getParkingLotID() {
		return parkingLotID;
	}

	public void setParkingLotID(int parkingLotID) {
		this.parkingLotID = parkingLotID;
	}

	public Bills(int billID, int customerID, int vehicleID, Time startRentalTime, Time endRentalTime,
			int parkingLotID) {
		super();
		this.billID = billID;
		this.customerID = customerID;
		this.vehicleID = vehicleID;
		this.startRentalTime = startRentalTime;
		this.endRentalTime = endRentalTime;
		this.parkingLotID = parkingLotID;
	}
	
}
