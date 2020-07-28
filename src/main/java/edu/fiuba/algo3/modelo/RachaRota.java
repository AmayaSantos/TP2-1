package edu.fiuba.algo3.modelo;

public class RachaRota extends Racha{

    public RachaRota(int respuestasCorrectas){
        this.correctas = respuestasCorrectas;
        incorrectas = 1;
    }

    @Override
    public Racha verificar(Racha racha) {
        return racha.verificar(this);
    }

    @Override
    public Racha verificar(EnRacha racha) {
        return new RachaRota(correctas);
    }

    @Override
    public Racha verificar(RachaRota racha) {
        racha.sumarIncorrecta();
        return racha;
    }


}
