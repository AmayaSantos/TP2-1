package edu.fiuba.algo3.modelo.CorrectorTest;

import edu.fiuba.algo3.modelo.Opciones.Opciones;
import edu.fiuba.algo3.modelo.Corrector.Corrector;
import edu.fiuba.algo3.modelo.Corrector.CorrectorParcial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CorrectorPacialTest {

    @Test
    public void test01CorrectorParcialRecibe2OpcionesUnaSubconjuntoDeLaOtraYDiferenteOrdenDevuelveTrue(){
        Corrector corrector = new CorrectorParcial();
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

        assertTrue(corrector.sonCorrectas(op1, op2));
    }

    @Test
    public void test02CorrectorParcialRecibe2OpcionesDistintasDevuelveFalso(){
        Corrector corrector = new CorrectorParcial();
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

        assertFalse(corrector.sonCorrectas(op1, op2));
    }
}
