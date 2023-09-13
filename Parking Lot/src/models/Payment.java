package models;

import java.time.LocalDateTime;

public class Payment extends BaseClass {
	
	private int amount;
	private PaymentStatus status;
	private PaymentMode mode;
	private String transactionNo;
	private Bill bill;
	private LocalDateTime time;
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public PaymentStatus getStatus() {
		return status;
	}
	
	public void setStatus(PaymentStatus status) {
		this.status = status;
	}
	
	public PaymentMode getMode() {
		return mode;
	}
	public void setMode(PaymentMode mode) {
		this.mode = mode;
	}
	
	public String getTransactionNo() {
		return transactionNo;
	}
	
	public void setTransactionNo(String transactionNo) {
		this.transactionNo = transactionNo;
	}
	
	public Bill getBill() {
		return bill;
	}
	
	public void setBill(Bill bill) {
		this.bill = bill;
	}
	
	public LocalDateTime getTime() {
		return time;
	}
	
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	

}
