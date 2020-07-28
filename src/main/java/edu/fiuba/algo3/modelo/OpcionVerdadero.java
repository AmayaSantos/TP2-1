package edu.fiuba.algo3.modelo;

public class OpcionVerdadero extends Opcion{

    public OpcionVerdadero(){

    }

    @Override
    public void esCorrecta(PreguntaVoF pregunta){
        pregunta.laVerdaderaEsLaCorrecta();
    }

    @Override
    public Respuesta esCalificadaPor(PreguntaVoF pregunta) {
        return pregunta.calificar(this);
    }
}
