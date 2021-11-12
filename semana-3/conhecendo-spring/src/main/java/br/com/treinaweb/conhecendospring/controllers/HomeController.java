package br.com.treinaweb.conhecendospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.treinaweb.conhecendospring.dto.DiaristaForm;

@Controller
@RequestMapping("/")
public class HomeController {

    // Actions
    // Mapeia a URL "/" para a página home
    @RequestMapping(name = "/", method = RequestMethod.GET)
    public String home() {
        return "home"; // Retorna o nome da view que vai ser executada
    }

    // Recebe como parâmetro
    @GetMapping("/modelmap")
    public String home2(ModelMap modelMap) {
        modelMap.addAttribute("nome", "Samanta");
        return "home";
    }

    // Retorno objeto view
    @GetMapping("/modelandview")
    public ModelAndView home3() {
        var modelAndView = new ModelAndView("home");
        modelAndView.addObject("nome", "Mundo");
        return modelAndView;
    }

    // Responsável por exibir a tela do formulário
    @GetMapping("/form")
    public ModelAndView form() {
        var modelAndView = new ModelAndView("form");
        modelAndView.addObject("form", new DiaristaForm());
        return modelAndView;
    }

    @PostMapping("/form")
    public String form2(DiaristaForm form) {
        System.out.println(form);
        return "redirect:/form";
    }
}
