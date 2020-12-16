 /*
Se imprime cada uno de los valores mencionados anteriormente y 
se le solicita al usuario verificar si todo está bien.
Además, puede cambiar los valores para mejorar su experiencia y 
la de su familia en el hotel.
 */
package proyecto_introprogra;
import javax.swing.JOptionPane;
public class Reporte 
{//Instancia de las clases anteriores, para utilizar esos datos dentro del reporte final.
  Fechas fecha1 = new Fechas();
  CantHuespedes huesped1 = new CantHuespedes();
  CantHabitacion habitacion1 = new CantHabitacion();
  CantCamas cama1 = new CantCamas();
  Spa spa1 = new Spa();
  Restaurante restaurante1 = new Restaurante();
  public void Salida()
  {//Le muestra al usuario, en ventanas diferentes, los datos de su reservacion.
  JOptionPane.showMessageDialog(null,"El día que usted ingresará al hotel es el: "+fecha1.getCheckIn());
  JOptionPane.showMessageDialog(null,"El día que usted saldrá del hotel es el: "+fecha1.getCheckOut());
  JOptionPane.showMessageDialog(null,"Usted hizo una reserva para "+huesped1.getCantHuespedes()+" personas ");
  if(habitacion1.getCantHabitacion()>1)
  {
  JOptionPane.showMessageDialog(null,"Las habitaciones que usted escogió son: "+habitacion1.getPrefHabitacion());
  }else if(habitacion1.getCantHabitacion()==1)
  {
  JOptionPane.showMessageDialog(null,"La habitación que usted escogió es: "+habitacion1.getPrefHabitacion());
  }
  if (cama1.getCamas()==1)
  {
  
  JOptionPane.showMessageDialog(null,"Usted solicitó "+cama1.getCantidad()+" cama(s) extra por un precio de: $"+cama1.getExtra());
  }
  if(spa1.getReservaSpa()==1)
  {
  JOptionPane.showMessageDialog(null,"Usted reservó el spa para "+spa1.getCantidad()+" personas, para el día "+spa1.getDia());
  
  }
  if(restaurante1.getReservaRest()==1)
  {
 JOptionPane.showMessageDialog(null,"Usted reservó el restaurante para "+restaurante1.getCantidad()+" personas, para el día "+restaurante1.getDia());
  
  } 
  int total=(huesped1.getPrecioAdulto()+huesped1.getPrecioMayor6()+cama1.getExtra()+spa1.getTotal());
  JOptionPane.showMessageDialog(null,"El precio total de su reservación es: $"+total);
  }
}
