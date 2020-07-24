package edu.fiuba.algo3.modelo;

public class OpcionFalso implements OpcionVoF {
    public Respuesta opcionSeleccionada(PreguntaVoF pregunta){
        return pregunta.opcionFalsa();
    }

    public void esCorrecta(PreguntaVoF pregunta){
        pregunta.laCorrectaEsLaFalsa();
    }
}
