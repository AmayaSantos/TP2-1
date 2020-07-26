package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SelecionTest {
    @Test
    public void creoSelecionOrdenadaYCalificoJugador(){
        Jugador jugador = new Jugador("nombe x");
        Seleccion seleccion=  new Seleccion(jugador);
        RespuestaConOrden respuestaConOrden= new RespuestaConOrden("sad",1);
        seleccion.proponer(respuestaConOrden,1);
        seleccion.calificarOrden();
        assertEquals(jugador.obtenerPuntaje(),1);

    }
    @Test
    public void creoSelecionOrdenadaYCalificoJugador2(){
        Jugador jugador = new Jugador("nombe x");
        Seleccion seleccion=  new Seleccion(jugador);
        RespuestaConOrden respuestaConOrden= new RespuestaConOrden("sad",1);
        seleccion.proponer(respuestaConOrden,2);
        seleccion.calificarOrden();
        assertEquals(jugador.obtenerPuntaje(),0);

    }
}
