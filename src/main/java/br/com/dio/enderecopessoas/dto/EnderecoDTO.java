package br.com.dio.enderecopessoas.dto;

import lombok.Data;

@Data
public class EnderecoDTO {
    private String logradouro;
    private String bairro;
    private String localidade; // cidade
    private String uf; // estado
}