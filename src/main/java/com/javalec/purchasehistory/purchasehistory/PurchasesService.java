package com.javalec.purchasehistory.purchasehistory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PurchasesService {

    @Autowired
    private PurchasesRepository purchasesRepository;

    public List<Purchase> getAllPurchases(){
        List<Purchase> purchases = new ArrayList<>();
        purchasesRepository.findAll()
                .forEach(purchases::add);
        return purchases;
    }

}
