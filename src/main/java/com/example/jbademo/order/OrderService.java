package com.example.jbademo.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepo orderRepo;

    @Autowired
    public OrderService(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    public List<Order> getOrder() {
        return orderRepo.findAll();
    }

    public Order getOrderById(Long id) {
        return orderRepo.findById(id).orElse(null);
    }

    public Order createOrder(Order order) {
        return orderRepo.save(order);
    }

    public Order updateOrder(Order order) {
        return orderRepo.save(order);
    }

    public void deleteOrderById(Long id) {
        orderRepo.deleteById(id);
    }

    public Order updateOrderName(Order order) {
        Order orderToUpdate = orderRepo.findById(order.getOrderId()).orElse(null);

        if (orderToUpdate != null) {
            orderToUpdate.setOrderName(order.getOrderName());
            return orderRepo.save(orderToUpdate);
        }
        return null;
    }

    public Order updateOrderPayment(Order order) {
        Order orderToUpdate = orderRepo.findById(order.getOrderId()).orElse(null);

        if (orderToUpdate != null) {
            orderToUpdate.setOrderPayment(order.getOrderPayment());
            return orderRepo.save(orderToUpdate);
        }
        return null;
    }
}
