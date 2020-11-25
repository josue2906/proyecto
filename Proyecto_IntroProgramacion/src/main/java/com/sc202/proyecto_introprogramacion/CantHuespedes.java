/*
 Se le pedirá al usuario que digite la cantidad de personas que desean hospedarse en el hotel.
Seguidamente, el usuario deberá escribir la edad de cada persona.
Se imprimirán los precios según la edad de cada persona.
 */
package com.sc202.proyecto_introprogramacion;
import javax.swing.JOptionPane;
public class CantHuespedes
{//ATRIBUTOS
private double precio = 190;
private int CantHuespedes; 
//CONSTRUCTORES
 public CantHuespedes()
 {
 this.precio = 190;
 this.CantHuespedes = 0;
 }
 public CantHuespedes(double precio, int CantHuespedes)
 {
 this.precio = precio;
 this.CantHuespedes = CantHuespedes; 
 }
//METODOS
 public int Consulta()
 {
 JOptionPane.showInputDialog(null,"Precio por persona: $190 ");
 JOptionPane.showInputDialog(null,"Digite la cantidad de huéspedes: ");
 return CantHuespedes;
 }
 public double Total()
 {
   double resultado = 0;
   resultado = precio * CantHuespedes;   
   return resultado;  
 }//METODOS PUBLICOS SET Y GET
    public void setPrecio(double precio) 
    {
        this.precio = precio;
    }

    public void setCantHuespedes(int CantHuespedes) 
    {
        this.CantHuespedes = CantHuespedes;
    }

    public double getPrecio() 
    {
        return precio;
    }

    public int getCantHuespedes() 
    {
        return CantHuespedes;
    }
//EXTRAS Y SALIDA
 public void Agregar (String nombre)
 { 
    int extra = Integer.parseInt (JOptionPane.showInputDialog(null,
            nombre+ "\nDigite la cantidad de huespedes EXTRAS que desea agregar: "));
    setCantHuespedes(getCantHuespedes() + extra);
 }
 public void Salida()
 {
    JOptionPane.showMessageDialog(null,"Total: $"+Total());
 }
  
    
}
