package com.arq.paymentshistorylineage.web;

import com.arq.paymentshistorylineage.dto.RefundResponse;
import com.arq.paymentshistorylineage.service.RefundService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/refund")
public class RefundController {
    private final RefundService service;

    public RefundController(RefundService service) {
        this.service = service;
    }

    @GetMapping
    public List<RefundResponse> list() {
        return service.summarize();
    }
}
