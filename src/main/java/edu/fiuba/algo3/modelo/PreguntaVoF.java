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

    public PreguntaVoF(String enunciado) {
        this.enunciado= enunciado;
        respuestas.put("Verdadero", new RespuestaIncorrecta());
        respuestas.put("Falso", new RespuestaIncorrecta());
    }

    @Override
    public void respuestaCorrecta(String respuesta) {
        respuestas.replace(respuesta, new RespuestaCorrecta());
        //respuestas.remove(respuesta);
        //respuestas.put(respuesta, new RespuestaCorrecta());
    }
}
