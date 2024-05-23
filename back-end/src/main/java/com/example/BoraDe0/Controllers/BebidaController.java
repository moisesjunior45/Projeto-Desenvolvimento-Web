package com.example.BoraDe0.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BoraDe0.dtos.BebidaRecordDto;
import com.example.BoraDe0.models.*;
//import com.example.BoraDe0.repositories.*;

import jakarta.validation.Valid;

@RestController
public class BebidaController {
	
	@Autowired
	com.example.BoraDe0.repositories.BebidaRepository bebidarepository;
	
	@PostMapping("/bebidas")
	public ResponseEntity<BebidaModel> saveBebida(@RequestBody @Valid BebidaRecordDto bebidaRecordDto){
		var bebidaModel = new BebidaModel();
		BeanUtils.copyProperties(bebidaRecordDto, bebidaModel);
		return ResponseEntity.status(HttpStatus.CREATED).body(bebidarepository.save(bebidaModel));
		
	}
	
	
}