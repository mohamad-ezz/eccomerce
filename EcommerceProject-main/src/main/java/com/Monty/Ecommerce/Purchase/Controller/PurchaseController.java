package com.Monty.Ecommerce.Purchase.Controller;

import com.Monty.Ecommerce.Purchase.Entity.Purchase;
import com.Monty.Ecommerce.Purchase.Service.PurchaseService;
import com.Monty.Ecommerce.User.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/")
public class PurchaseController {
    @Autowired
    PurchaseService purchaseService;

    //get all purchase
    @GetMapping("/purchase")
    public List<Purchase> getAllPurchase() {
        return purchaseService.getAllPurchase();
    }


    // get purchase by id
    @GetMapping("/purchase/{purchaseId}")

    public ResponseEntity<Purchase> getPurchaseId(@PathVariable UUID purchaseId)
    { return purchaseService.getPurchaseId(purchaseId);
    }

    // create purchase
    @PostMapping("/purchase")
    public Purchase createPurchase(@RequestBody Purchase purchase) {
        return purchaseService.createPurchase(purchase);
    }

    // update purchase
    @PutMapping("/purchase/{purchaseId}")
    public ResponseEntity<Purchase> updatePurchase(@PathVariable UUID purchaseId, @RequestBody Purchase purchaseDetails) {
        return purchaseService.updatePurchase(purchaseId,purchaseDetails);
    }

    // delete purchase
    @DeleteMapping("/purchase/{purchaseId}")
    public ResponseEntity<Map<String, Boolean>> deletePurchase(@PathVariable UUID purchaseId) {
        return purchaseService.deletePurchase(purchaseId);
    }

    //  delete all users
    @DeleteMapping("/purchase")
    public ResponseEntity<Map<String, Boolean>> deleteAllPurchase() {
        return purchaseService.deleteAllPurchase();
    }


    }





