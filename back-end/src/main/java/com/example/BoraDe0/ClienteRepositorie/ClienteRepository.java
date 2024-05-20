package com.example.BoraDe0.ClienteRepositorie;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BoraDe0.Models.ClienteModel;



@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, Integer>{

	Optional<ClienteModel> findByEmail(String email);

}