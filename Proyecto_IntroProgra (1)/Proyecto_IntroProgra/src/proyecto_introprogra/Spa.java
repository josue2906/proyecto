/*
Se le solicita al usario indicar si desea el servicio de spa del hotel, el día de la reservar, 
la cantidad de personas y el tipo de masaje que quiere recibir.
Se imprime la salida indicando las pautas de la reserve o dando las gracias igualmente por hospedarse en el hotel.
 */
package proyecto_introprogra;
import javax.swing.JOptionPane;
public class Spa 
{//ATRIBUTOS
private int ReservaSpa; 
private String Dia;
private int Cantidad;
private int Total;
//CONSTRUCTORES
 public Spa()
 {
 this.ReservaSpa = 0;
 this.Dia="";
 this.Cantidad= 0;
 this.Total= 0;
 }
 public Spa(int ReservaSpa, String Dia, int Cantidad, int Total)
 {
 this.ReservaSpa = ReservaSpa; 
 this.Dia=Dia;
 this.Cantidad=Cantidad;
 this.Total=Total;
 }
//METODOS
 public int PreguntaSpa()
 {//La pregunta es de tipo int, tanto la opcion de si o no; como la cantidad de personas que asistiran.
 JOptionPane.showMessageDialog(null,"Precio por persona en el Spa: $125 ");
 this.ReservaSpa=Integer.parseInt(JOptionPane.showInputDialog(null,"Desea realizar una reservación en el spa?"
         + "Digite un 1 si la respuesta es un si y un 2 si la respuesta es un no"));
 if (this.ReservaSpa==1)
 {
 this.Cantidad=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de personas que asistirán al spa"));
 this.Dia=JOptionPane.showInputDialog(null,"Digite el día que visitará el spa");//Ademas, se le pregunta al usuario que dia desea reservar para mostrarlo en el reporte final.
 this.Total= this.Cantidad*125;//la cantidad de personas se multiplican por el precio establecido anteriormente. 
 }
 return ReservaSpa;
 }
//METODOS PUBLICOS SET Y GET
    public void setReservaSpa(int ReservaSpa) 
    {
        this.ReservaSpa = ReservaSpa;
    }

    public int getReservaSpa() 
    {
        return ReservaSpa;
    }

    public String getDia() 
    {
        return Dia;
    }

    public void setDia(String Dia) 
    {
        this.Dia = Dia;
    }

    public int getCantidad() 
    {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) 
    {
        this.Cantidad = Cantidad;
    }

    public int getTotal() 
    {
        return Total;
    }

    public void setTotal(int Total) 
    {
        this.Total = Total;
    }
 
}
