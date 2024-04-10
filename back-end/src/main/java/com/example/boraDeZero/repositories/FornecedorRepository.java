package com.example.boraDeZero.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.boraDeZero.models.FornecedorModel;

@Repository
public interface FornecedorRepository extends JpaRepository<FornecedorModel, Integer>{

}
