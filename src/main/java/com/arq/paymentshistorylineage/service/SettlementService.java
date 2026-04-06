package com.arq.paymentshistorylineage.service;

import com.arq.paymentshistorylineage.dto.SettlementResponse;
import com.arq.paymentshistorylineage.repository.SettlementRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class SettlementService {
    private final SettlementRepository repository;

    public SettlementService(SettlementRepository repository) {
        this.repository = repository;
    }

    public List<SettlementResponse> summarize() {
        return repository.findAll().stream().map(record -> new SettlementResponse(record.getId(), "ACTIVE", record.getOwner())).toList();
    }
}
