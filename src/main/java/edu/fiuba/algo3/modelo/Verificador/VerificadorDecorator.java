package edu.fiuba.algo3.modelo.Verificador;

import edu.fiuba.algo3.modelo.Opciones.Opciones;

import java.util.List;

public abstract class VerificadorDecorator implements Verificador {

    Verificador verificador;

    @Override
    public boolean verificar(Opciones opcionesCorrectas, Opciones opcioneselegidas){
        return (verificador.verificar(opcionesCorrectas,opcioneselegidas));
    }

}
