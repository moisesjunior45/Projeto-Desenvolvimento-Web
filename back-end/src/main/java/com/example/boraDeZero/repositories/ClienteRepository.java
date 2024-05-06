package com.example.boraDeZero.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.boraDeZero.models.ClienteModel;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, Integer>{

}
