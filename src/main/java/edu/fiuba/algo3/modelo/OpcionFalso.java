package edu.fiuba.algo3.modelo;

public class OpcionFalso extends Opcion {

    public OpcionFalso() {
    }

    @Override
    public void esCorrecta(PreguntaVoF pregunta){
        pregunta.laFalsaEsLaCorrecta();
    }

    @Override
    public Respuesta esCalificadaPor(PreguntaVoF pregunta) {
        return pregunta.calificar(this);
    }
}
