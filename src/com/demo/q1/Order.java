package com.demo.q1;

public class Order {

	private int order_no;
	private String state;
	
	public Order(int order_no) {
		this.order_no = order_no;
		this.state = "NEW";
	}

	public int getOrder_no() {
		return order_no;
	}

	public void setOrder_no(int order_no) {
		this.order_no = order_no;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
}
