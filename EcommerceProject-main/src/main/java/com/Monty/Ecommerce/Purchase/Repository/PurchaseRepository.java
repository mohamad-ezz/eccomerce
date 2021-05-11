package com.Monty.Ecommerce.Purchase.Repository;

import com.Monty.Ecommerce.Purchase.Entity.Purchase;
import com.Monty.Ecommerce.User.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.io.Serializable;
import java.util.UUID;

public interface PurchaseRepository extends JpaRepository<Purchase, Serializable> {


    @Query
    Purchase findById(UUID purchaseId);



}
