package edu.fiuba.algo3.modelo.Verificador;

import edu.fiuba.algo3.modelo.Opciones.Opciones;

public class CorrectorConOrden implements Corrector {

     @Override
     public boolean sonCorrectas(Opciones opcionesCorrectas, Opciones opcionesElegidas){
        return opcionesCorrectas.compararConOrden(opcionesElegidas);
     }
}
