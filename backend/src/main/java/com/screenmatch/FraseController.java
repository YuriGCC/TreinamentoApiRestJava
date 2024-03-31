package com.screenmatch;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

    @Autowired
    private FraseServico fraseServico;

    @GetMapping("series/frases")
    public FraseDTO obterFraseAleatoria() {
        return fraseServico.obterFraseAleatoria();
    }
}
