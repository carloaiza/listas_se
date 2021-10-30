package com.umanizales.lists_prog2.model.listase;

import com.umanizales.lists_prog2.model.Boy;
import lombok.Data;

@Data
public class Node {
    private Boy data;
    private Node next;

    /**
     * Constructor para crear un node de lista simplemente enlazada
     * exige el niño como entrada pues no puedo tener un nodo vacío
     * No se inicialiaza el siguiente por que cuando se crea un nodo el siguiente apunta a
     * null
     * @param data Parametro en el cual se obtienen todos los datos del niño
     */
    public Node(Boy data) {
        this.data = data;
    }
}
