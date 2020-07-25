package edu.fiuba.algo3.modelo;

public class OpcionVerdadero implements OpcionVoF{

    public void esCorrecta(PreguntaVoF pregunta){
        pregunta.laCorrectaEsLaVerdadera();
    }

    public Respuesta esCalificadaPor(PreguntaVoF pregunta){
        return pregunta.calificar(this);
    }
}
