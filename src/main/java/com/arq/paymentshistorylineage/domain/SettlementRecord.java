package com.arq.paymentshistorylineage.domain;

import java.time.Instant;

public class SettlementRecord {
    private final String id;
    private final String owner;
    private final String region;
    private final Instant updatedAt;

    public SettlementRecord(String id, String owner, String region, Instant updatedAt) {
        this.id = id;
        this.owner = owner;
        this.region = region;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public String getRegion() {
        return region;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }
}
