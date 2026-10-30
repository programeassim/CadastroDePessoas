package com.dev.CadastroDePessoas.Atribuicoes;

import com.dev.CadastroDePessoas.Pessoas.PessoaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_atividades")
public class AtividadesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String prioridade;

    //@OneToMany uma atividade pode ter varias pessoas
    @OneToMany(mappedBy = "atividades")
    private List<PessoaModel> pessoas;
}
