package edu.fiuba.algo3.modelo.Multiplicador;

import edu.fiuba.algo3.modelo.puntaje.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicadorTest {
    PuntoPositivo puntoPositivo = new PuntoPositivo();
    PuntoNegativo puntoNegativo = new PuntoNegativo();
    PuntoNulo puntoNulo = new PuntoNulo();

    @Test
    public void test01CreoUnMultiplicadorYAplico() {
        Multiplicador multi = new Multiplicador();
        multi.activarMultiplicadorX2();
        Puntaje puntaje = multi.aplicar(puntoNegativo);
        assertEquals(puntaje.valor(), -2);

    }

    @Test
    public void test02CreoUnMultiplicadorYAplicoDosVeces() {
        Multiplicador multi = new Multiplicador();
        multi.activarMultiplicadorX2();
        Puntaje puntaje = multi.aplicar(puntoNegativo);
        assertEquals(puntaje.valor(), -2);
        puntaje = multi.aplicar(puntoPositivo);
        assertEquals(puntaje.valor(), 1);
    }

    @Test
    public void test03CreoUnMultiplicadorYAplicoDosVecesTiroError() {
        Multiplicador multi = new Multiplicador();
        multi.activarMultiplicadorX2();
        Puntaje puntaje = multi.aplicar(puntoNegativo);
        assertEquals(puntaje.valor(), -2);
        multi.activarMultiplicadorX2();
        assertEquals( multi.aplicar(puntoNegativo).valor(),-1);
    }
}