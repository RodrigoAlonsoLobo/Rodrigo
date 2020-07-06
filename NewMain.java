/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Luigi Carepapa
 */
public class NewMain {
    public static int Opcion, opcion2, Cantidad, MontoBruto, MontoBruto1,Factura, Pregunta; 
    public static double MontoCredito, MontoIVA;
     public static int LecheC, LecheLargaC, YogurC, NatillaC; 
    static final int Leche = 10000;
    static final int LecheLarga = 15000;
    static final int Yogur = 20000;
    static final int Natilla = 25000;
    static final double Credito = 1.02;
    static final double IVA = 1.13;
    public static void main(String[] args) throws IOException {
ImprimeMenu();
ImprimeOpcion();
++Factura;
while (Opcion != 7){
switch(Opcion){
case 1: //esto sería leche
 RegistroCantidad(Cantidad);
    MontoBruto = Cantidad*Leche;
    System.out.println("Leche" +Cantidad+ +MontoBruto);
    LecheC = LecheC+Cantidad; //este es el contador de Cajas 
    MontoBruto1 = MontoBruto1 + MontoBruto;//esto acumula el monto bruto
break;
case 2://esto sería leche de larga duración
     RegistroCantidad(Cantidad);
    MontoBruto = Cantidad*LecheLarga;
    System.out.println("Leche de larga duracion" +Cantidad+ +MontoBruto);
    LecheLargaC = LecheLargaC+Cantidad; //este es el contador de Cajas 
    MontoBruto1 = MontoBruto1 + MontoBruto;
break;
case 3://esto sería yogur
 RegistroCantidad(Cantidad);
    MontoBruto = Cantidad*Yogur;
    System.out.println("yogur" +Cantidad+ +MontoBruto);
    YogurC = YogurC+Cantidad; //este es el contador de Cajas 
    MontoBruto1 = MontoBruto1 + MontoBruto;//esto acumula el monto bruto
break;
case 4://esto sería natilla
 RegistroCantidad(Cantidad);
    MontoBruto = Cantidad*Natilla;
    System.out.println("Natilla" +Cantidad+ +MontoBruto);
    NatillaC = NatillaC+Cantidad; //este es el contador de Cajas 
    MontoBruto1 = MontoBruto1 + MontoBruto;//esto acumula el monto bruto
break;
case 5:
CalculoCredito (MontoBruto1, Credito);
break;
case 6:
CalculoIVA(MontoBruto1,MontoCredito,Credito);
break;
default:
System.out.println("No valido, intente ingresando otro digito");
}
System.out.println("");
ImprimeMenu();
ImprimeOpcion();
}
  
System.out.println("Factura N"  +Factura+ "Tipo de venta credito");
System.out.println("Leche"      +LecheC+             "₡ "+LecheC*Leche);
System.out.println("Leche"      +LecheLargaC+        "₡ "+LecheLargaC*LecheLarga);
System.out.println("Yogur"      +YogurC+             "₡ "+YogurC*Yogur);
System.out.println("Natilla"     +NatillaC+          "₡ " +NatillaC*Natilla);
System.out.println("Importe Credito 2%                ₡ " +MontoCredito);
System.out.println("IVA 13%                           ₡ " +MontoIVA);
System.out.println("TOTAL                            ₡ " +MontoBruto1+MontoCredito+MontoIVA);


    
    }
   private static void ImprimeMenu(){
System.out.println("Muchas Gracias por acceder al sistema de reparto");
System.out.println("1) Ingresar compra de Leche");
System.out.println("2) Ingresar compra de Leche de larga duracion");
System.out.println("3) Ingresar compra de Yogur");
System.out.println("4) Ingresar compra de Natilla");
System.out.println("5) Calcular el importe de crédito");
System.out.println("6) Calcular IVA");
System.out.println("7) Salir");

}
private static void ImprimeOpcion() throws IOException{
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
Opcion = Integer.parseInt(entrada.readLine());
 }
 
private static void RegistroCantidad( int Cantidad) throws IOException{
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
System.out.println("¿Cuantas Cajas desea ingresar?");
Cantidad = Integer.parseInt(entrada.readLine());

} 
private static void CalculoCredito(int MontoBruto1, double Credito) {
 MontoCredito = (int) (double) (MontoBruto1 * Credito);

 }
private static void CalculoIVA(int MontoBruto1,double MontoCredito, double Credito) {
 MontoIVA = (int) (double) (MontoBruto1 * Credito);

} 

}