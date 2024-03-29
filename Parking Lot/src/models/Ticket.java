package models;

import java.time.LocalDateTime;

public class Ticket extends BaseClass {
	private ParkingSpot parkingSpot;
	private LocalDateTime entryTime;
	private Vehicle vehicle;
	
	public ParkingSpot getParkingSpot() {
		return parkingSpot;
	}
	
	public void setParkingSpot(ParkingSpot parkingSpot) {
		this.parkingSpot = parkingSpot;
	}
	
	public LocalDateTime getEntryTime() {
		return entryTime;
	}
	
	public void setEntryTime(LocalDateTime entryTime) {
		this.entryTime = entryTime;
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
}
