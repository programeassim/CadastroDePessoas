package com.dev.CadastroDePessoas.Atribuicoes;

import com.dev.CadastroDePessoas.Pessoas.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtividadesRepository extends JpaRepository<PessoaModel, Long> {
}
