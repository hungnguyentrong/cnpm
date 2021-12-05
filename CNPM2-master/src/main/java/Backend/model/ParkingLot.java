package Backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class ParkingLot {
	@Id
	@Column(name="Parking_Lot_ID")
	private int parkingLotID;
	
	@Column(name="Name_Of_Parking_Lot")
	private String parkingLotName;
	
	@Column(name="Address")
	private String address;

	public int getParkingLotID() {
		return parkingLotID;
	}

	public void setParkingLotID(int parkingLotID) {
		this.parkingLotID = parkingLotID;
	}

	public String getParkingLotName() {
		return parkingLotName;
	}

	public void setParkingLotName(String parkingLotName) {
		this.parkingLotName = parkingLotName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ParkingLot(int parkingLotID, String parkingLotName, String address) {
		super();
		this.parkingLotID = parkingLotID;
		this.parkingLotName = parkingLotName;
		this.address = address;
	}
	
}
