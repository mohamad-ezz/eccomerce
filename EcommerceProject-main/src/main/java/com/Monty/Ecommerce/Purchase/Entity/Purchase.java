package com.Monty.Ecommerce.Purchase.Entity;

import com.Monty.Ecommerce.PurchaseDetails.Entity.PurchaseDetails;
import com.Monty.Ecommerce.Shipment.Entity.Shipment;
import com.Monty.Ecommerce.Vendor.Entity.Vendor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.UUID;

@Entity
@Table(name = "purchase")
@NoArgsConstructor
@Data
public class Purchase implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "purchase_id")
    private UUID purchaseId;

    @Column(name = "order_number")
    private long orderNumber;

    @Column(name = "order_date_placed")
    private Calendar orderDatePlaced;

    @Column(name = "transactionstatus")
    private String transactionStatus;

    @Column(name = "is_shipped")
    private boolean isShipped;

    @Column(name = "is_active")
    private boolean isActive;

    @Column(name = "date_created")
    private Calendar dateCreated;

    @Column(name = "date_updated")
    private Calendar dateUpdated;

    @ManyToOne
    @JoinColumn(name = "vendor_id")
    private Vendor vendor;

    @OneToOne
    @JoinColumn(name = "shipment_id")
    private Shipment shipment;

    @OneToOne
    @JoinColumn(name = "purchase_details_id")
    private PurchaseDetails purchaseDetails;

    public Purchase(long orderNumber, Calendar orderDatePlaced, String transactionStatus, boolean isShipped, boolean isActive, Calendar dateCreated, Calendar dateUpdated) {

        this.orderNumber = orderNumber;
        this.orderDatePlaced = orderDatePlaced;
        this.transactionStatus = transactionStatus;
        this.isShipped = isShipped;
        this.isActive = isActive;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }

    public UUID getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(UUID purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Calendar getOrderDatePlaced() {
        return orderDatePlaced;
    }

    public void setOrderDatePlaced(Calendar orderDatePlaced) {
        this.orderDatePlaced = orderDatePlaced;
    }

    public long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public boolean isShipped() {
        return isShipped;
    }

    public void setShipped(boolean shipped) {
        isShipped = shipped;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Calendar getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Calendar dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Calendar getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Calendar dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    public PurchaseDetails getPurchaseDetails() {
        return purchaseDetails;
    }

    public void setPurchaseDetails(PurchaseDetails purchaseDetails) {
        this.purchaseDetails = purchaseDetails;
    }
}
