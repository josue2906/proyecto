/*
Se le solicita al usuario ingresar el tipo de restaurate que desea reservar en su estadía en el hotel, 
cuántas mesas requiere y el tipo de horario que le gustaría asistir.
Se imprime la reservación para utilizarla cuando llegue al hotel.
 */
package proyecto_introprogra;
import javax.swing.JOptionPane;
public class Restaurante 
{//ATRIBUTOS
private int ReservaRest; 
private String dia; 
private int Cantidad;
//CONSTRUCTORES
 public Restaurante()
 {
 this.ReservaRest = 0;
 this.dia = "";
 this.Cantidad = 0;
 }
 public Restaurante(int ReservaRest, String dia, int Cantidad)
 {
 this.ReservaRest = ReservaRest; 
 this.dia = dia; 
 this.Cantidad = Cantidad;
 }
//METODOS
 public void PreguntaRestaurante()
 {//La pregunta es de tipo int, tanto la opcion de si o no; como la cantidad de personas que asistiran.
 this.ReservaRest=Integer.parseInt(JOptionPane.showInputDialog(null,"Desea realizar una reservación en el restaurante?"
         + "Digite un 1 si la respuesta es un si y un 2 si la respuesta es un no"));
 if (this.ReservaRest==1)
 {
 this.Cantidad=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de personas que asistirán al restaurante"));
 this.dia=JOptionPane.showInputDialog(null,"Digite el día que visitará el restaurante");//Ademas, se le pregunta al usuario que dia desea reservar para mostrarlo en el reporte final.
 }
 }
 
//METODOS PUBLICOS SET Y GET
    public void setReservaRest(int ReservaRest) 
    {
        this.ReservaRest = ReservaRest;
    }

    public void setDia(String dia) 
    {
        this.dia = dia;
    }

    public int getReservaRest() 
    {
        return ReservaRest;
    }

    public String getDia() 
    {
        return dia;
    }

    public int getCantidad() 
    {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) 
    {
        this.Cantidad = Cantidad;
    }
    
}
