package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Racha {
    protected int correctas, incorrectas;

    protected int correctas(){
        return correctas;
    }

    public Racha verificar(Racha racha){
        return null;
    }

    public Racha verificar(EnRacha racha){
        return null;
    }

    public Racha verificar(RachaRota racha){
        return null;
    }

    public Respuesta definirRespuesta(ArrayList<Respuesta> respuestas){
        return null;
    }

    void sumarCorrecta(){
        correctas++;
    }

    void sumarIncorrecta(){
        incorrectas++;
    }
}
