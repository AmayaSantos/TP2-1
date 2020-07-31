package edu.fiuba.algo3.modelo.Corrector;

import edu.fiuba.algo3.modelo.Opciones.Opciones;
import edu.fiuba.algo3.modelo.puntaje.Puntaje;

public abstract class CorrectorDecorator implements Corrector {

    Corrector corrector;

    public CorrectorDecorator(Corrector corrector) {
        this.corrector = corrector;
    }

    @Override
    public boolean sonCorrectas(Opciones opcionesCorrectas, Opciones opcionesElegidas){
        return corrector.sonCorrectas(opcionesCorrectas,opcionesElegidas);
    }

    public abstract Puntaje calificar(Opciones opcionesCorrectas, Opciones opcionesElegidas);

}
