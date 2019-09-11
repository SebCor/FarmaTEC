
package farmatec;


public class Medicamento {
    
    
    //Atributos de la clase medicamentos
    
     private String Nombre;
     private String Marca;
     private String Descripcion;
     private String Tipo_Medicamento;
     private String Dosis;
     private String Efectos_Secundarios;
     private int Cantidad_Disponible;
     
    // Constructor Vacio______________________________________
    public Medicamento(){
         
    }
     
    
     
    //Metodos de set y get____________________________________
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getTipo_Medicamento() {
        return Tipo_Medicamento;
    }

    public void setTipo_Medicamento(String Tipo_Medicamento) {
        this.Tipo_Medicamento = Tipo_Medicamento;
    }

    public String getDosis() {
        return Dosis;
    }

    public void setDosis(String Dosis) {
        this.Dosis = Dosis;
    }

    public String getEfectos_Secundarios() {
        return Efectos_Secundarios;
    }

    public void setEfectos_Secundarios(String Efectos_Secundarios) {
        this.Efectos_Secundarios = Efectos_Secundarios;
    }    


    public int getCantidad_Disponible() {
        return Cantidad_Disponible;
    }

    public void setCantidad_Disponible(int Cantidad_Disponible) {
        this.Cantidad_Disponible = Cantidad_Disponible;
    }
}


     