package com.arq.paymentshistorylineage.dto;

public class DisputeResponse {
    private final String id;
    private final String status;
    private final String owner;

    public DisputeResponse(String id, String status, String owner) {
        this.id = id;
        this.status = status;
        this.owner = owner;
    }

    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public String getOwner() {
        return owner;
    }
}
