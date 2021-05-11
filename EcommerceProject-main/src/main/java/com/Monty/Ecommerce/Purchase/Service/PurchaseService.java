package com.Monty.Ecommerce.Purchase.Service;

import com.Monty.Ecommerce.Purchase.Entity.Purchase;
import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface PurchaseService {

    List<Purchase> getAllPurchase();
    Purchase createPurchase(Purchase purchase);
    Purchase findPurchase(UUID purchaseId);
    ResponseEntity<Purchase> getPurchaseId(UUID purchaseId);
    ResponseEntity<Purchase> updatePurchase(UUID purchaseId,Purchase purchase);
    ResponseEntity<Map<String , Boolean>> deletePurchase(UUID purchaseId);
    ResponseEntity<Map<String , Boolean>> deleteAllPurchase();






}
