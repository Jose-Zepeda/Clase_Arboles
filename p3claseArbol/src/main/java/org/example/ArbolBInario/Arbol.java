package org.example.ArbolBInario;

public class Arbol {
    private Nodo raiz;

    public Arbol() {
        raiz = null;
    }

    public void insertar(int dato){
        if (this.raiz == null){
            this.raiz = new Nodo (dato);
        } else {
            this.insertar(this.raiz,dato);
        }
    }

    //inserta un nodo con el valor dato, si esta vacio se crea un nodo
    public void insertar(Nodo padre, int dato) {
        if (dato < padre.getDato()) {
            if (padre.getIzq() == null) {
                padre.setIzq(new Nodo(dato));
            } else {
                insertar(padre.getIzq(), dato);
            }
        } else if (dato > padre.getDato()) {
            if (padre.getDer() == null) {
                padre.setDer(new Nodo(dato));
            } else {
                insertar(padre.getDer(), dato);
            }
        }
    }

}
