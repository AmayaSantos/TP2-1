package edu.fiuba.algo3.modelo.Jugador;

import edu.fiuba.algo3.modelo.puntaje.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JugadorTest {
    @Test
    public void creoJugadorYObtengoSuPuntaje() {
        Jugador jugador = new Jugador("carlos");
        Puntaje puntaje = jugador.obtenerPuntaje();
        assertEquals(puntaje.valor(), 0);
    }
    @Test
    public void jugadorRecibePuntoPositivo(){
        Puntaje puntos= new PuntoPositivo();
        Jugador jugador = new Jugador("carlos");
        jugador.agregarPuntaje(puntos);
        Puntaje puntaje = jugador.obtenerPuntaje();
        assertEquals(puntaje.valor(), 1);
    }
    @Test
    public void jugadorRecibePuntoNulo(){
        Puntaje puntos= new PuntoNulo();
        Jugador jugador = new Jugador("carlos");
        jugador.agregarPuntaje(puntos);
        Puntaje puntaje = jugador.obtenerPuntaje();
        assertEquals(puntaje.valor(), 0);
    }
    @Test
    public void jugadorRecibePuntosNegativos(){
        Puntaje puntos= new PuntoNegativo();
        Jugador jugador = new Jugador("carlos");
        jugador.agregarPuntaje(puntos);
        Puntaje puntaje = jugador.obtenerPuntaje();
        assertEquals(puntaje.valor(), -1);
    }

    @Test
    public void jugadorRecibePuntajePusitivo(){
        Puntaje puntoPositivo= new PuntoPositivo();
        Puntaje puntaje= new Puntos();
        puntaje.aniadir(puntoPositivo);
        puntaje.aniadir(puntoPositivo);
        Jugador jugador = new Jugador("carlos");
        jugador.agregarPuntaje(puntaje);
        Puntaje puntaje1 = jugador.obtenerPuntaje();
        assertEquals(puntaje1.valor(), 2);
    }
}

