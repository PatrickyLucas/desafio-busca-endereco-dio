package br.com.dio.enderecopessoas.repository;

import br.com.dio.enderecopessoas.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface de repositório para a entidade Pessoa.
 * Extende JpaRepository para fornecer operações CRUD básicas.
 *
 * @author Patricky Lucas
 */
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {}