package br.com.dio.enderecopessoas.service.strategy;

import br.com.dio.enderecopessoas.client.ViaCepClient;
import br.com.dio.enderecopessoas.dto.EnderecoDTO;
import org.springframework.stereotype.Service;

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
