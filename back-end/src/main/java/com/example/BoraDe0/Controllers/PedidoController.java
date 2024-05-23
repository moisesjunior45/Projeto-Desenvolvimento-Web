package com.example.BoraDe0.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.BoraDe0.dtos.PedidoRecordDto;

import com.example.BoraDe0.models.PedidoModel;
import com.example.BoraDe0.repositories.PedidoRepository;

import jakarta.validation.Valid;

@RestController
public class PedidoController {

	@Autowired
	PedidoRepository pedidorepository;

	@PostMapping("/pedidos")
	public ResponseEntity<PedidoModel> savePedido(@RequestBody @Valid PedidoRecordDto pedidoRecordDto){
		var pedidoModel = new PedidoModel();
		BeanUtils.copyProperties(pedidoRecordDto, pedidoModel);
		return ResponseEntity.status(HttpStatus.CREATED).body(pedidorepository.save(pedidoModel));

	}
}
