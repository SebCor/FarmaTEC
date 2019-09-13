
package farmatec;
//

public class Nodo {
    
    private Medicamento Data;
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
    
    public Medicamento getData(){
        return this.Data;
        
    }
    
}
