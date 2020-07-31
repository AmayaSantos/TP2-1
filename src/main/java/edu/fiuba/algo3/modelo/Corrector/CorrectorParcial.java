package edu.fiuba.algo3.modelo.Corrector;

import edu.fiuba.algo3.modelo.Opciones.Opciones;

public class CorrectorParcial implements Corrector {

    @Override
    public boolean sonCorrectas(Opciones opcionesCorrectas, Opciones opcionesElegidas) {
        return opcionesCorrectas.compararParcialmente(opcionesElegidas);
    }

}
