/*
 Se le solicita al usuario indicar cuántas serían las camas que desea tener en su(s) habitación/habitaciones.
 */
package com.sc202.proyecto_introprogramacion;
import javax.swing.JOptionPane;
public class CantCamas
{//ATRIBUTOS
private int Camas; 
//CONSTRUCTORES
 public CantCamas()
 {
 this.Camas = 0;
 }
 public CantCamas(int Camas)
 {
 this.Camas = Camas; 
 }
//METODOS
 public int PreguntaCama()
 {
 JOptionPane.showInputDialog(null,"Precio de una cama extra: $100 ");
 JOptionPane.showInputDialog(null,"Desea agregar una cama extra a su habitación?, "
         + "Digite un 1 si la respuesta es un si y un 2 si la respuesta es un no");
 return Camas;
 }
public void CantExtra()
{
    if(Camas == 1)
    {
    int CamaExtra = 100;
    int extra = 0;
    JOptionPane.showInputDialog(null,"Cuantas camas desea agregar?");   
    }
}
public double TotalCama()
{
    double totalCama = 0;
    return totalCama;
}
//METODOS PUBLICOS SET Y GET
    public void setCamas(int Camas) {
        this.Camas = Camas;
    }

    public int getCamas() {
        return Camas;
    }
      
}
