/*
Se le pedirá al usuario que digite la cantidad de personas que desean hospedarse en el hotel.
Seguidamente, el usuario deberá escribir la edad de cada persona.
Se imprimirán los precios según la edad de cada persona.
 */
package proyecto_introprogra;
import javax.swing.JOptionPane;
public class CantHuespedes 
{//ATRIBUTOS
private int precioAdulto = 0;
private int precioMayor6 = 0;
private int precioMenor6 =0;
private int CantHuespedes; 
//CONSTRUCTORES
 public CantHuespedes()
 {
 this.precioAdulto = 0;
 this.precioMayor6 = 0;
 this.precioMenor6 = 0;
 this.CantHuespedes = 0;
 }
 public CantHuespedes(int precioAdulto,int precioMayor6, int PrecioMenor6, int CantHuespedes)
 {
 
 this.CantHuespedes = CantHuespedes; 
 this.precioAdulto = precioAdulto;
 this.precioMayor6 = precioMayor6;
 this.precioMenor6 = precioMenor6;
 }
//METODOS
 public void ConsultaAdulto()
 {//Primera ventana que le pide al usuario la cantidad de personas adultas que desean reservar.
 JOptionPane.showMessageDialog(null,"Precio por persona: \nPrecio por adulto $190 "+
"\nPrecio por niño MAYOR a 6 años: $145"+"\n Precio por niño MENOR a 6 años: $0" );
 int opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de huéspedes adultos: "));
 CantHuespedes += opcion;//Va sumando la cantidad de huespedes ingresados por el usuario.
 //INSTANCIA ARREGLO DE OBJETOS 
InfoHuesped infoAdulto[] = new InfoHuesped[opcion];
for(int i=0; i<infoAdulto.length;i++)
{
String nombre = JOptionPane.showInputDialog(null,"Digite el nombre del huésped adulto "+(i+1));
int edad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del huésped adulto: "+(i+1)));
String cedula = JOptionPane.showInputDialog(null,"Digite la cédula del huésped adulto "+(i+1));
infoAdulto[i] = new InfoHuesped(nombre, edad, cedula);
}
for (int i=0; i<infoAdulto.length;i++)
{//Salida que le muestra al usuario la informacion previamente digitada.
JOptionPane.showMessageDialog(null,"El huésped adulto "+(i+1)+" se llama "+infoAdulto[i].nombre
                              +" tiene "+infoAdulto[i].edad+" años y su cédula es "+infoAdulto[i].cedula);

}
this.precioAdulto = 190*opcion;
 }
 public void ConsultaMayor6()
 {//Segunda ventana que le pide al usuario la cantidad de niños mayores a 6 años que desean reservar.
 int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de huéspedes MAYORES a 6 años: "));
 CantHuespedes += opcion;//Va sumando la cantidad de huespedes ingresados por el usuario.
 InfoHuesped infoMayor6[]= new InfoHuesped[opcion];
 for(int i=0; i<infoMayor6.length;i++)
{
String nombre = JOptionPane.showInputDialog(null,"Digite el nombre del huésped MAYOR a 6 años: "+(i+1));
int edad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del huésped MAYOR a 6 años: "+(i+1)));
String cedula = JOptionPane.showInputDialog(null,"Digite la cédula del huésped MAYOR a 6 años: "+(i+1));
infoMayor6[i] = new InfoHuesped(nombre, edad, cedula);

}
for(int i=0; i<infoMayor6.length;i++)
 {//Salida que le muestra al usuario la informacion previamente digitada.
 JOptionPane.showMessageDialog(null,"El huésped MAYOR a 6 años "+(i+1)+" se llama "+infoMayor6[i].nombre
                               +" tiene "+infoMayor6[i].edad+" años y su cédula es "+infoMayor6[i].cedula);
 }
 this.precioMayor6 = 145*opcion;
 }
 public void ConsultaMenor6()
 {//Tercera ventana que le pide al usuario la cantidad de niños menores a 6 años que desean reservar.
 int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de huéspedes MENORES a 6 años: "));
 CantHuespedes += opcion;//Va sumando la cantidad de huespedes ingresados por el usuario.
 InfoHuesped infoMenor6[] = new InfoHuesped[opcion];
 for(int i=0; i<infoMenor6.length;i++)
{
String nombre=JOptionPane.showInputDialog(null,"Digite el nombre del huésped MENOR a 6 años: "+(i+1));
int edad= Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del huésped MENOR a 6 años: "+(i+1)));
String cedula=JOptionPane.showInputDialog(null,"Digite la cédula del huésped MENOR a 6 años:"+(i+1));
infoMenor6[i]= new InfoHuesped(nombre, edad, cedula);

} 
for(int i=0; i<infoMenor6.length;i++)
 {//Salida que le muestra al usuario la informacion previamente digitada.
 JOptionPane.showMessageDialog(null,"El huésped MENOR a 6 años "+(i+1)+" se llama "+infoMenor6[i].nombre
                               +" tiene "+infoMenor6[i].edad+" años y su cédula es "+infoMenor6[i].cedula);
 }
this.precioMenor6 = 0;
 }
//METODOS PUBLICOS SET Y GET.
    public int getPrecioAdulto() 
    {
        return precioAdulto;
    }

    public void setPrecioAdulto(int precioAdulto) 
    {
        this.precioAdulto = precioAdulto;
    }

    public int getPrecioMayor6() 
    {
        return precioMayor6;
    }

    public void setPrecioMayor6(int precioMayor6) 
    {
        this.precioMayor6 = precioMayor6;
    }

    public int getPrecioMenor6() 
    {
        return precioMenor6;
    }

    public void setPrecioMenor6(int precioMenor6) 
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
   
}
