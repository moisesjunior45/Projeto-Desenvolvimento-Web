package com.example.boraDeZero.repositories;

import com.example.boraDeZero.models.PedidoBebida;
import com.example.boraDeZero.models.PedidoBebidaPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoBebidaRepository extends JpaRepository<PedidoBebida, PedidoBebidaPK> {
    
}
