package Backend.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="customer")
public class Customer {
	@Id
	@Column(name="Customer_ID")
	private int customerID;
	
	@Column(name="Name_Of_Customer")
	private String customerName;
	
	@Column(name="Email")
	private String email;
	
	@Column(name = "Phone_Number")
	private String phoneNumber;
	
	@Column(name ="Address")
	private String address;
	
	@Column(name ="ID_Number")
	private int ID;
	
	@Column(name="EcoPark_Resident")
	private int isEcoParkResident;
	
	@Column(name="Vehicle_ID")
	private int vehicleID;
	
	@Column(name="Rental_State")
	private int rentalState;
	
	@Column(name="Role")
	private int role;
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getIsEcoParkResident() {
		return isEcoParkResident;
	}

	public void setIsEcoParkResident(int isEcoParkResident) {
		this.isEcoParkResident = isEcoParkResident;
	}

	public int getVehicleID() {
		return vehicleID;
	}

	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}

	public int getRentalState() {
		return rentalState;
	}

	public void setRentalState(int rentalState) {
		this.rentalState = rentalState;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}



}
