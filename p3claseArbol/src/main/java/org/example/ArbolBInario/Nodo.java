package org.example.ArbolBInario;

public class Nodo {
    protected int dato;
    protected Nodo izq;
    protected Nodo der;
    public Nodo(int dato) {
        this.dato = dato;
        this.izq = null;
        this.der = null;
    }
    public Nodo(int dato, Nodo izq, Nodo der) {
        this.dato = dato;
        this.izq = izq;
        this.der = der;
    }

    //operadores de acceso

    public int getDato() {return dato;}
    public Nodo getIzq() {return izq;}

    public Nodo getDer() {return der;}

    public void setDato(int dato) {this.dato = dato;}

    public void setIzq(Nodo izq) {this.izq = izq;}

    public void setDer(Nodo der) {this.der = der;}

    public void Imprimir(){System.out.println(this.getDato());}
}
