package herencia;

import javax.swing.JOptionPane;

public class Cliente extends Herencia {
private String Direccion;

    public Cliente(String Direccion, String Nombre, int Edad) {
        super(Nombre, Edad);
        this.Direccion = Direccion;
    }

    public String getDireccion() {
        return Direccion;
    }
public void mostrarCliente (){
  JOptionPane.showMessageDialog(null, "el nombre es"+getNombre()+
                                       "\nsu edad es" +getEdad()+
                                       "\nsu direccion es"+getDireccion());
}
}