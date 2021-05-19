package com.example.CustomerInfoService.Controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.CustomerInfoService.Dto.CustomerRequest;
import com.example.CustomerInfoService.Dto.CustomerResponse;

@RestController
@RequestMapping("/customer")
public class CustomerController {


    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    CustomerResponse createCustomer(@RequestBody CustomerRequest customerRequest) {


        System.out.println("Customer details:" + customerRequest);

        var customerResponse = new CustomerResponse();
        customerResponse.setCustId(UUID.randomUUID().toString());
        customerResponse.setMessage("Successfully created the user");

        return customerResponse;

    }



}
