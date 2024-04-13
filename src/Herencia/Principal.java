
package herencia;
import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args) {
     String menu = JOptionPane.showInputDialog("Seleccione una Opcion \n"+
                                             "1.Agregar Empleado \n"+
                                             "2.Agregar Cliente \n"+
                                             "3.Salir del Programa \n");
 int opciones = Integer.parseInt(menu);
 switch (opciones){
     case 1:
     String nombreEmp = JOptionPane.showInputDialog("Ingrese el nombre del empleado");
     int edadEmpleado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del empleado"));
     double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado"));
     Empleado emp= new Empleado (salario, nombreEmp,  edadEmpleado); 
     emp.metodoEmpleado();
     break;
    case 2:
     String nombreEmp2 = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
     int edadEmpleado2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del cliente")); 
     String direccion =JOptionPane.showInputDialog("Ingrese su direcion: ");
     Cliente cliente1 = new Cliente (direccion, nombreEmp2,edadEmpleado2);
     cliente1.mostrarCliente();
     break;
    case 3:
     break;
 }
    }
}
    


