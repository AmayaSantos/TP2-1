package edu.fiuba.algo3.modelo;

public class OpcionFalso implements OpcionVoF {

    public void esCorrecta(PreguntaVoF pregunta){
        pregunta.laCorrectaEsLaFalsa();
    }

    public Respuesta esCalificadaPor(PreguntaVoF pregunta){
        return pregunta.calificar(this);
    }
}
