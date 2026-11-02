package com.dev.CadastroDePessoas.Atribuicoes;

import com.dev.CadastroDePessoas.Pessoas.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissoesRepository extends JpaRepository<PessoaModel, Long> {
}
