package br.com.dio.enderecopessoas.service.strategy;

import br.com.dio.enderecopessoas.dto.EnderecoDTO;

public interface EnderecoService {
    EnderecoDTO buscarEnderecoPorCep(String cep);
}