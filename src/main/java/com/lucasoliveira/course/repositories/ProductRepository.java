package com.lucasoliveira.course.repositories;

import com.lucasoliveira.course.entities.Category;
import com.lucasoliveira.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
