package com.example.ItemInfoService.Dto;

public class GetItemInfoResponse {

	private int itemID;
	private String itemName;
	private boolean itemAvailability;
	private double unitPrice;
	
	
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public boolean isItemAvailability() {
		return itemAvailability;
	}
	public void setItemAvailability(boolean itemAvailability) {
		this.itemAvailability = itemAvailability;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
}
