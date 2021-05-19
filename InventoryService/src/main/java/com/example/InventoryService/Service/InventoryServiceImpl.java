package com.example.InventoryService.Service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.InventoryService.Dto.InventoryInfoRequest;
import com.example.InventoryService.Dto.InventoryInfoResponse;
import com.example.InventoryService.Dto.InventoryRefillRequest;
import com.example.InventoryService.Dto.InventoryRefillResponse;

public class InventoryServiceImpl {

	@Autowired
	private RestTemplate restTemplate;

	public InventoryInfoResponse addInventory(InventoryInfoRequest inventoryInfoRequest) {

		var inventoryRefillRequest = new InventoryRefillRequest();
		inventoryRefillRequest.setItemName(inventoryInfoRequest.getItemName());
		inventoryRefillRequest.setQty(inventoryInfoRequest.getQty());
		ResponseEntity<InventoryRefillResponse> inventoryRefillResponse = restTemplate
				.postForEntity("http://localhost:8080/store", inventoryRefillRequest, InventoryRefillResponse.class);

		var inventoryInfoResponse = new InventoryInfoResponse();
		inventoryInfoResponse.setInventoryId(UUID.randomUUID().toString());
		inventoryInfoResponse.setStoreId(inventoryRefillResponse.getBody().getStoreId());
		inventoryInfoResponse.setMessage("Successfully created refill request ");

		return inventoryInfoResponse;
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {

		return builder.build();
	}

}
