package com.mentha.repository;

import com.mentha.model.Ports;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PortsRepository extends JpaRepository<Ports, Long> {

    Ports findById(Long id);

    Ports findBynev(String name);

    List<Ports> findByroomTypeIsNotNull();

}
