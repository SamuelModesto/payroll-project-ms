package com.samuel.modesto.payroll.resources;

import com.samuel.modesto.payroll.model.Payment;
import com.samuel.modesto.payroll.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {

    @Autowired
    private PaymentService service;

    @GetMapping(value = "/{id}/dias/{dias}")
    public ResponseEntity<Payment> getPayment(@PathVariable Long id, @PathVariable int dias){
        Payment payment = service.getPayment(id, dias);
        return ResponseEntity.ok(payment);
    }

}
