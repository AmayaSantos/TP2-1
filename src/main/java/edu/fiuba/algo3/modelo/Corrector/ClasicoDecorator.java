package edu.fiuba.algo3.modelo.Corrector;

import edu.fiuba.algo3.modelo.Opciones.Opciones;
import edu.fiuba.algo3.modelo.puntaje.Puntaje;
import edu.fiuba.algo3.modelo.puntaje.PuntoNulo;

public class ClasicoDecorator extends CorrectorDecorator {

    public ClasicoDecorator(Corrector corrector){
        super(corrector);
    }

    @Override
    public Puntaje calificar(Opciones opcionesCorrectas, Opciones opcionesElegidas) {
        //Falta implementar
        return new PuntoNulo();
    }
}
