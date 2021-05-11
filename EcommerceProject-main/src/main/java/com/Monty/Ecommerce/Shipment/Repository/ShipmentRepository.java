package com.Monty.Ecommerce.Shipment.Repository;

import com.Monty.Ecommerce.Shipment.Entity.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface ShipmentRepository extends JpaRepository<Shipment, Serializable> {
}
