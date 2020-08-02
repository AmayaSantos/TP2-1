package edu.fiuba.algo3.modelo.puntaje;

public interface Puntaje {

    void aniadir(Puntaje puntaje);

    int valor();

    default Puntaje multiplicar(int multiplo){
        Puntos puntos= new Puntos();
        for (int j = 0; j < multiplo; j++){
            puntos.aniadir(this);
        }
        return puntos;
    };
}
