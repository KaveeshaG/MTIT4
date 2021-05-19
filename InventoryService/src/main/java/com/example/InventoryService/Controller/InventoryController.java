package com.example.InventoryService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.InventoryService.Dto.InventoryInfoRequest;
import com.example.InventoryService.Dto.InventoryInfoResponse;
import com.example.InventoryService.Service.InventoryServiceImpl;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

	@Autowired
	private InventoryServiceImpl inventoryService;

	@PostMapping(consumes = "application/json", produces = "application/json")
	public @ResponseBody InventoryInfoResponse addInventory(@RequestBody InventoryInfoRequest request) {

		System.out.println("Inventory Details" + request);

//        var inventoryInfoResponse = new InventoryInfoResponse();
//        inventoryInfoResponse.setInventoryId(UUID.randomUUID().toString());
//        inventoryInfoResponse.setMessage("Successfully created refill request ");

		return inventoryService.addInventory(request);
	}

}
