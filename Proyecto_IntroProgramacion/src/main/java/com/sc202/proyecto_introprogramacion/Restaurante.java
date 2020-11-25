/*
 Se le solicita al usuario ingresar el tipo de restaurate que desea reservar en su estadía en el hotel, 
cuántas mesas requiere y el tipo de horario que le gustaría asistir.
Se imprime la reservación para utilizarla cuando llegue al hotel.
 */
package com.sc202.proyecto_introprogramacion;
import javax.swing.JOptionPane;
public class Restaurante 
{//ATRIBUTOS
private int ReservaRest; 
private String dia; 
//CONSTRUCTORES
 public Restaurante()
 {
 this.ReservaRest = 0;
 this.dia = "";
 }
 public Restaurante(int ReservaRest, String dia)
 {
 this.ReservaRest = ReservaRest; 
 this.dia = dia; 
 }
//METODOS
 public int PreguntaRestaurante()
 {
 JOptionPane.showInputDialog(null,"Desea realizar una reservación en el restaurante?"
         + "Digite un 1 si la respuesta es un si y un 2 si la respuesta es no");
 return ReservaRest;
 }
 public String Decision ()
 {
  if (ReservaRest == 1)
  {
    JOptionPane.showInputDialog(null,"Que dia desea reservar un espacio en el restaurante?");
    return dia;
  }    
    return null;
 }
//METODOS PUBLICOS SET Y GET
    public void setReservaRest(int ReservaRest) {
        this.ReservaRest = ReservaRest;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public int getReservaRest() {
        return ReservaRest;
    }

    public String getDia() {
        return dia;
    }
    
}
