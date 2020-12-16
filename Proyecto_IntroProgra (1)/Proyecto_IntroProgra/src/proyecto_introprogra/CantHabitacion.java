/*
Se le pedirá al usuario que ingrese la cantidad de habitaciones que desean reservar.
Se imprime la salida que indica el valor ingresado anteriormente.
 */
package proyecto_introprogra;
import javax.swing.JOptionPane;
public class CantHabitacion 
{//ATRIBUTOS
private int CantHabitacion; 
private String PrefHabitacion;
//CONSTRUCTORES
 public CantHabitacion()
 {
 this.CantHabitacion = 0;
 this.PrefHabitacion = "";
 }
 public CantHabitacion(int CantHabitacion, String PrefHabitacion)
 {
 this.CantHabitacion = CantHabitacion; 
 this.PrefHabitacion = PrefHabitacion;
 }
//METODOS
 public int ConsultaHab()
 {
 this.CantHabitacion = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de habitaciones que desea: "));
 return CantHabitacion;
 }
 public void PrefHab()
 {  
 int opcion = 0;
 int pref = 0;
 boolean salir = false;
 for(int i=0;i<this.CantHabitacion;i++)
 {
 do
 {//La preferencia que elija se le mostrara al usuario despues de que digite el numero correcto. 
 pref=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el estilo de habitación que desea para la habitación "+(i+1)
         + ": Matrimonial(1), Singular (2) , Familiar(3) y digite 0 para salir."));
switch (pref)
{
    case 1:
    {
     this.PrefHabitacion=this.PrefHabitacion+" Matrimonial";
     
    }
break;
    case 2:
    {
    this.PrefHabitacion=this.PrefHabitacion+" Singular";
    
    
    }
    break;
    case 3:
    {
    this.PrefHabitacion=this.PrefHabitacion+" Familiar";
    
    
    }
    break;
    case 0:
    {
    JOptionPane.showMessageDialog(null,"Listo su habitación estará lista cuando nos visite.");
    salir=true;
    }
    break;
    default:
    {//En caso de que el usuario digite un numero erroneo como 5 o 20; el sistema le mostrara un mensaje de advertencia.
    JOptionPane.showMessageDialog(null,"Digitó un número erróneo, vuelva a digitarlo");
    
    }
    break;
}

 }while(salir=false);
 }
 JOptionPane.showMessageDialog(null, this.PrefHabitacion);
 }
//METODOS PUBLICOS SET Y GET
    public void setCantHabitacion(int CantHabitacion) 
    {
        this.CantHabitacion = CantHabitacion;
    }

    public int getCantHabitacion() 
    {
        return CantHabitacion;
    }

    public String getPrefHabitacion() 
    {
        return PrefHabitacion;
    }

    public void setPrefHabitacion(String PrefHabitacion) 
    {
        this.PrefHabitacion = PrefHabitacion;
    }
 
}
