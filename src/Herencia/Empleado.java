
package herencia;

import javax.swing.JOptionPane;

public class Empleado extends Herencia {
private double Salario;

    public Empleado(double Salario, String Nombre, int Edad) {
        super(Nombre, Edad);
        this.Salario = Salario;
    }

    public double getSalario() {
        return Salario;
    }
    
    public void metodoEmpleado (){
    JOptionPane.showMessageDialog(null, "el nombre es" +getNombre()+
                                       "\nsu edad es "+getEdad()+
                                       "\nsu salario es "+getSalario());
    }
    }  


