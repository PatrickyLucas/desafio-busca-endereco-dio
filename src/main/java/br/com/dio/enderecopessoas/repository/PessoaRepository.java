package br.com.dio.enderecopessoas.repository;

import br.com.dio.enderecopessoas.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {}