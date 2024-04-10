package com.example.boraDeZero.dtos;

import java.time.LocalDateTime;
import java.util.List;

import com.example.boraDeZero.models.PedidoBebida;

public record PedidoRecordDto(int idCliente,LocalDateTime dataPedido,String status, List<PedidoBebida> pedidoProdutos) {

}
