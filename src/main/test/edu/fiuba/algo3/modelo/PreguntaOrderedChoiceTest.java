package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PreguntaOrderedChoiceTest {
    @Test
    public void creoOrderedChoice(){
        RespuestaConOrden respuesta1= new RespuestaConOrden("primero",1);
        RespuestaConOrden respuesta2= new RespuestaConOrden("segundo",2);
        RespuestaConOrden respuesta3= new RespuestaConOrden("Tercero",3);
        RespuestaConOrden respuesta4= new RespuestaConOrden("Cuarto",4);
        RespuestaConOrden respuesta5= new RespuestaConOrden("Quinto",5);
        RespuestaConOrden respuesta6= new RespuestaConOrden("Sexto",6);
        PreguntaOrdered pregunta= new PreguntaOrdered("Ordena");
        pregunta.agregar(respuesta1);
        pregunta.agregar(respuesta2);
        pregunta.agregar(respuesta3);
        pregunta.agregar(respuesta4);
        pregunta.agregar(respuesta5);
        pregunta.agregar(respuesta6);
        pregunta.obtenerOpciones();
        assertEquals(pregunta.obtenerOpciones().contains(respuesta1),true);
        assertEquals(pregunta.obtenerOpciones().contains(respuesta2),true);
        assertEquals(pregunta.obtenerOpciones().contains(respuesta3),true);
        assertEquals(pregunta.obtenerOpciones().contains(respuesta4),true);
        assertEquals(pregunta.obtenerOpciones().contains(respuesta5),true);
        assertEquals(pregunta.obtenerOpciones().contains(respuesta6),true);
    }
    @Test
    public void pueboRondaChoice2Opciones() {
        RespuestaConOrden respuesta1 = new RespuestaConOrden("primero", 1);
        RespuestaConOrden respuesta2 = new RespuestaConOrden("segundo", 2);
       PreguntaOrdered pregunta = new PreguntaOrdered("Ordena");
        pregunta.agregar(respuesta1);
        pregunta.agregar(respuesta2);

        pregunta.obtenerOpciones();
        Jugador jugador1= new Jugador("Tevez");
        Seleccion seleccion1= new Seleccion(jugador1);
        seleccion1.proponer(respuesta1,2);
        seleccion1.proponer(respuesta2,1);

        Jugador jugador2= new Jugador("Pablo");
        Seleccion seleccion2= new Seleccion(jugador2);
        seleccion2.proponer(respuesta1,1);
        seleccion2.proponer(respuesta2,2);
        Ronda ronda=new RondaOrdered();
        ronda.agregarSeleccion(seleccion1);
        ronda.agregarSeleccion(seleccion2);

        ronda.calificar();
        assertEquals(jugador2.obtenerPuntaje(),2);
        assertEquals(jugador1.obtenerPuntaje(),0);
    }
    @Test
    public void pueboRondaChoice6Opciones() {
        RespuestaConOrden respuesta1 = new RespuestaConOrden("primero", 1);
        RespuestaConOrden respuesta2 = new RespuestaConOrden("segundo", 2);
        RespuestaConOrden respuesta3 = new RespuestaConOrden("Tercero", 3);
        RespuestaConOrden respuesta4 = new RespuestaConOrden("Cuarto", 4);
        RespuestaConOrden respuesta5 = new RespuestaConOrden("Quinto", 5);
        RespuestaConOrden respuesta6 = new RespuestaConOrden("Sexto", 6);
        PreguntaOrdered pregunta = new PreguntaOrdered("Ordena");
        pregunta.agregar(respuesta1);
        pregunta.agregar(respuesta2);
        pregunta.agregar(respuesta3);
        pregunta.agregar(respuesta4);
        pregunta.agregar(respuesta5);
        pregunta.agregar(respuesta6);
        pregunta.obtenerOpciones();
        Jugador jugador1= new Jugador("Tevez");
        Seleccion seleccion1= new Seleccion(jugador1);
        seleccion1.proponer(respuesta1,2);
        seleccion1.proponer(respuesta2,1);
        seleccion1.proponer(respuesta3,4);
        seleccion1.proponer(respuesta4,5);
        seleccion1.proponer(respuesta5,6);
        seleccion1.proponer(respuesta6,3);
        Jugador jugador2= new Jugador("Pablo");
        Seleccion seleccion2= new Seleccion(jugador2);
        seleccion2.proponer(respuesta1,1);
        seleccion2.proponer(respuesta2,2);
        seleccion2.proponer(respuesta3,3);
        seleccion2.proponer(respuesta4,4);
        seleccion2.proponer(respuesta5,5);
        seleccion2.proponer(respuesta6,6);
        Ronda ronda=new RondaOrdered();
        ronda.agregarSeleccion(seleccion1);
        ronda.agregarSeleccion(seleccion2);

        ronda.calificar();
        assertEquals(jugador2.obtenerPuntaje(),6);
        assertEquals(jugador1.obtenerPuntaje(),0);
    }
}
