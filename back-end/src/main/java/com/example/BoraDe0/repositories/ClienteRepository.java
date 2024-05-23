package com.example.BoraDe0.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BoraDe0.models.ClienteModel;



@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, Integer>{

	ClienteModel findByEmail(String email);

}