package br.com.dio.enderecopessoas.dto;

import jakarta.validation.constraints.NotBlank;

/**
 * Data Transfer Object (DTO) para representar uma solicitação de criação de pessoa.
 * Este DTO é utilizado para transferir dados de entrada necessários para criar uma nova pessoa,
 * incluindo o nome e o CEP, entre diferentes camadas da aplicação.
 *
 * @author Patricky Lucas
 */
public record PessoaRequestDTO(
        @NotBlank String nome,
        @NotBlank String cep
) {}