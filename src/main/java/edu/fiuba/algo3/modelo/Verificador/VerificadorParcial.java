package edu.fiuba.algo3.modelo.Verificador;

import edu.fiuba.algo3.modelo.Opciones.Opciones;
import edu.fiuba.algo3.modelo.Verificador.Verificador;

public class VerificadorParcial implements Verificador {

    @Override
    public boolean verificar(Opciones opcionesCorrectas, Opciones opcionesElegidas) {
        return opcionesCorrectas.compararParcialmente(opcionesElegidas);
    }

}
