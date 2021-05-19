package com.example.ItemInfoService.Controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ItemInfoService.Dto.SetItemInfoRequest;
import com.example.ItemInfoService.Dto.SetItemInfoResponse;


@RestController
@RequestMapping("/items")
public class ItemController {

	@Value("${itemName}")
	private String itemName;
	
    @PostMapping(path="/createItem", consumes = "application/json", produces = "application/json")
    public @ResponseBody
    SetItemInfoResponse createCustomer(@RequestBody SetItemInfoRequest setItemInfoRequest) {


        System.out.println("Item Details:" + setItemInfoRequest);

        var itemResponse = new SetItemInfoResponse();
        
        itemResponse.setCustId(UUID.randomUUID().toString());
        itemResponse.setMessage("Item created Successfully");

        return itemResponse;

    }



}
