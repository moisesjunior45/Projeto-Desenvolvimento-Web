package com.example.boraDeZero.dtos;

import jakarta.validation.constraints.NotBlank;

public record LoginRecordDto(@NotBlank String email, @NotBlank String senha) {

	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}

	public String getSenha() {
		// TODO Auto-generated method stub
		return senha;
	}

}
