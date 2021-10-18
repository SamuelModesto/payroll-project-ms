package com.samuel.modesto.payroll.feignclients;

import com.samuel.modesto.payroll.model.Worker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Component
@FeignClient(name = "worker", path = "/workers")
public interface WorkerFeignClient {

    @GetMapping(value = "{id}")
    ResponseEntity<Optional<Worker>> listarWorkerById(@PathVariable Long id);
}
