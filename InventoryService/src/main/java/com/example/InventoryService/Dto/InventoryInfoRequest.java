package com.example.InventoryService.Dto;

public class InventoryInfoRequest {

	private String inventoryName;
	private String itemName;
	private String qty;
	private String unitPrice;

	public String getInventoryName() {
		return inventoryName;
	}

	public void setInventoryName(String inventoryName) {
		this.inventoryName = inventoryName;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	public String getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public String toString() {
		return "InventoryInfoRequest{" + "inventoryName='" + inventoryName + '\'' + ", itemName='" + itemName + '\''
				+ ", qty='" + qty + '\'' + ", unitPrice='" + unitPrice + '\'' + '}';
	}

}
