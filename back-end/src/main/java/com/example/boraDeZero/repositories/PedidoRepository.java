package com.example.boraDeZero.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.boraDeZero.models.PedidoModel;

@Repository
public interface PedidoRepository extends JpaRepository<PedidoModel, Integer>{

}
