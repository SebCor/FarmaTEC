
package farmatec;

public class ListaFarmacias {
    
    
    public class Nodo {
    
    private Farmacia farm;
    private Nodo next;
    
    public Nodo(){
        this.farm = null;
        this.next = null ;
    }
    
    public Nodo(Object farm){
        this.farm = (Farmacia) farm;
        this.next = null;
    }
    public Nodo(Object farm, Nodo next) {
        this.farm = (Farmacia) farm;
        this.next = next;
    }

    public Object getElemento() {
        return farm;
    }

    public void setElemento(Object farm) {
        this.farm = (Farmacia) farm;
    }

    public Nodo getNext() {
        return this.next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
    
    
}

 
    Nodo head;
    Nodo current;
    Nodo tail;
    int position;
    int size;
    
 
    public ListaFarmacias(){
        this.head = new Nodo();
        this.current = this.head;
        this.tail = this.head;
        this.size = 0;
        this.position = -1;
    }
    //
    public ListaFarmacias(ListaFarmacias lista){
    }
    
    public void append(Object farmacia){
        Nodo nuevaFarmacia = new Nodo (farmacia);
        this.tail.setNext(nuevaFarmacia);
        this.tail = nuevaFarmacia;
        this.size++;
    }
    
    public void remove(){
        if (this.head == this.current && this.current == this.tail){
            System.out.println("Lista vacia");
            
        }    
        if(this.size == 0){
            System.out.print("Esta vacia la lista");
        }
        Nodo temp = head;
        while (temp.getNext() != this.current.getNext()) {
            temp = temp.getNext();                
        } 

        temp.setNext(this.current.getNext());
        if (this.current == this.tail) {
            this.current = this.tail = temp;
            this.position--;
        }
        else
            this.current = this.current.getNext();
        System.out.println("Llego al final");
        this.size--;
        }   
        
    
    public void insert(Lista_Medicamentos lista) {
		//insertar en cualquier posiciÃ³n
		Nodo newNode = new Nodo(lista, this.current.getNext());
		this.current.setNext(newNode);
		//necesario si se está insertando al final de la lista
		if (this.current == this.tail) {
			this.tail = tail.getNext();
		}
		this.size++;
    }
    
    
    
    
    public Object getElement(){
		return this.current.getElemento();
	}	
	
	public int getSize() {
		return this.size;
	}
	
	public boolean next() {
		if (this.current == this.tail) {
			System.out.println("Actualmente en último nodo, no se puede avanzar");
			return false;
		}
		this.current = this.current.getNext();
		this.position++;
		return true;
	}
	
	public boolean previous() {
		if (this.current == this.head) {
			System.out.println("Actualmente en primer nodo, no se puede retroceder");
			return false;
		}
		Nodo temp = head;
		this.position = -1;
		while (temp.getNext() != this.current) {
			temp = temp.getNext();
			this.position++;
		}
		this.current = temp;
		return true;
	}
	
	public int getPosition() {
		return this.position;	
	}
	
	public void goToStart(){
		this.current = this.head;
		this.position = -1;
	}            
     
        
    public void goToPos(int pos) {
		if (pos < 0 || pos >= this.size) {
			System.out.println("Posición inválida");
			return;
		}
		if (pos > this.position) {
			while (pos > this.position) {
				this.next();
			}
		} else if (pos < this.position) {
			while (pos < this.position) {
				this.previous();
			}
		}
    }

    @Override
    public String toString() {
         Nodo currentNode;
         currentNode = this.head.getNext();

         StringBuffer result = new StringBuffer();

          for (int i = 0; currentNode != null; i++) {
                if (i > 0) {
                    result.append(",");
                }
                Farmacia element = (Farmacia) currentNode.getElemento();		
                result.append(element == null ? "" : element.getNombre());
                currentNode = currentNode.getNext();
           }
           return result.toString();
    } 
    
    
    
    public String toSTR() {
         Nodo currentNode;
         currentNode = this.head.getNext();

         StringBuffer result = new StringBuffer();

          for (int i = 0; currentNode != null; i++) {
                if (i > 0) {
                    result.append(",");
                }
                Object element = (Object) currentNode.getElemento();		
                result.append(element == null ? "" : element);
                currentNode = currentNode.getNext();
           }
           return result.toString();
           
           
    }
           
           
           
     public void gotoName(String nombre){
         this.current = this.head;
         this.current= this.current.getNext();
         if (this.current == this.tail){
             System.out.println("Ultimo Nodo");
         }
         
         while (current != null){
             if (nombre.equals(current.farm.getNombre())){
                 System.out.print("AK7");
                 break;
             }else{
                 this.current=this.current.getNext();
             }
     }
           
           
           
           
    } 
    
    
    
    
    
    
}   
        
    
    
   

