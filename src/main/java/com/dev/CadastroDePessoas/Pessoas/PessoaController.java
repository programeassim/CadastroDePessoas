package com.dev.CadastroDePessoas.Pessoas;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }
        //Adicionar Pessoa (CREATE)
        @PostMapping("/criar")
        public  String criarPessoa() {
            return "Pessoa criada";
        }


        //Mostrar todas as pessoas (READ)
            @GetMapping("/listarPessoas")
            public List<PessoaModel> listarPessoas() {
                return pessoaService.listarPessoas();
            }

    //Mostrar todas as pessoas por id (READ)
    @GetMapping("/listar/{id}")
    public PessoaModel listarPessoasPorId(@PathVariable Long id) {
        return pessoaService.listarPessoasPorId(id);
    }

        //Altarar dados Pessoas (UPDATE)

            @PutMapping("/alterarID")
            public  String alterarPessoasPorId() {
                return "Alterar Pessoa por id";
            }

        // Deletar Pessoas (DELETE)

        @DeleteMapping("/deletarID")
        public  String deletarPessoasPorId() {
            return "Pessoa deletada por id";
        }

}
