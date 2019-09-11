package farmatec;

public class FarmaTEC {

    public static void main(String[] args) {
        ListaFarmacias tolis = new ListaFarmacias();

        Lista_Medicamentos meds= new Lista_Medicamentos();
        
       
        // Creacion de Farmacias_______________________________________________________
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
        
        
        Farmacia farmacia3 = new Farmacia();
        farmacia3.setNombre("El pericazo");
        farmacia3.setCedula("6-561-165187");
        farmacia3.setUbicacion("Heredia");
        farmacia3.setInfoContacto("5619-4981");
        // Creacion de Farmacias_______________________________________________________
        
        
        
        // Creacion de Medicamentos_____________________________________________________
        Medicamento cocaina = new Medicamento();
        cocaina.setNombre("Cocaina");
        cocaina.setTipo_Medicamento("Estimulante");
        cocaina.setDescripcion("Para que mi mujer se rife con unos bolillitos");
        cocaina.setDosis("3 lineas");
        cocaina.setEfectos_Secundarios("Ansiedad,Ataques cardiacos,Depresion,Sangrado Nasal, Sudor excesivo");
        cocaina.setMarca("Cartel de Medellin");
        
        
        
        Medicamento heroina = new Medicamento();
        heroina.setNombre("Heroina");
        heroina.setTipo_Medicamento("Estimulante");
        heroina.setDescripcion("Para evitar mi triste realidad, no tengo donde vivir");
        heroina.setDosis("1 mg");
        heroina.setEfectos_Secundarios("enrojecimiento cálido de la piel, sequedad bucal y una sensación de pesadez en las extremidades");
        heroina.setMarca("Kevin Rojas.S.A");
        
        
        
        Medicamento lsd = new Medicamento();
        lsd.setNombre("LSD");
        lsd.setTipo_Medicamento("Estimulante");
        lsd.setDescripcion("Para viajar a otra dimension");
        lsd.setDosis("0.20 mg");
        lsd.setEfectos_Secundarios("enrojecimiento cálido de la piel, sequedad bucal y una sensación de pesadez en las extremidades");
        lsd.setMarca("Kevin Rojas.S.A");
        // Creacion de Medicamentos_____________________________________________________
        
        
        
        
        // Las pruebas de las listas Medicamentos y Farmacia----------------------------------------
        
        tolis.append(farmacia1);
        tolis.append(farmacia2);
        tolis.append(farmacia3);
        System.out.println("Lista: " + tolis.toString());
        
        
   
        
        tolis.goToPos(0);
        tolis.remove();
        System.out.println("Lista Modificada: " + tolis.toString());
        
        
        meds.append(lsd);
        meds.append(heroina);
        meds.append(cocaina);
        System.out.println("Lista Medicamentos: " + meds.toString());
        System.out.println(meds.toString());
      
        
        meds.goToPoss(1);
        meds.remove();
        System.out.println("Lista Modificada: " + tolis.toString());
        System.out.println("ACA SEGUIRIA SIN EL ELEMENTO");
        System.out.println(meds.toString());
        System.out.println("________________________________________________________________");
        
     
        
        
        
        
        
    }}