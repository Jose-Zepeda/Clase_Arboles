package org.example.ArbolCadena;

import org.example.ArbolBInario.Nodo;

public class ArbolCadenas {
    private NodoCadena raiz;

    public ArbolCadenas() {
        raiz = null;
    }

    public void insertar(String dato){
        if (this.raiz == null){
            this.raiz = new NodoCadena (dato);
        } else {
            this.insertar(this.raiz,dato);
        }
    }

    //inserta un nodo con el valor dato, si esta vacio se crea un nodo
    public void insertar(NodoCadena padre, String dato) {
        if (dato.compareTo(dato) > 0) {
            if (padre.getIzq() == null) {
                padre.setIzq(new NodoCadena(dato));
            } else {
                insertar(padre.getIzq(), dato);
            }
        } else  {
            if (padre.getDer() == null) {
                padre.setDer(new NodoCadena(dato));
            } else {
                insertar(padre.getDer(), dato);
            }
        }
    }

}
