package com.screenmatch;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FraseServico {

    @Autowired
    private FraseRepositorio fraseRepositorio;

    public FraseDTO obterFraseAleatoria() {
        Optional<Frase> fraseObtida = fraseRepositorio.obterFraseAleatoria();

        if (fraseObtida.isPresent()) {
            Frase frase = fraseObtida.get();
            return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(),
                    frase.getPoster());
        }

        return null;
    }
}
