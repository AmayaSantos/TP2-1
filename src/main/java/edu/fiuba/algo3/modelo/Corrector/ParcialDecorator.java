package edu.fiuba.algo3.modelo.Corrector;

import edu.fiuba.algo3.modelo.Opciones.Opciones;
import edu.fiuba.algo3.modelo.puntaje.Puntaje;
import edu.fiuba.algo3.modelo.puntaje.PuntoPositivo;
import edu.fiuba.algo3.modelo.puntaje.Puntos;

public class ParcialDecorator extends CorrectorDecorator {

    public ParcialDecorator(Corrector corrector) {
        super(corrector);
    }

    @Override
    public boolean sonCorrectas(Opciones opcionesCorrectas, Opciones opcioneselegidas) {
        return super.sonCorrectas(opcionesCorrectas, opcioneselegidas);
    }

    @Override
    public Puntaje calificar(Opciones opcionesCorrectas, Opciones opcionesElegidas){
        //se puede pones opcionesCorrectas.compararParcialmente(opcionesElegidas)
        //Si quiero verificar de otra forma con lo comentado tendriamos que venir al metodo y
        //cambiarlo, en cambio con this.verificar dicho comportamiento queda encapsulado.
        boolean sonCorrectas = this.sonCorrectas(opcionesCorrectas, opcionesElegidas);
        int cantidadOpcionesElegidas = opcionesElegidas.cantidad();
        Puntaje resultado = new Puntos();

        if (sonCorrectas){
            for (int i = 0; i < cantidadOpcionesElegidas; i++){
                resultado.aniadir(new PuntoPositivo());
            }
        }

        return resultado;
    }
}
