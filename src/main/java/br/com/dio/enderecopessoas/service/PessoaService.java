package br.com.dio.enderecopessoas.service;

import br.com.dio.enderecopessoas.dto.EnderecoDTO;
import br.com.dio.enderecopessoas.dto.PessoaRequestDTO;
import br.com.dio.enderecopessoas.dto.PessoaResponseDTO;
import br.com.dio.enderecopessoas.model.Pessoa;
import br.com.dio.enderecopessoas.repository.PessoaRepository;
import br.com.dio.enderecopessoas.service.strategy.EnderecoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    private final PessoaRepository repository;
    private final EnderecoService enderecoService;

    public PessoaService(PessoaRepository repository, EnderecoService enderecoService) {
        this.repository = repository;
        this.enderecoService = enderecoService;
    }

    public PessoaResponseDTO salvar(PessoaRequestDTO dto) {
        EnderecoDTO endereco = enderecoService.buscarEnderecoPorCep(dto.cep());

        Pessoa pessoa = new Pessoa();
        pessoa.setNome(dto.nome());
        pessoa.setCep(dto.cep());
        pessoa.setLogradouro(endereco.getLogradouro());
        pessoa.setBairro(endereco.getBairro());
        pessoa.setCidade(endereco.getLocalidade());
        pessoa.setEstado(endereco.getUf());

        Pessoa salva = repository.save(pessoa);

        return new PessoaResponseDTO(
                salva.getId(),
                salva.getNome(),
                salva.getLogradouro(),
                salva.getBairro(),
                salva.getCidade(),
                salva.getEstado()
        );
    }

    public List<PessoaResponseDTO> listarTodos() {
        return repository.findAll().stream()
                .map(p -> new PessoaResponseDTO(
                        p.getId(), p.getNome(), p.getLogradouro(),
                        p.getBairro(), p.getCidade(), p.getEstado()
                ))
                .toList();
    }
}