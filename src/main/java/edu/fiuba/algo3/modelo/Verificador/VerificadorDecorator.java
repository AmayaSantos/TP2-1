package edu.fiuba.algo3.modelo.Verificador;

import edu.fiuba.algo3.modelo.Opciones.Opciones;
import edu.fiuba.algo3.modelo.puntaje.Puntaje;

import java.util.List;

public abstract class VerificadorDecorator implements Verificador {

    Verificador verificador;

    public VerificadorDecorator(Verificador verificador) {
        this.verificador = verificador;
    }

    @Override
    public boolean verificar(Opciones opcionesCorrectas, Opciones opcionesElegidas){
        return verificador.verificar(opcionesCorrectas,opcionesElegidas);
    }

    public abstract Puntaje calificar(Opciones opcionesCorrectas, Opciones opcionesElegidas);

}
