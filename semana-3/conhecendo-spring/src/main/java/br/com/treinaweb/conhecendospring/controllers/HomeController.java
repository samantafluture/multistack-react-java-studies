package br.com.treinaweb.conhecendospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomeController {

    // Actions
    // Mapeia a URL "/" para a página home
    @RequestMapping(name = "/", method = RequestMethod.GET)
    public String home() {
        return "home"; // Retorna o nome da view que vai ser executada
    }

}
