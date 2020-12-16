/*
Universidad Fidelitas                          
Introdución a la Programación
Realizado por: Fiorella Castillo, Josué Murillo y Jose Pablo Rivera
Proyecto final, Sistema de Reservas de un Hotel
Java Club Resort & Spa
2020
 */
package proyecto_introprogra;
import javax.swing.JOptionPane;
public class Proyecto_IntroProgra  
{
    public static void main(String[] args) 
    {
        /*Fechas fecha1 = new Fechas();
        CantHuespedes huesped1 = new CantHuespedes();
        CantHabitacion habitacion1 = new CantHabitacion();
        CantCamas cama1 = new CantCamas();
        Spa spa1 = new Spa();
        Restaurante restaurante1 = new Restaurante();*/
        Reporte reporte1 = new Reporte();
        
     
       int opcion;
       do
       {
         opcion = Integer.parseInt (JOptionPane.showInputDialog(null,
                   "Bienvenido a Java Club Resort & Spa"
                   + "\nMenu de opciones"
                   + "\n1. Inicie su reserva."
                   + "\n0. Salir."));
         switch (opcion)
         {
              case 1:
             {//Guardo los datos de todas las clases en la clase de reporte. Utilizando el mismo objeto.
            reporte1.fecha1.CheckIn();
            reporte1.fecha1.CheckOut();
            reporte1.huesped1.ConsultaAdulto();
            reporte1.huesped1.ConsultaMayor6();
            reporte1.huesped1.ConsultaMenor6();
            reporte1.habitacion1.ConsultaHab();
            reporte1.habitacion1.PrefHab();
            reporte1.cama1.PreguntaCama();
            reporte1.cama1.CantExtra();
            reporte1.cama1.TotalCama();
            reporte1.spa1.PreguntaSpa();
            reporte1.restaurante1.PreguntaRestaurante();
            reporte1.Salida();
             }
         break; 
         }
    
    
}while (opcion != 0);//Mensaje de agradecimiento
JOptionPane.showMessageDialog(null,"Gracias por visitar nuestra página");     
}
    }
    

