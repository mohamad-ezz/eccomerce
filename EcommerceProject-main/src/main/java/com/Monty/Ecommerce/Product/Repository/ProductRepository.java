package com.Monty.Ecommerce.Product.Repository;

import com.Monty.Ecommerce.Product.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface ProductRepository extends JpaRepository<Product, Serializable> {
}
