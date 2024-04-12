package Herencia;
public class Persona {
private String nombre;
private String apellido;
private String documento;

    public Persona(String nombre, String apellido, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public static void main(String[] args) {
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
}
