package com.javalec.purchasehistory.purchasehistory;

import org.springframework.data.repository.CrudRepository;

public interface PurchasesRepository extends CrudRepository<Purchase, Integer> {

}
