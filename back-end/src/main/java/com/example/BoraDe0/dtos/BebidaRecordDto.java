package com.example.BoraDe0.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record BebidaRecordDto(@NotBlank String nome,@NotNull double preco,@NotBlank String descricao) {

	
	
}
