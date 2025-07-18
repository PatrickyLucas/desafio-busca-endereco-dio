package br.com.dio.enderecopessoas.dto;

import jakarta.validation.constraints.NotBlank;

public record PessoaRequestDTO(
        @NotBlank String nome,
        @NotBlank String cep
) {}