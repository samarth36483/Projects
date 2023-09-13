package models;

import java.time.LocalDateTime;

public class Bill extends BaseClass {
	private Ticket ticket;
	private LocalDateTime exitTime;
	private int amount;
	private Gate gate;
	
	public Ticket getTicket() {
		return ticket;
	}
	
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
	public LocalDateTime getExitTime() {
		return exitTime;
	}
	
	public void setExitTime(LocalDateTime exitTime) {
		this.exitTime = exitTime;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public Gate getGate() {
		return gate;
	}
	
	public void setGate(Gate gate) {
		this.gate = gate;
	}
	

}
