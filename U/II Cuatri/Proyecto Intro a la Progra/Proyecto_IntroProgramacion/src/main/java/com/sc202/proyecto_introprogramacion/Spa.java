/*
Se le solicita al usario indicar si desea el servicio de spa del hotel, el día de la reservar, 
la cantidad de personas y el tipo de masaje que quiere recibir.
Se imprime la salida indicando las pautas de la reserve o dando las gracias igualmente por hospedarse en el hotel.
 */
package com.sc202.proyecto_introprogramacion;
import javax.swing.JOptionPane;
public class Spa 
{//ATRIBUTOS
private int ReservaSpa; 
//CONSTRUCTORES
 public Spa()
 {
 this.ReservaSpa = 0;
 }
 public Spa(int ReservaSpa)
 {
 this.ReservaSpa = ReservaSpa; 
 }
//METODOS
 public int PreguntaSpa()
 {
 JOptionPane.showInputDialog(null,"Precio por persona en el Spa: $125 ");
 JOptionPane.showInputDialog(null,"Desea realizar una reservación en el spa?"
         + "Digite un 1 si la respuesta es un si y un 2 si la respuesta es un no");
 
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
    
}
