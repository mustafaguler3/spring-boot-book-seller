package com.example.demo.service;

import com.example.demo.model.PurchaseHistory;
import com.example.demo.projection.PurchaseItem;
import com.example.demo.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseHistoryServiceImpl implements PurchaseHistoryService{


    private final PurchaseRepository purchaseRepository;

    @Autowired
    public PurchaseHistoryServiceImpl(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }
    @Override
    public PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory){

        purchaseHistory.setPurchaseTime(LocalDateTime.now());

        return purchaseRepository.save(purchaseHistory);
    }

    @Override
    public List<PurchaseItem> findPurchaseItemsOfUser(Long id){
        return purchaseRepository.findAllPurchaseOfUser(id);
    }
}


























