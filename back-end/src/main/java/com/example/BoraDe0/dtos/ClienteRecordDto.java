package com.example.BoraDe0.dtos;

import jakarta.validation.constraints.NotBlank;

public record ClienteRecordDto(@NotBlank String nome,@NotBlank String cpf, @NotBlank String telefone ,@NotBlank String email,@NotBlank String endereco, @NotBlank String senha) {

}