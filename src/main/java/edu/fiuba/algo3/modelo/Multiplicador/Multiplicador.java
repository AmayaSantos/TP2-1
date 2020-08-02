package edu.fiuba.algo3.modelo.Multiplicador;

import edu.fiuba.algo3.modelo.puntaje.Puntaje;
import edu.fiuba.algo3.modelo.puntaje.Puntos;

public class Multiplicador {
    private int multiploActivo;
    private Multiplo X2;
    private Multiplo X3;
    public Multiplicador(){
        X2= new MultiploUsable();
        X3= new MultiploUsable();
        multiploActivo=1;
    }
    public Puntaje aplicar(Puntaje puntaje){
        Puntaje puntos=puntaje.multiplicar(multiploActivo);
        multiploActivo=1;
        return puntos;
    }

    public void activarMultiplicadorX2() {
        multiploActivo=X2.implementar(2);
        X2=X2.activar(X2);

    }

    public void activarMultiplicadorX3() {
        multiploActivo=X3.implementar(3);
        X3=X3.activar(X3);
    }
}
