package com.store.microservices.order.controller;

import com.store.microservices.order.dto.OrderRequest;
import com.store.microservices.order.service.OrderService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String PlaceOrder(@RequestBody OrderRequest orderRequest) {
        orderService.PlaceOrder(orderRequest);
        return "Order Placed Successfully";
    }
}
