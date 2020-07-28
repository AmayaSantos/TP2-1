package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Racha;
import edu.fiuba.algo3.modelo.RespuestaCorrecta;
import edu.fiuba.algo3.modelo.RespuestaIncorrecta;

public class EnRacha extends Racha {
    int respuestasCorrectas, getRespuestasIncorrectas;

    public EnRacha(int respuestasCorrectas){
        this.respuestasCorrectas = respuestasCorrectas;
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

}
