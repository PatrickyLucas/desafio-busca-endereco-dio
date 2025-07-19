package br.com.dio.enderecopessoas.service.strategy;

import br.com.dio.enderecopessoas.client.ViaCepClient;
import br.com.dio.enderecopessoas.dto.EnderecoDTO;
import org.springframework.stereotype.Service;

/**
 * Serviço que implementa a estratégia de busca de endereço utilizando o ViaCepClient.
 * Este serviço é responsável por buscar informações de endereço com base no CEP fornecido.
 *
 * @author Patricky Lucas
 */
@Service
public class ViaCepService implements EnderecoService {

    private final ViaCepClient viaCepClient;

    public ViaCepService(ViaCepClient viaCepClient) {
        this.viaCepClient = viaCepClient;
    }

    @Override
    public EnderecoDTO buscarEnderecoPorCep(String cep) {
        return viaCepClient.buscar(cep);
    }
}
