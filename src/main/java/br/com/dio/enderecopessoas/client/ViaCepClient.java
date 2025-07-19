package br.com.dio.enderecopessoas.client;

import br.com.dio.enderecopessoas.dto.EnderecoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * Cliente Feign para acessar o serviço ViaCep.
 * Este cliente é utilizado para buscar informações de endereço com base no CEP fornecido.
 *
 * @author Patricky Lucas
 */
@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepClient {
    @GetMapping("/{cep}/json/")
    EnderecoDTO buscar(@PathVariable("cep") String cep);
}