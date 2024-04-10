package com.example.boraDeZero.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.boraDeZero.dtos.BebidaRecordDto;
import com.example.boraDeZero.models.BebidaModel;
import com.example.boraDeZero.repositories.BebidaRepository;

import jakarta.validation.Valid;

@RestController
public class BebidaController {
	
	@Autowired
	BebidaRepository bebidarepository;
	
	@PostMapping("/bebidas")
	public ResponseEntity<BebidaModel> saveBebida(@RequestBody @Valid BebidaRecordDto bebidaRecordDto){
		var bebidaModel = new BebidaModel();
		BeanUtils.copyProperties(bebidaRecordDto, bebidaModel);
		return ResponseEntity.status(HttpStatus.CREATED).body(bebidarepository.save(bebidaModel));
		
	}
	
	
}