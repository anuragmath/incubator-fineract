package org.apache.fineract.portfolio.loanaccount.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PdcPaymentInventoryRepository extends JpaRepository<PaymentInventoryPdc, Long>, JpaSpecificationExecutor<PaymentInventoryPdc> {
	/*@Query("delete from PaymentInventoryPdc pdcPayment where pdcPayment.payment_inventory_id = :inventoryId")
    List<PaymentInventoryPdc> retrievePdcByInventoryId(@Param("inventoryId") Long inventoryId);*/
}
