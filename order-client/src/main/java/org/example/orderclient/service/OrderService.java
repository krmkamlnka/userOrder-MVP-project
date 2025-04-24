package org.example.orderclient.service;

import org.example.orderclient.entity.Order;
import org.example.orderclient.entity.User;
import org.example.orderclient.repository.OrderRepository;
import org.example.orderclient.repository.UserServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private OrderRepository orderRepository;
    private UserServiceInterface userServiceInterface;

    public OrderService(OrderRepository orderRepository, UserServiceInterface userServiceInterface) {
        this.orderRepository = orderRepository;
        this.userServiceInterface = userServiceInterface;
    }

    public void create(Order order) {
        orderRepository.save(order);
    }

    public List<Order> getOrdersByUserId(Long userId) {
        return orderRepository.findByUserId(userId);
    }

    public User getUserByOrderId(Long orderId) {
        Order order = orderRepository.findById(orderId).orElse(null);
        if(order == null) return null;
        return userServiceInterface.getUserById(order.getUserId());
    }
}
