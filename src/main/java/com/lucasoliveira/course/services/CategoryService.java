package com.lucasoliveira.course.services;

import com.lucasoliveira.course.entities.Category;
import com.lucasoliveira.course.entities.Order;
import com.lucasoliveira.course.repositories.CategoryRepository;
import com.lucasoliveira.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> user = categoryRepository.findById(id);
        return user.get();
    }
}
