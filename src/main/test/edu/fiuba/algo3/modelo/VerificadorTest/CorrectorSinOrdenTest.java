package edu.fiuba.algo3.modelo.VerificadorTest;

import edu.fiuba.algo3.modelo.Opciones.Opciones;
import edu.fiuba.algo3.modelo.Verificador.Corrector;
import edu.fiuba.algo3.modelo.Verificador.CorrectorSinOrden;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CorrectorSinOrdenTest {

    @Test
    public void test01CorrectorSinOrdenRecibe2OpcionesUnaEsSubconjuntoDeLaOtraYDevuelveFalse(){
        Corrector corrector = new CorrectorSinOrden();
        Opciones op1, op2;

        op1 = new Opciones();
        op1.agregarOpcion("1");
        op1.agregarOpcion("2");
        op1.agregarOpcion("3");
        op1.agregarOpcion("4");

        op2 = new Opciones();
        op2.agregarOpcion("3");

        assertFalse(corrector.sonCorrectas(op1, op2));
    }

    @Test
    public void test02CorrectorSinOrdenRecibe2OpcionesIgualesYMismoOrdenDevuelveTrue(){
        Corrector corrector = new CorrectorSinOrden();
        Opciones op1, op2;

        op1 = new Opciones();
        op1.agregarOpcion("1");
        op1.agregarOpcion("2");

        op2 = new Opciones();
        op2.agregarOpcion("1");
        op2.agregarOpcion("2");

        assertTrue(corrector.sonCorrectas(op1, op2));
    }

    @Test
    public void test03CorrectorSinOrdenRecibe2OpcionesIgualesYDiferenteOrdenDevuelveTrue(){
        Corrector corrector = new CorrectorSinOrden();
        Opciones op1, op2;

        op1 = new Opciones();
        op1.agregarOpcion("1");
        op1.agregarOpcion("2");

        op2 = new Opciones();
        op2.agregarOpcion("1");
        op2.agregarOpcion("2");

        assertTrue(corrector.sonCorrectas(op1, op2));
    }

}
