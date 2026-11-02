package com.dev.CadastroDePessoas.Pessoas;
import com.dev.CadastroDePessoas.Atribuicoes.AtividadesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @Column (name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column(name = "img_url")
    private  String imgUrl;

    @Column (name = "idade")
    private int idade;

    //  @ManyToOne uma pessoa tem uma unica atividade
    @ManyToOne
    @JoinColumn(name = "atividades_id") //Foreing Key ou chave estrangeira
    private AtividadesModel atividades;



}
