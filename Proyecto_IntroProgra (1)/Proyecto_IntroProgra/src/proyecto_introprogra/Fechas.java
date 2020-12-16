/*
Dentro de esta clase, el usuario podrá digitar el día que desea reservar.
Además, podrá digitar el día que sale del hotel.
El sistema le mostrará los horarios de check-in al igual que los de check-out.
 */
package proyecto_introprogra;
import javax.swing.JOptionPane;
public class Fechas 
{//ATRIBUTOS
private String CheckIn;
private String CheckOut;
//CONSTRUCTORES
 public Fechas()
 {
 this.CheckIn = "";
 this.CheckOut = "";
 }
 public Fechas(String CheckIn, String CheckOut)
 {
 this.CheckIn = CheckIn;
 this.CheckOut = CheckOut; 
 }
//METODOS
 public String CheckIn()
 {
 this.CheckIn = JOptionPane.showInputDialog(null,"Digite la fecha de Check-in: ");
 return CheckIn;
 }
 public String CheckOut()
 {
 this.CheckOut = JOptionPane.showInputDialog(null,"Digite la fecha de Check-out: ");
 return CheckOut;
 }
//METODOS PUBLICOS SET Y GET
 public String getCheckIn() 
 {
 return CheckIn;
 }

 public String getCheckOut() 
 {
 return CheckOut;
 }
 
 public void setCheckIn(String CheckIn) 
 {
 this.CheckIn = CheckIn;
 }

 public void setCheckOut(String CheckOut) 
 {
 this.CheckOut = CheckOut;
 }


}
