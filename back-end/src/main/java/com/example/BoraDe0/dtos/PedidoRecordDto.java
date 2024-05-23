package com.example.BoraDe0.dtos;

import java.time.LocalDateTime;
import java.util.List;

import com.example.BoraDe0.models.PedidoBebida;

public record PedidoRecordDto(int idCliente,LocalDateTime dataPedido,String status, List<PedidoBebida> pedidoProdutos) {

}

