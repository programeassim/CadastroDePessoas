package com.dev.CadastroDePessoas.Atribuicoes;

import com.dev.CadastroDePessoas.Pessoas.PessoaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_atividades")
@Data
@NoArgsConstructor
@AllArgsConstructor
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
