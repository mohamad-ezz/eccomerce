package com.Monty.Ecommerce.Payment.Repository;

import com.Monty.Ecommerce.Payment.Entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface PaymentRepository extends JpaRepository<Payment, Serializable> {
}
