package com.samuel.modesto.payroll.services;

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

    @Value("${worker.host}")
    private String workerHost;

    @Autowired
    private RestTemplate restTemplate;

    public Payment getPayment(long workerId, int dias){

        //criar um mapa de parametros
        Map<String, String> uriVaribles = new HashMap<>();
        uriVaribles.put("id", ""+workerId);

        Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVaribles);


        return new Payment(worker.getNome(), worker.getValorPorDia(), dias);
    }
}
