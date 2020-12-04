/*
Se le pedirá al usuario que escoja el tipo de habitación en el que se desea alojar.
El usuario digita su preferencia por cada habitación que escogió anteriormente.
Se imprime la informacion.
 */
package com.sc202.proyecto_introprogramacion;
import javax.swing.JOptionPane;
public class PrefHabitacion 
{//ATRIBUTOS
private int PrefHabitacion; 
//CONSTRUCTORES
 public PrefHabitacion()
 {
 this.PrefHabitacion = 0;
 }
 public PrefHabitacion(int CantHabitacion)
 {
 this.PrefHabitacion = PrefHabitacion; 
 }
//METODOS
 public int ConsultaHab()
 {
 JOptionPane.showInputDialog(null,"Digite el estilo de habitación que desea:  "
         + "Matrimonial(1), Singular (2) o Familiar(3): ");
 return PrefHabitacion;
 }
 public void Preferencia()
 {
    if(PrefHabitacion == 1)
    {
        
    }
 }
//METODOS PUBLICOS SET Y GET
    public void setPrefHabitacion(int PrefHabitacion) 
    {
        this.PrefHabitacion = PrefHabitacion;
    }

    public int getPrefHabitacion() 
    {
        return PrefHabitacion;
    }
    
}
