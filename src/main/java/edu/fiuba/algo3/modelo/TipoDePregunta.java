package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public interface TipoDePregunta {
    Respuesta calificar(ArrayList<Opcion> opciones);
}
