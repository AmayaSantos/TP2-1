
package edu.fiuba.algo3.modelo;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
public class PreguntaChioceParcialTest {
    @Test

    public void preguntaChoicePuedeCrearsePasandoRespuestaCorrecta() {
        RespuestaCorrecta respuesta1 = new RespuestaCorrecta("2");
        RespuestaIncorrecta respuesta2 = new RespuestaIncorrecta("1");
        RespuestaIncorrecta respuesta3 = new RespuestaIncorrecta("3");

        PreguntaChoice pregunta = new PreguntaChoice("1 + 1 = ? ");
        pregunta.agregar(respuesta1);
        pregunta.agregar(respuesta2);
        pregunta.agregar(respuesta3);
    }
    @Test
    public void preguntaChoiceRecibeRespuestasAsignaCorrectamentePuntajes01(){

        RespuestaCorrecta respuesta1 = new RespuestaCorrecta("2");
        RespuestaIncorrecta respuesta2 = new RespuestaIncorrecta("1");
        RespuestaIncorrecta respuesta3 =new RespuestaIncorrecta("3");

        PreguntaChoice pregunta = new PreguntaChoice("1 + 1 = ? ");
        pregunta.agregar(respuesta1);
        pregunta.agregar(respuesta2);
        pregunta.agregar(respuesta3);

        Jugador jugador1 = new Jugador("carlos");
        Jugador jugador2 = new Jugador("juan");

        Seleccion eleccionJugador1 = new Seleccion(jugador1);
        Seleccion eleccionJugador2 = new Seleccion(jugador2);

        eleccionJugador1.agregar(respuesta1);
        eleccionJugador1.agregar(respuesta2);

        eleccionJugador2.agregar(respuesta2);
        eleccionJugador2.agregar(respuesta3);


        RondaParcial ronda= new RondaParcial();
        ronda.agregarSeleccion(eleccionJugador1);
        ronda.agregarSeleccion(eleccionJugador2);

        ronda.clasificar();


        assertEquals(0, jugador2.obtenerPuntaje() );
        assertEquals(0, jugador1.obtenerPuntaje() );
    }

    @Test
    public void preguntaChoiceRecibeRespuestasAsignaCorrectamentePuntajes02(){

        RespuestaCorrecta respuesta1 = new RespuestaCorrecta("1");
        RespuestaIncorrecta respuesta2 = new RespuestaIncorrecta("2");
        RespuestaIncorrecta respuesta3 =new RespuestaIncorrecta("3");
        RespuestaCorrecta respuesta4 =new RespuestaCorrecta("-1");

        PreguntaChoice pregunta = new PreguntaChoice("valor de x tal que x^2 = 1 ");
        pregunta.agregar(respuesta1);
        pregunta.agregar(respuesta2);
        pregunta.agregar(respuesta3);
        pregunta.agregar(respuesta4);

        Jugador jugador1 = new Jugador("carlos");
        Jugador jugador2 = new Jugador("juan");

        Seleccion eleccionJugador1 = new Seleccion(jugador1);
        Seleccion eleccionJugador2 = new Seleccion(jugador2);

        eleccionJugador1.agregar(respuesta1);
        eleccionJugador1.agregar(respuesta4);

        eleccionJugador2.agregar(respuesta1);
        eleccionJugador2.agregar(respuesta3);


        RondaParcial ronda= new RondaParcial();
        ronda.agregarSeleccion(eleccionJugador1);
        ronda.agregarSeleccion(eleccionJugador2);

        ronda.clasificar();


        assertEquals(0, jugador2.obtenerPuntaje() );
        assertEquals(2, jugador1.obtenerPuntaje() );
    }




}

