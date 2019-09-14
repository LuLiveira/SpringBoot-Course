package com.lucasoliveira.course.repositories;

import com.lucasoliveira.course.entities.Category;
import com.lucasoliveira.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
