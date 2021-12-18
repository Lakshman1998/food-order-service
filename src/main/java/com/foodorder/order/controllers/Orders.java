package com.foodorder.order.controllers;

import com.foodorder.order.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/order")
@RestController
public class Orders extends Response {

    @Autowired
    private OrderService orderService;

    @GetMapping(value = "/test")
    public ResponseEntity checkOrders() {
        System.out.println("hello");
        return orderService.testOrders()
                .fold(this::error, this::success);
    }
}
