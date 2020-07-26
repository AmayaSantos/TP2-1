package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class RondaParcial  extends Ronda{
    @Override
    public void calificar() {
        for (Seleccion seleccion: selecciones){
            seleccion.calificarParcial();
        }
    }
}