package br.com.dio.enderecopessoas.controller;

import br.com.dio.enderecopessoas.dto.PessoaRequestDTO;
import br.com.dio.enderecopessoas.dto.PessoaResponseDTO;
import br.com.dio.enderecopessoas.service.PessoaService;
import jakarta.validation.Valid;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador REST para gerenciar operações relacionadas a pessoas.
 * Este controlador expõe endpoints para criar uma nova pessoa e listar todas as pessoas cadastradas.
 * Utiliza o serviço PessoaService para realizar as operações de negócio.
 *
 * @author Patricky Lucas
 */
@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private final PessoaService service;

    public PessoaController(PessoaService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<PessoaResponseDTO> salvar(@RequestBody @Valid PessoaRequestDTO dto) {
        PessoaResponseDTO response = service.salvar(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public List<PessoaResponseDTO> listar() {
        return service.listarTodos();
    }
}