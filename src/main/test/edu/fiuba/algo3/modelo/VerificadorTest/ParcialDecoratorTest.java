package edu.fiuba.algo3.modelo.VerificadorTest;

import edu.fiuba.algo3.modelo.Opciones.Opciones;
import edu.fiuba.algo3.modelo.Verificador.ParcialDecorator;
import edu.fiuba.algo3.modelo.Verificador.Verificador;
import edu.fiuba.algo3.modelo.Verificador.VerificadorDecorator;
import edu.fiuba.algo3.modelo.Verificador.VerificadorParcial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParcialDecoratorTest {

    @Test
    public void test01ParcialDecoratorVerifica2OpcionesIgualesDevuelveTrue(){
        Verificador verificador = new VerificadorParcial();
        VerificadorDecorator parcialDecorator = new ParcialDecorator(verificador);
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

        assertTrue(parcialDecorator.verificar(op1, op2));
    }

    @Test
    public void test02ParcialDecoratorVerifica2OpcionesNoIgualesDevuelveFalse(){
        Verificador verificador = new VerificadorParcial();
        VerificadorDecorator parcialDecorator = new ParcialDecorator(verificador);
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

        assertFalse(parcialDecorator.verificar(op1, op2));
    }

    @Test
    public void test03ParcialDecoratorCalifica2OpcionesNoIgualesDevuelvePuntoNulo(){
        Verificador verificador = new VerificadorParcial();
        VerificadorDecorator parcialDecorator = new ParcialDecorator(verificador);
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

        assertEquals(0, parcialDecorator.calificar(op1, op2).valor());
    }

    @Test
    public void test03ParcialDecoratorCalifica2OpcionesCon3CorrectasDevuelvePuntajeConValor3(){
        Verificador verificador = new VerificadorParcial();
        VerificadorDecorator parcialDecorator = new ParcialDecorator(verificador);
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

        assertEquals(3, parcialDecorator.calificar(op1, op2).valor());
    }

}
