package com.samuel.modesto.payroll.services;

import com.samuel.modesto.payroll.feignclients.WorkerFeignClient;
import com.samuel.modesto.payroll.model.Payment;
import com.samuel.modesto.payroll.model.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(long workerId, int dias){

        Worker worker = workerFeignClient.listarWorkerById(workerId).getBody().get();
        return new Payment(worker.getNome(), worker.getValorPorDia(), dias);
    }
}
