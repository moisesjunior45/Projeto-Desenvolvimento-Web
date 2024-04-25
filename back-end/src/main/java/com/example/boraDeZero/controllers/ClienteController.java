package com.example.boraDeZero.controllers;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/clientes")
	public ResponseEntity<ClienteModel> saveCliente(@RequestBody @Valid ClienteRecordDto clienteRecordDto){
		var clienteModel = new ClienteModel();
		BeanUtils.copyProperties(clienteRecordDto, clienteModel);
		return ResponseEntity.status(HttpStatus.CREATED).body(clienterepository.save(clienteModel));
		
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/clientes")
	public ResponseEntity<List<ClienteModel>> getAllClientes() {
	    List<ClienteModel> clientes = clienterepository.findAll();
	    return ResponseEntity.ok(clientes);
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/clientes/{id}")
	public ResponseEntity<ClienteModel> getClienteById(@PathVariable Integer id) {
	    return clienterepository.findById(id)
	            .map(ResponseEntity::ok)
	            .orElse(ResponseEntity.notFound().build());
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PutMapping("/clientes/{id}")
	public ResponseEntity<ClienteModel> updateCliente(@PathVariable Integer id,
	                                                  @RequestBody @Valid ClienteRecordDto clienteRecordDto) {
	    return clienterepository.findById(id)
	            .map(clienteExistente -> {
	                BeanUtils.copyProperties(clienteRecordDto, clienteExistente);
	                ClienteModel updatedCliente = clienterepository.save(clienteExistente);
	                return ResponseEntity.ok(updatedCliente);
	            })
	            .orElse(ResponseEntity.notFound().build());
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@DeleteMapping("/clientes/{id}")
	public ResponseEntity<Void> deleteCliente(@PathVariable Integer id) {
	    return clienterepository.findById(id)
	            .map(cliente -> {
	                clienterepository.delete(cliente);
	                return ResponseEntity.ok().<Void>build();
	            })
	            .orElse(ResponseEntity.notFound().build());
	}
	
}

