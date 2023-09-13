package models;

public class ParkingSpot extends BaseClass {
	private int number;
	private ParkingSpotStatus status;
	private VehicleType supportedVehicleType;
	private Vehicle vehicle;
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public ParkingSpotStatus getStatus() {
		return status;
	}
	
	public void setStatus(ParkingSpotStatus status) {
		this.status = status;
	}
	
	public VehicleType getSupportedVehicleType() {
		return supportedVehicleType;
	}
	
	public void setSupportedVehicleType(VehicleType supportedVehicleType) {
		this.supportedVehicleType = supportedVehicleType;
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
}
