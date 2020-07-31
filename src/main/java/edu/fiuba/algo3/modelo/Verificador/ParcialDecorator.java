package edu.fiuba.algo3.modelo.Verificador;

import edu.fiuba.algo3.modelo.Opciones.Opciones;
import edu.fiuba.algo3.modelo.puntaje.Puntaje;
import edu.fiuba.algo3.modelo.puntaje.PuntoNulo;
import edu.fiuba.algo3.modelo.puntaje.PuntoPositivo;
import edu.fiuba.algo3.modelo.puntaje.Puntos;

public class ParcialDecorator extends VerificadorDecorator {

    public ParcialDecorator(Verificador verificador) {
        super(verificador);
    }

    @Override
    public boolean verificar(Opciones opcionesCorrectas, Opciones opcioneselegidas) {
        return super.verificar(opcionesCorrectas, opcioneselegidas);
    }

    @Override
    public Puntaje calificar(Opciones opcionesCorrectas, Opciones opcionesElegidas){
        //se puede pones opcionesCorrectas.compararParcialmente(opcionesElegidas)
        //Si quiero verificar de otra forma con lo comentado tendriamos que venir al metodo y
        //cambiarlo, en cambio con this.verificar dicho comportamiento queda encapsulado.
        boolean sonCorrectas = this.verificar(opcionesCorrectas, opcionesElegidas);
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
