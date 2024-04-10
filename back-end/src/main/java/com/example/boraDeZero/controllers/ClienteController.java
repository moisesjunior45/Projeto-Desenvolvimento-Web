package com.example.boraDeZero.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.boraDeZero.dtos.ClienteRecordDto;
import com.example.boraDeZero.models.ClienteModel;
import com.example.boraDeZero.repositories.ClienteRepository;

import jakarta.validation.Valid;

@RestController
public class ClienteController {
	
	@Autowired
	ClienteRepository clienterepository;
	
	@PostMapping("/clientes")
	public ResponseEntity<ClienteModel> saveCliente(@RequestBody @Valid ClienteRecordDto clienteRecordDto){
		var clienteModel = new ClienteModel();
		BeanUtils.copyProperties(clienteRecordDto, clienteModel);
		return ResponseEntity.status(HttpStatus.CREATED).body(clienterepository.save(clienteModel));
		
	}
}
