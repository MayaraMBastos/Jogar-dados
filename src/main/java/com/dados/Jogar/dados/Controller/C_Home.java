package com.dados.Jogar.dados.Controller;

import com.dados.Jogar.dados.Model.M_Jogar;
import com.dados.Jogar.dados.Service.S_Dados;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class C_Home {

    @GetMapping("/")
    public String pagHome() {
        return "Home/home";
    }

    // atributes soma, maximo criar model
    @PostMapping("/")
    public String postDados(@RequestParam("qtdDados") int qtdDados,
                            @RequestParam("qtdFaces") int qtdFaces,
                            Model model) {
        M_Jogar jogada = S_Dados.jogarDados(qtdDados, qtdFaces);

        model.addAttribute("dados", jogada.getDados());
        model.addAttribute("soma", jogada.getSoma());
        model.addAttribute("maior", jogada.getMaior());
        return "Home/home";
    }
}
