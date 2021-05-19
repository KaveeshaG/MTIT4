package com.example.OrderInfoService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.OrderInfoService.Dto.OrderRequest;
import com.example.OrderInfoService.Dto.OrderResponse;
import com.example.OrderInfoService.Service.OrderServiceImpl;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderServiceImpl orderService;

	@PostMapping(consumes = "application/json", produces = "application/json")
	public @ResponseBody OrderResponse createOrder(@RequestBody OrderRequest request) {

		System.out.println("Order Details :" + request);

		return orderService.createOrder(request);

	}

}
