package edu.fiuba.algo3.modelo.Verificador;

import edu.fiuba.algo3.modelo.Opciones.Opciones;
import edu.fiuba.algo3.modelo.puntaje.Puntaje;
import edu.fiuba.algo3.modelo.puntaje.PuntoNulo;

public class ClasicoDecorator extends VerificadorDecorator{

    public ClasicoDecorator(Verificador verificador){
        super(verificador);
    }

    @Override
    public Puntaje calificar(Opciones opcionesCorrectas, Opciones opcionesElegidas) {
        return new PuntoNulo();
    }
}
