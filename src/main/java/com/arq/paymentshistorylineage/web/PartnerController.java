package com.arq.paymentshistorylineage.web;

import com.arq.paymentshistorylineage.dto.PartnerResponse;
import com.arq.paymentshistorylineage.service.PartnerService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/partner")
public class PartnerController {
    private final PartnerService service;

    public PartnerController(PartnerService service) {
        this.service = service;
    }

    @GetMapping
    public List<PartnerResponse> list() {
        return service.summarize();
    }
}
