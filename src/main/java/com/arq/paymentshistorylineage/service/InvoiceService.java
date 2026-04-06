package com.arq.paymentshistorylineage.service;

import com.arq.paymentshistorylineage.dto.InvoiceResponse;
import com.arq.paymentshistorylineage.repository.InvoiceRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {
    private final InvoiceRepository repository;

    public InvoiceService(InvoiceRepository repository) {
        this.repository = repository;
    }

    public List<InvoiceResponse> summarize() {
        return repository.findAll().stream().map(record -> new InvoiceResponse(record.getId(), "ACTIVE", record.getOwner())).toList();
    }
}
