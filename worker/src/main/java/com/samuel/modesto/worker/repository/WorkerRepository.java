package com.samuel.modesto.worker.repository;

import com.samuel.modesto.worker.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long>  {
}
