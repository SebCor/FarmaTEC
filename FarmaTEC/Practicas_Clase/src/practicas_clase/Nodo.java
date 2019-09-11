/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas_clase;


public class Nodo {
    
    
    private Object elemento;
    private Nodo next;
    
    public Nodo(){
        this.elemento = null;
        this.next = null ;
    }
    
    public Nodo(Object elemento){
        this.elemento = elemento;
        this.next = null;
    }
    public Nodo(Object elemento, Nodo next) {
        this.elemento = elemento;
        this.next = next;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public Nodo getNext() {
        return this.next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
}
