package edu.fiuba.algo3.modelo.Opciones;
import java.util.*;

public class Opciones {
    private Collection<Opcion> elementosCorrectos = new ArrayList<>();
    private Collection<Opcion> elementosIncorrectos = new ArrayList<>();
    public Collection<Opcion> elementos(){
        Collection elementos= new ArrayList<>();
        elementos.addAll(elementosCorrectos);
        elementos.addAll(elementosIncorrectos);
        return elementos;
    }
    public void agregar(OpcionCorrecta elemento){
        elementosCorrectos.add(elemento);
    }
    public void agregar(OpcionIncorrecta elemento){
        elementosIncorrectos.add(elemento);
    }
    public int compararParcialmente(Opciones otraOpciones){
        int cantidad=otraOpciones.elementosCorrectos.size();
        if (!otraOpciones.elementosIncorrectos.isEmpty()){
            cantidad=0;
        }
        return cantidad;
    }
    public boolean compararClasicomente(Opciones otraOpciones){
        if (otraOpciones.elementosIncorrectos.isEmpty()){
            return otraOpciones.elementosCorrectos.containsAll(this.elementosCorrectos);
        }else {return false;}
    }
    public boolean compararOrdenadamente(Opciones otraOpciones){
       return this.elementosCorrectos.equals(otraOpciones.elementosCorrectos);

    }
    public int compararPositivamente(Opciones otraOpciones){
        return otraOpciones.elementosCorrectos.size();
    }
    public int compararNegativamente(Opciones otraOpciones){

        return otraOpciones.elementosIncorrectos.size();
    }
}
