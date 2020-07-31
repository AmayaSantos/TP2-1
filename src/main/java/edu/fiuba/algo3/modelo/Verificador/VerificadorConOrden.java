package edu.fiuba.algo3.modelo.Verificador;

import edu.fiuba.algo3.modelo.Opciones.Opciones;

import java.util.List;

public class VerificadorConOrden implements Verificador{

     @Override
     public boolean verificar(Opciones opcionesCorrectas, Opciones opcionesElegidas){
        return opcionesCorrectas.compararConOrden(opcionesElegidas);

     }
}
