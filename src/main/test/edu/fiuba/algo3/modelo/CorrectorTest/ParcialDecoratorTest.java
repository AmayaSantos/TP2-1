package edu.fiuba.algo3.modelo.CorrectorTest;

import edu.fiuba.algo3.modelo.Opciones.Opciones;
import edu.fiuba.algo3.modelo.Corrector.ParcialDecorator;
import edu.fiuba.algo3.modelo.Corrector.Corrector;
import edu.fiuba.algo3.modelo.Corrector.CorrectorDecorator;
import edu.fiuba.algo3.modelo.Corrector.CorrectorParcial;
import edu.fiuba.algo3.modelo.puntaje.Puntaje;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ParcialDecoratorTest {

    @Test
    public void test01ParcialDecoratorConCorrectorParcialSonCorrectasRecibe2OpcionesUnaSubconjuntoDeLaOtraDevuelveTrue(){
        Corrector corrector = new CorrectorParcial();
        CorrectorDecorator parcialDecorator = new ParcialDecorator(corrector);
        Opciones op1, op2;

        op1 = new Opciones();
        op1.agregarOpcion("1");
        op1.agregarOpcion("2");
        op1.agregarOpcion("3");
        op1.agregarOpcion("4");

        op2 = new Opciones();
        op2.agregarOpcion("4");
        op2.agregarOpcion("3");
        op2.agregarOpcion("2");

        assertTrue(parcialDecorator.sonCorrectas(op1, op2));
    }

    @Test
    public void test02ParcialDecoratorConCorrectorParcialSonCorrectasRecibe2OpcionesDiferentesDevuelveFalse(){
        Corrector corrector = new CorrectorParcial();
        CorrectorDecorator parcialDecorator = new ParcialDecorator(corrector);
        Opciones op1, op2;

        op1 = new Opciones();
        op1.agregarOpcion("1");
        op1.agregarOpcion("2");
        op1.agregarOpcion("3");
        op1.agregarOpcion("4");

        op2 = new Opciones();
        op2.agregarOpcion("4");
        op2.agregarOpcion("1");
        op2.agregarOpcion("5");

        assertFalse(parcialDecorator.sonCorrectas(op1, op2));
    }

    @Test
    public void test03ParcialDecoratorConCorrectorParcialCalifica2OpcionesDiferentesDevuelvePuntoNulo(){
        Corrector corrector = new CorrectorParcial();
        CorrectorDecorator parcialDecorator = new ParcialDecorator(corrector);
        Opciones op1, op2;

        op1 = new Opciones();
        op1.agregarOpcion("1");
        op1.agregarOpcion("2");
        op1.agregarOpcion("3");
        op1.agregarOpcion("4");

        op2 = new Opciones();
        op2.agregarOpcion("4");
        op2.agregarOpcion("1");
        op2.agregarOpcion("5");

        Puntaje puntajeObtenido = parcialDecorator.calificar(op1, op2);

        assertEquals(0, puntajeObtenido.valor());
    }

    @Test
    public void test03ParcialDecoratorConCorrectorParcialCalifica2OpcionesCon3CorrectasDevuelvePuntajeConValor3(){
        Corrector corrector = new CorrectorParcial();
        CorrectorDecorator parcialDecorator = new ParcialDecorator(corrector);
        Opciones op1, op2;

        op1 = new Opciones();
        op1.agregarOpcion("1");
        op1.agregarOpcion("2");
        op1.agregarOpcion("3");
        op1.agregarOpcion("4");

        op2 = new Opciones();
        op2.agregarOpcion("3");
        op2.agregarOpcion("1");
        op2.agregarOpcion("2");

        Puntaje puntajeObtenido = parcialDecorator.calificar(op1, op2);

        assertEquals(3, puntajeObtenido.valor());
    }

}
