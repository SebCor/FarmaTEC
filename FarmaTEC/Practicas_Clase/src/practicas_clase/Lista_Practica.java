/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas_clase;


public class Lista_Practica {
    
    Nodo head;
    Nodo current;
    Nodo tail;
    int position;
    int size;
    Nodo top;
    Nodo tempo;
    
    public Lista_Practica(){
        this.head = new Nodo();
        this.current = this.head;
        this.tail = this.head;
        this.size = 0;
        this.position = -1;
    }
    
    public Lista_Practica(Lista_Practica lista){
        
    }
    
     public void append(Object elemento){
        Nodo newelement = new Nodo (elemento);
        this.tail.setNext(newelement);
        this.tail = newelement;
        this.size++;
    }
     
     
     
      
     
      
      public Lista_Practica invert(Lista_Practica test){
          
          Lista_Practica invertida = new Lista_Practica();
          
          while(test != null){
              invertida.append(this.tail.getElemento());
              
              
              
          }
        return invertida;   
      }
      
      
      
      
      public Object pop(){
		if (this.top == null) {
			System.out.println("Stack is empty");
			return null;
		}
		Object tempo = this.top.getElemento();
		this.top = this.top.getNext();
		this.size--;
		return tempo;
	}
     
     
     
    
    
     
     public void insert(Object elemento) {
		//insertar en cualquier posiciÃ³n
		Nodo newNode = new Nodo(elemento, this.current.getNext());
		this.current.setNext(newNode);
		//necesario si se está insertando al final de la lista
		if (this.current == this.tail) {
			this.tail = tail.getNext();
		}
		this.size++;
     
     
     } 
    
    public String toString() {
		Nodo currentNode = this.head.getNext();
		
		StringBuffer result = new StringBuffer();
        
        for (int i = 0; currentNode != null; i++) 
		{
        	if (i > 0) 
			{
        		result.append(",");
        	}
        	Object element = currentNode.getElemento();
			
        	result.append(element == null ? "" : element);
        	currentNode = currentNode.getNext();
        }
        return result.toString();
	}
 
     
     
     
}
