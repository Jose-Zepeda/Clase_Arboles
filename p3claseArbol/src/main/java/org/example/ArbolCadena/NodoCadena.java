package org.example.ArbolCadena;

import org.example.ArbolBInario.Nodo;

public class NodoCadena {
    protected String dato;
    protected NodoCadena izq;
    protected NodoCadena der;
    public NodoCadena(String dato) {
        this.dato = dato;
        this.izq = null;
        this.der = null;
    }
    public NodoCadena(String dato, NodoCadena izq, NodoCadena der) {
        this.dato = dato;
        this.izq = izq;
        this.der = der;
    }

    //operadores de acceso

    public String getDato() {return dato;}
    public NodoCadena getIzq() {return izq;}

    public NodoCadena getDer() {return der;}

    public void setDato(String dato) {this.dato = dato;}

    public void setIzq(NodoCadena izq) {this.izq = izq;}

    public void setDer(NodoCadena der) {this.der = der;}

    public void Imprimir(){System.out.println(this.getDato());}
}
