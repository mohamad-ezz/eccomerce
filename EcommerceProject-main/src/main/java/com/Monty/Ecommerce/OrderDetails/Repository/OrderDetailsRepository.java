package com.Monty.Ecommerce.OrderDetails.Repository;

import com.Monty.Ecommerce.OrderDetails.Entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Serializable> {
}
