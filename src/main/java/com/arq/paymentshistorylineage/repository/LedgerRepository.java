package com.arq.paymentshistorylineage.repository;

import com.arq.paymentshistorylineage.domain.LedgerRecord;
import java.time.Instant;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Repository;

@Repository
public class LedgerRepository {
    private final Map<String, LedgerRecord> storage = new ConcurrentHashMap<>();

    public LedgerRepository() {
        storage.put("ledger-seed", new LedgerRecord("ledger-seed", "ledger-owner", "eu-central", Instant.now()));
    }

    public Collection<LedgerRecord> findAll() {
        return storage.values();
    }
}
