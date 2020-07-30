package edu.fiuba.algo3.modelo.puntaje;

import java.util.ArrayList;
import java.util.List;

public class Puntos implements Puntaje {
    List<Puntaje> listaDePuntos = new ArrayList<Puntaje>();

    @Override
    public void añadir(Puntaje puntaje){
        listaDePuntos.add(puntaje);
    }

    public int valor(){
        int valor = 0;
        for(Puntaje puntaje: listaDePuntos) {
            valor += puntaje.valor();
        }
        return valor;
    }

}
