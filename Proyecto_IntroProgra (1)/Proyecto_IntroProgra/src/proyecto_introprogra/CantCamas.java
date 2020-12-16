/*
Se le solicita al usuario indicar cuántas serían las camas que desea tener en su(s) habitación/habitaciones.
 */
package proyecto_introprogra;
import javax.swing.JOptionPane;
public class CantCamas 
{//ATRIBUTOS
private int Camas; 
private int Extra;
private int Cantidad;
//CONSTRUCTORES
 public CantCamas()
 {
 this.Camas = 0;
 this.Extra= 0;
 this.Cantidad=0;
 }
 public CantCamas(int Camas, int Extra, int Cantidad)
 {
 this.Camas = Camas; 
 this.Extra=Extra;
 this.Cantidad=Cantidad;
 }
//METODOS
 public int PreguntaCama()
 {//Si el usuario desea una cama extra, se le hara un cargo de $25 a su reserva final.
 JOptionPane.showMessageDialog(null,"Precio de una cama extra: $25 ");
 this.Camas=Integer.parseInt(JOptionPane.showInputDialog(null,"Desea agregar una cama extra a su habitación?, "
         + "Digite un 1 si la respuesta es un si y un 2 si la respuesta es un no"));
 return this.Camas;
 }
public void CantExtra()
{
    if(this.Camas == 1)
    {
    int CamaExtra = 25;
    int extra = 0;
    this.Cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantas camas desea agregar?")); 
    this.Extra = CamaExtra*this.Cantidad;
    }
}
public double TotalCama()
{
    double totalCama = 0;
    return totalCama;
}
//METODOS PUBLICOS SET Y GET
    public void setCamas(int Camas) 
    {
        this.Camas = Camas;
    }

    public int getCamas() 
    {
        return Camas;
    }

    public int getExtra() 
    {
        return Extra;
    }

    public void setExtra(int Extra) 
    {
        this.Extra = Extra;
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
