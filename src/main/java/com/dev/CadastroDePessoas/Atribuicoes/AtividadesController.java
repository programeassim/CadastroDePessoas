package com.dev.CadastroDePessoas.Atribuicoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("atividades")
public class AtividadesController {

    // GET --  Mandar uma requisisao para mostrar as atividades
    @GetMapping("/listar")
    public String listarAtividade() {
        return "Atividades listadas com sucesso";
    }


    // POST --  Mandar uma requisisao para criar as atividades
    @PostMapping("/criar")
    public String criarAtividade(){
        return "Atividade criada com sucesso";
    }

    // PUT --  Mandar uma requisisao para alterar as atividades
    @PutMapping("/alterar")
    public String alterarAtividade() {
        return "Atividade alterada com sucesso";
    }

    // DELETAR --  Mandar uma requisisao para deletar as atividades
    @DeleteMapping("/deletar")
    public String deletarAtividade() {
        return "Atividade deletada com sucesso";
    }

}
