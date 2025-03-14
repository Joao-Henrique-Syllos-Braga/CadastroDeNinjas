package com.example.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boasVindas")
public class NinjaController {

    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }
}
