package com.insFlagger.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insFlagger.model.ShipDetails;


@Repository
public interface ShipDetailsRepository extends JpaRepository<ShipDetails, Long> {

}