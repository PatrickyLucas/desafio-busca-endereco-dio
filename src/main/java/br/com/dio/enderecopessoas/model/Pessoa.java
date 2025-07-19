package br.com.dio.enderecopessoas.model;

import jakarta.persistence.*;
import lombok.*;

/**
 * Classe que representa uma pessoa no sistema.
 * Contém informações como nome, CEP, logradouro, bairro, cidade e estado.
 * Utiliza anotações do JPA para mapear a entidade para uma tabela no banco de dados.
 *
 * @author Patricky Lucas
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cep;

    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
}