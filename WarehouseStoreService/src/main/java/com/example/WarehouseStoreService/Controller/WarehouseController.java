package com.example.WarehouseStoreService.Controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.WarehouseStoreService.Dto.WarehouseRequest;
import com.example.WarehouseStoreService.Dto.WarehouseResponse;

@RestController
@RequestMapping("/store")
public class WarehouseController {

	@PostMapping(consumes = "application/json", produces = "application/json")
	public @ResponseBody WarehouseResponse createStore(@RequestBody WarehouseRequest warehouseRequest) {

		System.out.println("Store details:" + warehouseRequest);
		var warehouseResponse = new WarehouseResponse();
		warehouseResponse.setStoreId(UUID.randomUUID().toString());
		warehouseResponse.setMessage("Warehouse Information Successfully retrieved");

		return warehouseResponse;
	}

}
