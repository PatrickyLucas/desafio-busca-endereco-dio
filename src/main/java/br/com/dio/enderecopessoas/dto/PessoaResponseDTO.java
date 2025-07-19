package br.com.dio.enderecopessoas.dto;

/**
 * Data Transfer Object (DTO) para representar a resposta de uma pessoa.
 * Este DTO é utilizado para transferir dados de uma pessoa, incluindo
 * informações de endereço, entre diferentes camadas da aplicação.
 *
 * @author Patricky Lucas
 */
public record PessoaResponseDTO(
        Long id,
        String nome,
        String logradouro,
        String bairro,
        String cidade,
        String estado
) {}