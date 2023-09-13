package models;

public class Gate extends BaseClass {
	private GateStatus status;
	private int gateNumber;
	private GateType type;
	private Operator operator;
	private int floorNumber;
	
	public GateStatus getStatus() {
		return status;
	}
	
	public void setStatus(GateStatus status) {
		this.status = status;
	}
	
	public int getGateNumber() {
		return gateNumber;
	}
	
	public void setGateNumber(int gateNumber) {
		this.gateNumber = gateNumber;
	}
	
	public GateType getType() {
		return type;
	}
	
	public void setType(GateType type) {
		this.type = type;
	}
	
	public Operator getOperator() {
		return operator;
	}
	
	public void setOperator(Operator operator) {
		this.operator = operator;
	}
	
	public int getFloorNumber() {
		return floorNumber;
	}
	
	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}
	
	
}
