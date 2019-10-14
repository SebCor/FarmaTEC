/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tec.plane;


public class ListaVuelos {
    
     public class Nodo{
            
            Vuelos data;
            Nodo next;

            public Nodo(){
                next=null;
                data= null;
            }

            public Nodo(Vuelos num){
                this.data= num;
                
            }
  
            public void setData(Vuelos num){
                this.data= num;
            } 
            
            public Vuelos getData(){
                return this.data;
            }
            public Nodo getNext() {
			return this.next;
		}
        }
        
        
        private Nodo head;
        private Nodo tail;
        private Nodo current;
        private int size;
        
        
        
        public int getsize(){
            return this.size;
        }
  
        
        
        /**
         * 
         * @param num es l vuelo que desea insertar a la lista de vuelos
         */
        public void insertar(Vuelos num){
            Nodo temp = new Nodo(num);
            if (head == null){
                head= temp;
                tail= temp;
                size++;
            }
            else{
                tail.next= temp;
                tail= temp;
                size++;
            } 
        }
        
        /**
         * 
         * @param num el vuelo que se desea encontrar
         * @return 
         */
        public boolean encontrar(Vuelos num){
            Nodo temp = this.head;
            
            while(temp != null){
         
                
                if(temp.getData() == num){
                    //System.out.println(temp.getData());
                    return true;   
                }
                else{
                    temp=temp.getNext();
                }
            }
            return false;
           
        }
        
        
        
     @Override
    public String toString() {
            Nodo currentNode = this.head.getNext();

            StringBuffer result = new StringBuffer();

    for (int i = 0; currentNode != null; i++) 
            {
            if (i > 0) 
                    {
                    result.append(",");
            }
            Vuelos element = currentNode.getData();

            result.append(element == null ? "" : element);
            currentNode = currentNode.getNext();
    }
    return result.toString();
    }
        
        
        
    
}
