package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle,Integer>{

}
