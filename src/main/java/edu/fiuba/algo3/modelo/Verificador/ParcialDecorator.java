package edu.fiuba.algo3.modelo.Verificador;

import edu.fiuba.algo3.modelo.Opciones.Opciones;
import edu.fiuba.algo3.modelo.puntaje.Puntaje;
import edu.fiuba.algo3.modelo.puntaje.PuntoNulo;

public class ParcialDecorator extends VerificadorDecorator {
    public static PenalizadoDecorator ClasicoDecorator(Verificador verificador){
        return new PenalizadoDecorator();
    }

    public Puntaje calificar(Opciones opcionesCorrectas, Opciones opcionesIncorrectas){
        return new PuntoNulo();
    }
}
