/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
             case 1:
             {
             
             }
         break;
             case 2:
             {
             //huesped1.Consulta();
             huesped1.Total();
             }
             break;
             case 3:
             {
             
             
             }
             break;
             case 4: 
             {
             
             
             }
             break;
             case 5:
             {
             
             
             }
             break;
             case 6:
             {
             
             
             }   
             break;
             case 7:
             {
             
             
             }
             break;
             case 8:
             {
             
             
             
             }
             break;
         
         }
    
}while (opcion != 0);
}
    }
