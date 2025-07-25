package br.com.bitrama.CadastroDePersonagens.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PersonagemController {


    @GetMapping("/boasvindas") //pega a informação que tem dentro de boasVindas()
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }

}
