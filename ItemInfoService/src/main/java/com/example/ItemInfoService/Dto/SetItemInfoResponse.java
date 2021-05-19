package com.example.ItemInfoService.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SetItemInfoResponse {

	@JsonProperty("itemID;")
	private int itemID;;
	@JsonProperty("itemName;")
	private String itemName;;
	@JsonProperty("itemAvailability;")
	private boolean  itemAvailability;;
	@JsonProperty("unitPrice;")
	private double  unitPrice;
	
	@Override
	public String toString() {
		return "SetItemInfoResponse [itemID=" + itemID + ", itemName=" + itemName + ", itemAvailability="
				+ itemAvailability + ", unitPrice=" + unitPrice + "]";
	}
	
	
	
}
