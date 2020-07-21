package edu.fiuba.algo3.modelo;

public class PreguntaVoF {
    String enunciado;
    Respuesta respuestaCorrecta;
    Respuesta respuestaIncorrecta;

    public PreguntaVoF(String enunciado, Respuesta respuestaCorrecta, Respuesta respuestaIncorrecta){
        this.enunciado = enunciado;
        this.respuestaCorrecta = respuestaCorrecta;
        this.respuestaIncorrecta = respuestaIncorrecta;
    }

    public boolean esCorrecta(Respuesta respuesta) {
        return (respuestaCorrecta.igual(respuesta));
    }
}
