package edu.fiuba.algo3.modelo;

public class PreguntaVoF {
    String enunciado;
    RespuestaCorrecta respuestaCorrecta;
    RespuestaIncorrecta respuestaIncorrecta;

    public PreguntaVoF(String enunciado){
        this.enunciado = enunciado;
    }

    public void agregarRespuestaIncorrecta(RespuestaIncorrecta respuestaIncorrecta) {
        this.respuestaIncorrecta = respuestaIncorrecta;
    }

    public void agregarRespuestaCorrecta(RespuestaCorrecta respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public String obtenerRespuestaCorrecta() {
        return respuestaCorrecta.obtenerNombre();
    }
}
