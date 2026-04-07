package com.arq.paymentshistorylineage.dto;

public class InvoiceRequest {
    private String id;
    private String partnerCode;
    private String region;

    public InvoiceRequest() {
    }

    public InvoiceRequest(String id, String partnerCode, String region) {
        this.id = id;
        this.partnerCode = partnerCode;
        this.region = region;
    }

    public String getId() {
        return id;
    }

    public String getPartnerCode() {
        return partnerCode;
    }

    public String getRegion() {
        return region;
    }
}
