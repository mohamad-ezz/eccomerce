package com.Monty.Ecommerce.Orders.Repository;

import com.Monty.Ecommerce.Orders.Entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface OrdersRepository extends JpaRepository<Orders, Serializable> {
}
