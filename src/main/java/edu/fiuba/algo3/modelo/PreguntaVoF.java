package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class PreguntaVoF extends Pregunta {

    public PreguntaVoF(String enunciado, RespuestaIncorrecta respuestaIncorrecta, RespuestaCorrecta respuestaCorrecta) {
        this.enunciado= enunciado;
        this.respuestasCorrectas=new ArrayList<>();
        this.respuestasIncorrectas=new ArrayList<>();
        this.respuestasIncorrectas.add(respuestaIncorrecta);
        this.respuestasCorrectas.add(respuestaCorrecta);
    }
    public PreguntaVoF(String enunciado, RespuestaCorrecta respuestaCorrecta, RespuestaIncorrecta respuestaIncorrecta) {
        this.enunciado= enunciado;
        this.respuestasCorrectas=new ArrayList<>();
        this.respuestasIncorrectas=new ArrayList<>();
        this.respuestasIncorrectas.add(respuestaIncorrecta);
        this.respuestasCorrectas.add(respuestaCorrecta);
    }
}
