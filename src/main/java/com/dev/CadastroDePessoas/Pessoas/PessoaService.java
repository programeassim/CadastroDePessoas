package com.dev.CadastroDePessoas.Pessoas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {


    private PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    //Listar todas as pessoas
    public List<PessoaModel> listarPessoas() {
        return pessoaRepository.findAll();
    }

    //Listar todas as pessoas por id
    public PessoaModel listarPessoasPorId(Long id){
        Optional<PessoaModel> pessoaPorId = pessoaRepository.findById(id);
        return pessoaPorId.orElse(null);
    }
}
