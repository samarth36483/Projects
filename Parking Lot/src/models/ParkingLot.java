package models;

import java.util.List;

public class ParkingLot extends BaseClass {
	private List<ParkingFloor> floors;
	private List<Gate> gates;
	private int capacity;
	private String address;
	private Status status;
	
	public List<ParkingFloor> getFloors() {
		return floors;
	}
	
	public void setFloors(List<ParkingFloor> floors) {
		this.floors = floors;
	}
	
	public List<Gate> getGates() {
		return gates;
	}
	
	public void setGates(List<Gate> gates) {
		this.gates = gates;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
	

}
