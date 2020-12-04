/*
 Se le pedirá al usuario que digite la cantidad de personas que desean hospedarse en el hotel.
Seguidamente, el usuario deberá escribir la edad de cada persona.
Se imprimirán los precios según la edad de cada persona.
 */
package com.sc202.proyecto_introprogramacion;
import javax.swing.JOptionPane;
public class CantHuespedes
{//ATRIBUTOS
private double precioAdulto = 190;
private double precioMayor6= 145;
private double precioMenor6= 0;
private int CantHuespedes; 
//CONSTRUCTORES
 public CantHuespedes()
 {
 this.precioAdulto = 190;
 this.precioMayor6=145;
 this.precioMenor6=0;
 this.CantHuespedes = 0;
 }
 public CantHuespedes(double precioAdulto,double precioMayor6, double PrecioMenor6, int CantHuespedes)
 {
 
 this.CantHuespedes = CantHuespedes; 
 }
//METODOS

 public double Total()
 {
   double resultado = 0;
   resultado = (this.precioAdulto+this.precioMayor6+0);  
   JOptionPane.showMessageDialog(null,"El costo total de la estancia (sin extras, hasta el momento) es de: $"+resultado);
   return resultado;  
 }//METODOS PUBLICOS SET Y GET

    public double getPrecioAdulto() 
    {
        return precioAdulto;
    }

    public void setPrecioAdulto(double precioAdulto) 
    {
        this.precioAdulto = precioAdulto;
    }

    public double getPrecioMayor6() 
    {
        return precioMayor6;
    }

    public void setPrecioMayor6(double precioMayor6) 
    {
        this.precioMayor6 = precioMayor6;
    }

    public double getPrecioMenor6() 
    {
        return precioMenor6;
    }

    public void setPrecioMenor6(double precioMenor6) 
    {
        this.precioMenor6 = precioMenor6;
    }

    public int getCantHuespedes() 
    {
        return CantHuespedes;
    }

    public void setCantHuespedes(int CantHuespedes) 
    {
        this.CantHuespedes = CantHuespedes;
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
