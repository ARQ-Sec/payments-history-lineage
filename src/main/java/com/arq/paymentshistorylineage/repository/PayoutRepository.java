package com.arq.paymentshistorylineage.repository;

import com.arq.paymentshistorylineage.domain.PayoutRecord;
import java.time.Instant;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Repository;

@Repository
public class PayoutRepository {
    private final Map<String, PayoutRecord> storage = new ConcurrentHashMap<>();

    public PayoutRepository() {
        storage.put("payout-seed", new PayoutRecord("payout-seed", "payout-owner", "eu-central", Instant.now()));
    }

    public Collection<PayoutRecord> findAll() {
        return storage.values();
    }
}
