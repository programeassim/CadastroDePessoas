package com.dev.CadastroDePessoas.Pessoas;

import com.dev.CadastroDePessoas.Atribuicoes.AtividadesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//Entity transforma uma classe em uma entidade do BD
@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @Column(unique = true)
    private String email;

    private int idade;

    //  @ManyToOne uma pessoa tem uma unica atividade
    @ManyToOne
    @JoinColumn(name = "atividades_id") //Foreing Key ou chave estrangeira
    private AtividadesModel atividades;



}
