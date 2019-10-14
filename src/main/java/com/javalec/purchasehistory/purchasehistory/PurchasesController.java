package com.javalec.purchasehistory.purchasehistory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.util.List;

@RestController
public class PurchasesController {

    @Autowired
    private PurchasesService purchasesService;

    @RequestMapping("/purchases")
    public List<Purchase> getAllPurchases(){
        return purchasesService.getAllPurchases();
    }

    @RequestMapping("/purchases/")
    public List<Purchase> getAllPurchases(@RequestParam ZonedDateTime from, @RequestParam ZonedDateTime to){
        //purchasesService.getAllPurchasesInDateRange(from, to);
        return purchasesService.getAllPurchases();
    }
}
