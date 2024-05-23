package com.example.BoraDe0.repositories;

import com.example.BoraDe0.models.PedidoBebida;
import com.example.BoraDe0.models.PedidoBebidaPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoBebidaRepository extends JpaRepository<PedidoBebida, PedidoBebidaPK> {
	
}