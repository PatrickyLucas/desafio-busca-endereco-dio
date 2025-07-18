package br.com.dio.enderecopessoas.model;

import jakarta.persistence.*;
import lombok.*;

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