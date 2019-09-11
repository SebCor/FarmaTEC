/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas_clase;

/**
 *
 * @author Sebastian
 */
public class Practicas_Clase {

    
    public static void main(String[] args) {
        Lista_Practica test = new Lista_Practica();
        Lista_Practica invertida = new Lista_Practica();
        
        test.append(2);
        test.append(7);
        test.append("F");
        test.append(10);
        test.append(7);
        test.append("Sebas");
        test.append("17");
        
        System.out.println(test.toString());
        System.out.println(test.invert(test));
        
        
        
    }
    
}
