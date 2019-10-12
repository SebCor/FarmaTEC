/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tec.plane;


public class TECPlane {


    public static void main(String[] args) {
        
        
        User Pedro = new User();
        User Alex = new User();
        User Maria = new User();
        User Carla = new User();
        User Carlos = new User();
        
        CheckIn cola = new CheckIn();
        CheckIn prioridad = new CheckIn();
        
        
        
        Pedro.setDestiny("Portugal");
        Pedro.setFechaNacimiento("10-09-17");
        Pedro.setNacionalidad("Costarricense");
        Pedro.setNombre("Pedro");
        Pedro.setOrigin("Costa Rica");
        Pedro.setPlanLealtad("Ingreso Especial");
        Pedro.setPasaporte(1717171);
        
        
        
        
        Alex.setDestiny("Alemania");
        Alex.setFechaNacimiento("18-09-18");
        Alex.setNacionalidad("Costarricense");
        Alex.setNombre("Alex");
        Alex.setOrigin("Costa Rica");
        Alex.setPlanLealtad("Oro");
        Alex.setPasaporte(1919182);
        
        
       
        Maria.setDestiny("Francia");
        Maria.setFechaNacimiento("11-10-00");
        Maria.setNacionalidad("Costarricense");
        Maria.setNombre("Maria");
        Maria.setOrigin("Costa Rica");
        Maria.setPlanLealtad("Platino");
        Maria.setPasaporte(726789);
        
        
        
        Carla.setDestiny("Belgica");
        Carla.setFechaNacimiento("12-08-00");
        Carla.setNacionalidad("Costarricense");
        Carla.setNombre("Carla");
        Carla.setOrigin("Costa Rica");
        Carla.setPlanLealtad("Economico");
        Carla.setPasaporte(17718);
        
      
        Carlos.setDestiny("Belgica");
        Carlos.setFechaNacimiento("12-08-00");
        Carlos.setNacionalidad("Costarricense");
        Carlos.setNombre("Carlos");
        Carlos.setOrigin("Costa Rica");
        Carlos.setPlanLealtad("Oro");
        Carlos.setPasaporte(17718);
        
        
        /// INSERT DATOS A LA COLA NORMAL
        
        
        System.out.println();
        System.out.println("***********Ingreso Inicial a la cola**********");
        System.out.println();
        
        // EN ESTE ORDEN DE PLAN ESTAN INGRESANDO A LA COLA NORMAL
        cola.agregaracola(Carla); // Economico
        cola.agregaracola(Carlos);  //Oro
        cola.agregaracola(Alex);   // Oro            // Carla,Carlos,Alex,Maria,Pedro
        cola.agregaracola(Maria); // Platino
        cola.agregaracola(Pedro);  //Especial
        
        System.out.println(cola.toString());
        
        System.out.println();
        System.out.println("***********PRIORIDAD**********");
        System.out.println();
        
        System.out.println(cola.prioridad_cola(cola, prioridad).toString());
        
        
        
       
        
        
        
        
        
        
        
        
    }
    
}
