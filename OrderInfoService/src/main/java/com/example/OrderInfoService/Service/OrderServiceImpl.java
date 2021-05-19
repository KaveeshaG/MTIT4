package com.example.OrderInfoService.Service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.OrderInfoService.Dto.OrderRequest;
import com.example.OrderInfoService.Dto.OrderResponse;
import com.example.OrderInfoService.Dto.UserCreationRequest;
import com.example.OrderInfoService.Dto.UserCreationResponse;

@Service
public class OrderServiceImpl {

	@Autowired
	private RestTemplate restTemplate;

	public OrderResponse createOrder(OrderRequest orderRequest) {

		var userCreationRequest = new UserCreationRequest();
		userCreationRequest.setAge(orderRequest.getAge());
		userCreationRequest.setFullName(orderRequest.getFullName());
		ResponseEntity<UserCreationResponse> userCreationResponse = restTemplate
				.postForEntity("http://localhost:8082/customer", userCreationRequest, UserCreationResponse.class);

		var orderResponse = new OrderResponse();
		orderResponse.setOrderId(UUID.randomUUID().toString());
		orderResponse.setCustId(userCreationResponse.getBody().getCustId());
		orderResponse.setMessage("Sucessfully create the order");

		return orderResponse;

	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

}
