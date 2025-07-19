package br.com.dio.enderecopessoas.service.strategy;

import br.com.dio.enderecopessoas.dto.EnderecoDTO;
import org.springframework.stereotype.Service;

/**
 * Interface que define o contrato para serviços de busca de endereço.
 * Implementações desta interface devem fornecer a lógica para buscar
 * informações de endereço com base no CEP fornecido.
 *
 * @author Patricky Lucas
 */
@Service
public interface EnderecoService {
    EnderecoDTO buscarEnderecoPorCep(String cep);
}