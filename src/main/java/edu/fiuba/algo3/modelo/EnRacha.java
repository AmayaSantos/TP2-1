package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Racha;
import edu.fiuba.algo3.modelo.RespuestaCorrecta;
import edu.fiuba.algo3.modelo.RespuestaIncorrecta;

import java.util.ArrayList;

public class EnRacha extends Racha {

    public EnRacha(int respuestasCorrectas){
        this.correctas = respuestasCorrectas;
    }

    @Override
    public Racha verificar(Racha racha) {
        return racha.verificar(this);
    }

    @Override
    public Racha verificar(EnRacha racha) {
        racha.sumarCorrecta();
        return racha;
    }

    @Override
    public Racha verificar(RachaRota racha) {
        racha.sumarCorrecta();
        return racha;
    }

    public Respuesta definirRespuesta(ArrayList<Respuesta> respuestas){
        return respuestas.get(correctas);
    }
}
