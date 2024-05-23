package com.example.BoraDe0.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BoraDe0.models.PedidoModel;

@Repository
public interface PedidoRepository extends JpaRepository<PedidoModel, Integer>{

}