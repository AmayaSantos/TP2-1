package edu.fiuba.algo3.modelo.Verificador;

import edu.fiuba.algo3.modelo.Opciones.Opciones;
import edu.fiuba.algo3.modelo.puntaje.Puntaje;
import edu.fiuba.algo3.modelo.puntaje.PuntoNulo;

public class PenalizadoDecorator extends VerificadorDecorator{

    public PenalizadoDecorator(Verificador verificador){
        super(verificador);
    }

    @Override
    public Puntaje calificar(Opciones opcionesCorrectas, Opciones opcionesElegidas) {
        //Falta implementar
        return new PuntoNulo();
    }
}
