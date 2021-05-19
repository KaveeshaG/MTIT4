package com.example.ItemInfoService.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SetItemInfoRequest {

	@JsonProperty("itemID;")
	private int itemID;;
	@JsonProperty("itemName;")
	private String itemName;;
	@JsonProperty("itemAvailability;")
	private boolean  itemAvailability;;
	@JsonProperty("unitPrice;")
	private double  unitPrice;
	
}
