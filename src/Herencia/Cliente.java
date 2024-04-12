
package Herencia;


public class Cliente extends Persona {
    private String categoria;
    public Cliente(String nombre,String apellido, String documento, String categoria){
        super(nombre, apellido, documento);
        this.categoria=categoria;
    }
public String mostrarDatos(){
    return getNombre()+"Apellido/n"+getApellido()+"Documento/n"+getDocumento()+"Categoria"+Categoria;
}   
}
