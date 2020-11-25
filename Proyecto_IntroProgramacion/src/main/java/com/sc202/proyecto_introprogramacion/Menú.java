/*
 Universidad Fidelitas                          
Introdución a la Programación
Realizado por: Fiorella Castillo, Josué Murillo y Jose Pablo Rivera
Proyecto final, Sistema de Reservas de un Hotel
Java Club Resort & Spa
2020
 */
package com.sc202.proyecto_introprogramacion;
import javax.swing.JOptionPane;
public class Menú 
{

    public static void main(String[] args) 
    {
         Fechas fecha1 = new Fechas ();
        CantHuespedes huesped1 = new CantHuespedes ();
       int opcion;
       do
       {
         opcion = Integer.parseInt (JOptionPane.showInputDialog(null,
                   "Bienvenido a Java Club Resort & Spa"
                   + "\nMenu de opciones"
                   + "\n1. Check-in."
                   + "\n2. Cantidad de Huespedes."
                   + "\n3. Cantidad de Habitaciones."
                   +"\n4. Preferencia de Habitaciones."
                   +"\n5. Cama Adicional."
                   +"\n6. Reservación Spa."
                   +"\n7. Reservación Restaurante."
                   +"\n8. Reporte Final."
                   + "\n0. Salir."));
         switch (opcion)
         {
    }
    
}
       while (opcion != 0);
}
    }
    

