package br.com.multistack.ediaristas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.multistack.ediaristas.models.Diarista;
import br.com.multistack.ediaristas.repositories.DiaristaRepository;

@Controller
@RequestMapping("/admin/diaristas")
public class DiaristaController {

    @Autowired
    private DiaristaRepository repository;
    
    @GetMapping("/cadastrar")
    public ModelAndView cadastrar(){
        var modelAndView = new ModelAndView("admin/diaristas/form");

        modelAndView.addObject("diarista", new Diarista());

        return modelAndView;
    }

    @PostMapping("/cadastrar")
    public String cadastrar(Diarista diarista){
        repository.save(diarista);
        return "redirect:/admin/diaristas/cadastrar";
    }
}
