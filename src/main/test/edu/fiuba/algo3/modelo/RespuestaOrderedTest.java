package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RespuestaOrderedTest {
    @Test
    public void creoRespuestaOrdenadaPropongoYCalifico(){
        RespuestaConOrden respuesta= new RespuestaConOrden("primero",1);
        RespuestaConOrden respuestaPropuesta= respuesta.proponer(1);
        assertEquals(respuestaPropuesta.calificar(),1);
    }
    @Test
    public void creoRespuestaOrdenadaPropongoYCalifico2(){
        RespuestaConOrden respuesta= new RespuestaConOrden("primero",1);
        RespuestaConOrden respuestaPropuesta=  respuesta.proponer(2);
        assertEquals(respuestaPropuesta.calificar(),0);
    }
}
