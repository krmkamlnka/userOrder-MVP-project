package org.example.orderclient.controller;

import org.example.orderclient.entity.Order;
import org.example.orderclient.entity.User;
import org.example.orderclient.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody Order order) {
        orderService.create(order);
        return ResponseEntity.ok("success");
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Order>> getOrderByUser(@PathVariable Long userId) {
        List<Order> orders = orderService.getOrdersByUserId(userId);
        return ResponseEntity.ok(orders);
    }

    @GetMapping("{orderId}/user")
    public ResponseEntity<User> getUserByOrderId(@PathVariable Long orderId) {
        User user = orderService.getUserByOrderId(orderId);
        return ResponseEntity.ok(user);
    }

}
