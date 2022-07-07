package com.example.demo.service;

import com.example.demo.model.PurchaseHistory;
import com.example.demo.projection.PurchaseItem;
import com.example.demo.repository.PurchaseRepository;

import java.util.List;

public interface PurchaseHistoryService {

    List<PurchaseItem> findPurchaseItemsOfUser(Long id);

    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

}






























