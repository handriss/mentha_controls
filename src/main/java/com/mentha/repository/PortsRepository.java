package com.mentha.repository;

import com.mentha.model.Ports;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortsRepository extends JpaRepository<Ports, Long> {

//    User findByEmail(String email);

}
