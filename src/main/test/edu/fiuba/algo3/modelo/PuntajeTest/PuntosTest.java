package edu.fiuba.algo3.modelo.PuntajeTest;

import edu.fiuba.algo3.modelo.puntaje.PuntoNegativo;
import edu.fiuba.algo3.modelo.puntaje.PuntoNulo;
import edu.fiuba.algo3.modelo.puntaje.PuntoPositivo;
import edu.fiuba.algo3.modelo.puntaje.Puntos;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PuntosTest {

    @Test
    public void Test01PuntosSeAgregaPuntoPositivosYdevuelveElValorEsperado(){
        Puntos puntos = new Puntos();
        puntos.añadir(new PuntoPositivo());
        assertEquals(puntos.valor(),1);
    }

    @Test
    public void Test02PuntosSeAgregaPuntoNegativoYdevuelveElValorEsperado(){
        Puntos puntos = new Puntos();
        puntos.añadir(new PuntoNegativo());
        assertEquals(puntos.valor(),-1);
    }
    @Test
    public void Test03PuntosSeAgregaPuntoNuloYdevuelveElValorEsperado(){
        Puntos puntos = new Puntos();
        puntos.añadir(new PuntoNulo());
        assertEquals(puntos.valor(),0);
    }

    @Test
    public void Test04PuntosSeAgregaPuntosDiferentesYdevuelveElValorEsperado(){
        Puntos puntos = new Puntos();
        puntos.añadir(new PuntoPositivo());
        puntos.añadir(new PuntoPositivo());
        puntos.añadir(new PuntoNulo());
        puntos.añadir(new PuntoPositivo());
        puntos.añadir(new PuntoNegativo());
        puntos.añadir(new PuntoNulo());
        assertEquals(puntos.valor(),2);
    }
    @Test
    public void Test05PuntosSeAgregaPuntosDiferentesYdevuelveElValorEsperado(){
        Puntos puntos = new Puntos();
        puntos.añadir(new PuntoPositivo());
        puntos.añadir(new PuntoPositivo());
        puntos.añadir(new PuntoNulo());
        puntos.añadir(new PuntoPositivo());
        puntos.añadir(new PuntoNegativo());
        puntos.añadir(new PuntoNegativo());
        puntos.añadir(new PuntoNegativo());
        puntos.añadir(new PuntoNegativo());
        puntos.añadir(new PuntoNegativo());
        puntos.añadir(new PuntoNulo());
        assertEquals(puntos.valor(),-2);
    }


}
