package com.lucasoliveira.course.services;

import com.lucasoliveira.course.entities.Order;
import com.lucasoliveira.course.entities.User;
import com.lucasoliveira.course.repositories.OrderRepository;
import com.lucasoliveira.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> user = orderRepository.findById(id);
        return user.get();
    }
}
