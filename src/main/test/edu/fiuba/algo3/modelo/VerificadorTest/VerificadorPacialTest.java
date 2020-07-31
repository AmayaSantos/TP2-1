package edu.fiuba.algo3.modelo.VerificadorTest;

import edu.fiuba.algo3.modelo.Opciones.Opciones;
import edu.fiuba.algo3.modelo.Verificador.Verificador;
import edu.fiuba.algo3.modelo.Verificador.VerificadorParcial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VerificadorPacialTest {

    @Test
    public void test01VerificadorParcialRecibe2OpcionesUnaSubconjuntoDeLaOtraDevuelveTrue(){
        Verificador verificador = new VerificadorParcial();
        Opciones op1, op2;

        op1 = new Opciones();
        op1.agregarOpcion("1");
        op1.agregarOpcion("2");
        op1.agregarOpcion("3");
        op1.agregarOpcion("4");

        op2 = new Opciones();
        op1.agregarOpcion("4");
        op1.agregarOpcion("3");
        op1.agregarOpcion("2");

        assertTrue(verificador.verificar(op1, op2));
    }

    @Test
    public void test02VerificadorParcialRecibe2OpcionesDistintasDevuelveFalso(){
        Verificador verificador = new VerificadorParcial();
        Opciones op1, op2;

        op1 = new Opciones();
        op1.agregarOpcion("1");
        op1.agregarOpcion("2");
        op1.agregarOpcion("3");
        op1.agregarOpcion("4");

        op2 = new Opciones();
        op2.agregarOpcion("1");
        op2.agregarOpcion("2");
        op2.agregarOpcion("3");
        op2.agregarOpcion("5");

        assertFalse(verificador.verificar(op1, op2));
    }

}
