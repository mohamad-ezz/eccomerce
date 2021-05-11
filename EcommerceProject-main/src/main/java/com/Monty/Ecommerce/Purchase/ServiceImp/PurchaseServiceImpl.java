package com.Monty.Ecommerce.Purchase.ServiceImp;

import com.Monty.Ecommerce.Purchase.Entity.Purchase;
import com.Monty.Ecommerce.Purchase.Repository.PurchaseRepository;
import com.Monty.Ecommerce.Purchase.Service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class PurchaseServiceImpl implements PurchaseService {

@Autowired
    PurchaseRepository purchaseRepository;


    @Override
    public List<Purchase> getAllPurchase() {
        return purchaseRepository.findAll();
    }

    @Override
    public Purchase createPurchase(Purchase purchase) {
        Calendar dateCreated = Calendar.getInstance();
        purchase.setDateCreated(dateCreated);
        return purchaseRepository.save(purchase);

    }

    @Override
    public Purchase findPurchase(UUID purchaseId) {
       Purchase purchase = purchaseRepository.findById(purchaseId);
       return purchase;
    }

    @Override
    public ResponseEntity<Purchase> getPurchaseId(UUID purchaseId) {
        Purchase purchase = purchaseRepository.findById(purchaseId);
        return ResponseEntity.ok(purchase);
    }

    @Override
    public ResponseEntity<Purchase> updatePurchase(UUID purchaseId, Purchase purchase) {
        Purchase pur=purchaseRepository.findById(purchaseId);
        Calendar dateUpdated = Calendar.getInstance();
        pur.setDateUpdated(dateUpdated);
        pur.setActive(purchase.isActive());
        pur.setShipped(purchase.isShipped());
        pur.setPurchaseDetails(purchase.getPurchaseDetails());
        pur.setShipment(purchase.getShipment());
        pur.setTransactionStatus(purchase.getTransactionStatus());
        Purchase updatePurchase =purchaseRepository.save(pur);
        return ResponseEntity.ok(updatePurchase);

    }

    @Override
    public ResponseEntity<Map<String, Boolean>> deletePurchase(UUID purchaseId) {
        Purchase purchase=purchaseRepository.findById(purchaseId);
        purchaseRepository.delete(purchase);
        Map<String, Boolean> response = new HashMap();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);

    }

    @Override
    public ResponseEntity<Map<String, Boolean>> deleteAllPurchase() {
        purchaseRepository.deleteAll();
        Map<String, Boolean> response = new HashMap();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
