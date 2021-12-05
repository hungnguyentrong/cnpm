package Backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class Vehicle {
	@Id
	@Column(name="Vehicle_ID")
	private int vehicleID;
	
	@Column(name="Parking_Lot_ID")
	private int parkingLotID;
	
	@Column(name="Status")
	private char status;

	public int getVehicleID() {
		return vehicleID;
	}

	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}

	public int getParkingLotID() {
		return parkingLotID;
	}

	public void setParkingLotID(int parkingLotID) {
		this.parkingLotID = parkingLotID;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public Vehicle(int vehicleID, int parkingLotID, char status) {
		super();
		this.vehicleID = vehicleID;
		this.parkingLotID = parkingLotID;
		this.status = status;
	}
	
}
