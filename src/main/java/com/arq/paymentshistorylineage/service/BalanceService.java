package com.arq.paymentshistorylineage.service;

import com.arq.paymentshistorylineage.dto.BalanceResponse;
import com.arq.paymentshistorylineage.repository.BalanceRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class BalanceService {
    private final BalanceRepository repository;

    public BalanceService(BalanceRepository repository) {
        this.repository = repository;
    }

    public List<BalanceResponse> summarize() {
        return repository.findAll().stream().map(record -> new BalanceResponse(record.getId(), "ACTIVE", record.getOwner())).toList();
    }
}
