package br.com.dio.enderecopessoas.dto;

public record PessoaResponseDTO(
        Long id,
        String nome,
        String logradouro,
        String bairro,
        String cidade,
        String estado
) {}