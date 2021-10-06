package com.samuel.modesto.payroll.services;

import com.samuel.modesto.payroll.model.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int dias){
        return new Payment("Bob", 200, dias);
    }
}
