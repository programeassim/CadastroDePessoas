package com.dev.CadastroDePessoas.Pessoas;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class PessoaController {
    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }
        //Adicionar Pessoa (CREATE)
        @PostMapping("/criar")
        public  String criarPessoa() {
            return "Pessoa criada";
        }


        //Procura pessoa por ID (CREATE)
        @GetMapping("/todos")
        public  String mostrarTodasAsPessoas() {
            return "Mostra todas as pessoas";
        }

        //Mostrar todas as pessoas (READ)
            @GetMapping("/todosID")
            public  String mostrarTodasAsPessoasPorId() {
                return "Mostra todas as pessoas por ID";
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
