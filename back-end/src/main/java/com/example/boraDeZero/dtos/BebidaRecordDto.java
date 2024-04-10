package com.example.boraDeZero.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record BebidaRecordDto(@NotBlank String nome,@NotNull double preco,@NotBlank String descricao,@NotNull int estoque,@NotBlank String linkImagem) {

	
	
}
