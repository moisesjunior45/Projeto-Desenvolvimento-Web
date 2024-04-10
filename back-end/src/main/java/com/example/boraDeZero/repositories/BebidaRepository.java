package com.example.boraDeZero.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.boraDeZero.models.BebidaModel;

@Repository
public interface BebidaRepository extends JpaRepository<BebidaModel, Integer>{

}
