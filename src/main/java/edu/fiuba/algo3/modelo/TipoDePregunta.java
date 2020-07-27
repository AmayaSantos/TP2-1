package edu.fiuba.algo3.modelo;

import java.util.List;

public interface TipoDePregunta {
    Respuesta calificar(List<Opcion> opciones);
}
