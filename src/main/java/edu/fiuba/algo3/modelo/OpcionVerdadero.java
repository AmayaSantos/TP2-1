package edu.fiuba.algo3.modelo;

public class OpcionVerdadero implements OpcionVoF{
    public Respuesta opcionSeleccionada(PreguntaVoF pregunta){
        return pregunta.opcionVerdadera();
    }

    public void esCorrecta(PreguntaVoF pregunta){
        pregunta.laCorrectaEsLaVerdadera();
    }
}
