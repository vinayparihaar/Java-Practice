package com.vinayparihar.hibernate.beans.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "VEHICLE")
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "VEHICLE_ID")
	private int vehilceId;
	@Column(name = "VEHICLE_NAME")
	private String vehicleName;
	
	@ManyToOne
	//To specify user defined column names
	/*Instead of creating new Table for the many to one relation 
	 * it will add extra column with this relation in Vehicle Table*/
	@JoinColumn(name = "USER_ID")
	private UserDetails userDetails;

	public int getVehilceId() {
		return vehilceId;
	}

	public void setVehilceId(int vehilceId) {
		this.vehilceId = vehilceId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

}
