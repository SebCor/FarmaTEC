package farmatec;

public class FarmaTEC {

    public static void main(String[] args) {
        
        
       
      
        
     
 

        
        
        //Pruebas finales de la funcion 2
        
        
        //Constructores
        
        Lista_Medicamentos meds= new Lista_Medicamentos();
        ListaFarmacias list1 = new ListaFarmacias();
        
        Farmacia farmacia1 = new Farmacia();
        farmacia1.setNombre("Bolillitos");
        farmacia1.setCedula("3-516-135895");
        farmacia1.setUbicacion("San Marcos");
        farmacia1.setInfoContacto("6151-6354");
        
        
        Farmacia farmacia2 = new Farmacia();
        farmacia2.setNombre("La bomba");
        farmacia2.setCedula("6-561-165187");
        farmacia2.setUbicacion("Cartaguito");
        farmacia2.setInfoContacto("5619-4981");
        

        
        
        
        //2 medicamentos____________________________________
        Medicamento paracetamol = new Medicamento();
        paracetamol.setNombre("Paracetamol");
        Medicamento cocaina = new Medicamento();
        cocaina.setNombre("Cocaina");
        cocaina.setCantidad_Disponible(3);
        //2 medicamentos____________________________________
        
        //Meto medicamentos a la lista de medicamentos
        meds.append(paracetamol);
        meds.append(cocaina);   // cada append le suma 1 a lacantidad disponible de medicamentos (aun falta arreglar eso un toque ask me why)
        
        System.err.println(meds.toString());
        System.err.println("UN CUATRO PORFA: " + cocaina.getCantidad_Disponible());
        // Hice eso solo para testear lo del append la funcion verdadera esta abajo
        
        
        
        
        
        
        ///FUNCION 2:
        
        // Meto dos farmacias a la lista de farmacias
        list1.append(farmacia2);
        list1.append(farmacia1);
       
        
        // Busco el nombre de la farmacia en la lista de farmacias
        list1.gotoName("Bolillitos");
        
        Farmacia f1 =(Farmacia)list1.getElement();
        Lista_Medicamentos lb = f1.listameds;      // aca se mete una lista dentro de la otra
        lb.append(cocaina);  // le meto medicamentos a la lista que meti dentro de la lista de farmacias ==  [[medicamento,medicamento]]
        lb.append(paracetamol);
       
        // Printeo la lista con su nombre y medicamentos 
        System.err.println(f1.getNombre()+ ": " + lb.toString());
        
        
        
        
        
        
        
        
        
    }
}