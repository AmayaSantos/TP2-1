package edu.fiuba.algo3.modelo.Opciones;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class Opciones {
    private Collection<OpcionCorrecta> elementosCorrectos = new ArrayList<OpcionCorrecta>();
    private Collection<OpcionIncorrecta> elementosIncorrectos = new ArrayList<OpcionIncorrecta>();


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

        return this.elementosCorrectos.containsAll(otraOpciones.elementos());
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
