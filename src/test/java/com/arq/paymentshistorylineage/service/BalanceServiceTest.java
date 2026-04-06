package com.arq.paymentshistorylineage.service;

import com.arq.paymentshistorylineage.repository.BalanceRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

class BalanceServiceTest {
    @Test
    void returnsSeedData() {
        BalanceService service = new BalanceService(new BalanceRepository());
        assertFalse(service.summarize().isEmpty());
    }
}
