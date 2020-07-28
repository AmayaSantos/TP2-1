package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class RachaRota extends Racha{

    public RachaRota(int respuestasCorrectas){
        this.correctas = respuestasCorrectas;
        incorrectas = 1;
    }

    @Override
    public Racha verificar(Racha racha) {
        return racha.verificar(this);
    }

    @Override
    public Racha verificar(EnRacha racha) {
        return new RachaRota(racha.correctas());
    }

    @Override
    public Racha verificar(RachaRota racha) {
        racha.sumarIncorrecta();
        return racha;
    }

    public Respuesta definirRespuesta(ArrayList<Respuesta> respuestas){
        return new RespuestaIncorrecta();
    }


}
