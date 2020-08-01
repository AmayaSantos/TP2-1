package edu.fiuba.algo3.modelo.OpcionesTest;

import edu.fiuba.algo3.modelo.Opciones.Opcion;
import edu.fiuba.algo3.modelo.Opciones.OpcionCorrecta;
import edu.fiuba.algo3.modelo.Opciones.OpcionIncorrecta;
import edu.fiuba.algo3.modelo.Opciones.Opciones;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class OpcionesTest {
    OpcionCorrecta op1= new OpcionCorrecta("1");
    OpcionCorrecta op2= new OpcionCorrecta("2");
    OpcionCorrecta op3= new OpcionCorrecta("3");
    OpcionIncorrecta op4= new OpcionIncorrecta("4");
    OpcionIncorrecta op5= new OpcionIncorrecta("5");

    @Test
    public void test01OpcionesSonCreadasYAgregoElementos(){
        Opciones opciones = new Opciones();
        opciones.agregar(op1);
        opciones.agregar(op2);
        opciones.agregar(op3);
        opciones.agregar(op4);


        assertTrue(opciones.elementos().contains(op1));
        assertTrue(opciones.elementos().contains(op3));
        assertTrue(opciones.elementos().contains(op2));
        assertTrue(opciones.elementos().contains(op4));
    }

    @Test
    public void test02ComparoOpcionesClasicamenteSinImportarELOrdenDevuelveTrue(){

        Opciones opciones1 = new Opciones();
        opciones1.agregar(op1);
        opciones1.agregar(op2);
        opciones1.agregar(op3);

        Opciones opciones2 = new Opciones();
        opciones2.agregar(op3);
        opciones2.agregar(op1);
        opciones2.agregar(op2);

        assertTrue(opciones1.compararClasicomente(opciones2));
    }

    @Test
    public void test03ComparoOpcionesClasicamenteSinImportarELOrdenDevuelveFalse(){

        Opciones opciones1 = new Opciones();
        opciones1.agregar(op1);
        opciones1.agregar(op1);
        opciones1.agregar(op3);

        Opciones opciones2 = new Opciones();
        opciones2.agregar(op3);
        opciones2.agregar(op2);
        opciones2.agregar(op4);

        assertFalse(opciones1.compararClasicomente(opciones2));
    }

    @Test
    public void test04ComparoOpcionesOrdenadamenteDevuelveFalse(){
        Opciones opciones1 = new Opciones();
        opciones1.agregar(op1);
        opciones1.agregar(op2);
        opciones1.agregar(op3);


        Opciones opciones2 = new Opciones();
        opciones2.agregar(op1);
        opciones2.agregar(op3);
        opciones2.agregar(op2);


        assertFalse(opciones1.compararOrdenadamente(opciones2));
    }

    @Test
    public void test05ComparoOpcionesOrdenadamenteDevuelveFalse(){
        Opciones opciones1 = new Opciones();
        opciones1.agregar(op1);
        opciones1.agregar(op2);
        opciones1.agregar(op3);


        Opciones opciones2 = new Opciones();
        opciones2.agregar(op1);
        opciones2.agregar(op2);
        opciones2.agregar(op3);


        assertTrue(opciones1.compararOrdenadamente(opciones2));
    }

    @Test
    public void test06OpcionesComparoParcialmenteCon2de3Correctas(){
        Opciones opciones1 = new Opciones();
        opciones1.agregar(op1);
        opciones1.agregar(op2);
        opciones1.agregar(op3);

        Opciones opciones2 = new Opciones();
        opciones2.agregar(op2);
        opciones2.agregar(op1);

        assertEquals(2,opciones1.compararParcialmente(opciones2));
    }

    @Test
    public void test07OpcionesComparoParcialmenteConUnaIncorrectaDevuelveFalse(){
        Opciones opciones1 = new Opciones();
        opciones1.agregar(op1);
        opciones1.agregar(op2);
        opciones1.agregar(op3);

        Opciones opciones2 = new Opciones();
        opciones2.agregar(op2);
        opciones2.agregar(op1);
        opciones2.agregar(op4);

        assertEquals(0,opciones1.compararParcialmente(opciones2));
    }

    @Test
    public void test09OpcionesComparaParcialmenteCuandoUnaOpcionesEsParteDeLaOtraPeroConDiferenteOrdenDevuelveTrue(){

    }


}
