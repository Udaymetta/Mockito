package com.qvc.mockito;

public class Stock {

	private String Id;
	private String name;
	private int qty;
	
	public Stock(String id, String name, int qty) {
		this.Id = id;
		this.name = name;
		this.qty = qty;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
}
