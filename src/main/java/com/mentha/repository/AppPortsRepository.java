package com.mentha.repository;


import com.mentha.model.AppPorts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppPortsRepository extends JpaRepository<AppPorts, Long> {

    AppPorts findByName(String name);

    AppPorts findById(Long id);
}
