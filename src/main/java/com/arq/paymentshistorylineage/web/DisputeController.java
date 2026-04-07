package com.arq.paymentshistorylineage.web;

import com.arq.paymentshistorylineage.dto.DisputeResponse;
import com.arq.paymentshistorylineage.service.DisputeService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dispute")
public class DisputeController {
    private final DisputeService service;

    public DisputeController(DisputeService service) {
        this.service = service;
    }

    @GetMapping
    public List<DisputeResponse> list() {
        return service.summarize();
    }
}
