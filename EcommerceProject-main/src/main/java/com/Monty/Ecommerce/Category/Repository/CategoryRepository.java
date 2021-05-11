package com.Monty.Ecommerce.Category.Repository;

import com.Monty.Ecommerce.Category.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface CategoryRepository extends JpaRepository<Category, Serializable> {
}
