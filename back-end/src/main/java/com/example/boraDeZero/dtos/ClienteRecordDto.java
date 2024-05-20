package com.example.boraDeZero.dtos;

import jakarta.validation.constraints.NotBlank;

public record ClienteRecordDto(@NotBlank String nome,@NotBlank String cpf, @NotBlank String telefone ,@NotBlank String email) {

}
