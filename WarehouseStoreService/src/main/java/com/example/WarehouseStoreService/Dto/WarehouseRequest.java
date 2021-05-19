package com.example.WarehouseStoreService.Dto;

public class WarehouseRequest {

	private String itemName;
	private String qty;

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "WarehouseRequest{" + "itemName='" + itemName + '\'' + ", qty='" + qty + '\'' + '}';
	}

}
