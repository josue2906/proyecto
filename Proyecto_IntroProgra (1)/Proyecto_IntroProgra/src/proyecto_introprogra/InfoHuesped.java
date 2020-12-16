/*
Esta clase almacena la informacion personal de cada huesped.
Su nombre, Edad y Numero de Cedula.
 */
package proyecto_introprogra;
import javax.swing.JOptionPane;
public class InfoHuesped 
{//ATRIBUTOS
 public String nombre;
 public int edad;
 public String cedula;
 //CONSTRUCTOR
 public InfoHuesped(String nombre, int edad, String cedula)
 {
 this.nombre = nombre;
 this.edad = edad;
 this.cedula = cedula;
    
}
}
