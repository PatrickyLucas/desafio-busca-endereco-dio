package br.com.dio.enderecopessoas.dto;

import lombok.Data;

/**
 * Data Transfer Object (DTO) para representar um endereço.
 * Este DTO é utilizado para transferir dados de endereço, como logradouro,
 * bairro, localidade (cidade) e UF (estado), entre diferentes camadas da aplicação.
 *
 * @author Patricky Lucas
 */
@Data
public class EnderecoDTO {
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;
}