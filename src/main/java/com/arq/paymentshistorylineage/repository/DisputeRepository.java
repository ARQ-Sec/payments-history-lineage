package com.arq.paymentshistorylineage.repository;

import com.arq.paymentshistorylineage.domain.DisputeRecord;
import java.time.Instant;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Repository;

@Repository
public class DisputeRepository {
    private final Map<String, DisputeRecord> storage = new ConcurrentHashMap<>();

    public DisputeRepository() {
        storage.put("dispute-seed", new DisputeRecord("dispute-seed", "dispute-owner", "eu-central", Instant.now()));
    }

    public Collection<DisputeRecord> findAll() {
        return storage.values();
    }
}
