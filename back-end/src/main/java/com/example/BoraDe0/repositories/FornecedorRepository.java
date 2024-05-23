package com.example.BoraDe0.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BoraDe0.models.FornecedorModel;

@Repository
public interface FornecedorRepository extends JpaRepository<FornecedorModel, Integer>{

}