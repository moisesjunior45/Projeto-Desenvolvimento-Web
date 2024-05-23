package com.example.BoraDe0.dtos;

import jakarta.validation.constraints.NotBlank;

public record LoginRecordDto(@NotBlank String email, @NotBlank String senha) {
}
