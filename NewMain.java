/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luigi Carepapa
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           int Opción1, Opción2, Opción3;
      int  Cantidad1, Cantidad2, Cantidad3, CostoBruto1, CostoBruto2, CostoBruto3;
       int  CantidadLeche, CantidadLecheLarga, CantidadYogur, CantidadNatilla ;
 int  CantidadLeche1, CantidadLecheLarga1, CantidadYogur1, CantidadNatilla1 ;
   int  Factura;
      float IVA1,  IVA2, IVA3, Importecredito1, Credito2, Credito3, Comision;
      float CostoNeto1, CostoNeto2, CostoNeto3;
 int Leche = 10000  ;
 int LecheLarga = 15000 ;
 int Yogur = 20000  ;
 int Natilla = 25000  ;
 final  double IVA = 1.13 ;
 final  double Credito = 1.02 ;

   
ImprimeMenú1();
ImprimeOpción1();

while (Opción != 2){
switch(Opción1){
	case 1: //Ingresa nuevo cliente
	ImprimeMenú2();
	ImprimeOpción2();
	while (Opción2 != 3){
	switch(Opción){
		case 1:  //compra a crédito
		Factura = Factura + 1
		ImprimeMenú3();
		ImprimeOpción3();
		while (Opción != 5){
		switch(Opción){
			case 1: //leche
	            
			System.out.println("¿Cuantas cajas de leche desea llevar?");
			Cantidad1 = Integer.parseInt(entrada.readLine());
			CostoBruto1 = Leche * Cantidad1
			CostoBruto2= CostoBruto2 + CostoBruto1
			CalculoCredito (CostoBruto1, Credito);
			CalculoIVA(CostoBruto1, IVA);
			CostoNeto1 = CostoBruto1+IVA1+Credito1
			CostoNeto2= CostoNeto2 + CostoNeto1
			CantidadLeche = CantidadLeche + Cantidad1
			Iva2 = IVA2 + IVA1
			Credito2 = Credito2 + Credito1
			Cantidad2= Cantidad2+Cantidad1
			
			
			break;
			case 2: //leche de larga duración 
			System.out.println("¿Cuantas cajas de leche de larga duración desea llevar?");
			Cantidad1 = Integer.parseInt(entrada.readLine());
			CostoBruto1 = Leche * Cantidad1
			CostoBruto2= CostoBruto2 + CostoBruto1
			CalculoCredito (CostoBruto1, Credito);
			CalculoIVA  (CostoBruto1, IVA);
			CostoNeto1 = CostoBruto1+IVA1+Credito1
			CostoNeto2= CostoNeto2 + CostoNeto1
			CantidadLecheLarga = CantidadLecheLarga + Cantidad1
			Iva2 = IVA2 + IVA1
			Credito2 = Credito2 + Credito1
			Cantidad2= Cantidad2+Cantidad1
			Cantidad2= Cantidad2+Cantidad1
			
			break;
			case 3: //yogur 
			System.out.println("¿Cuantas cajas de yogur desea llevar?");
			Cantidad1 = Integer.parseInt(entrada.readLine());
			CostoBruto1 = Leche * Cantidad1
			CostoBruto2= CostoBruto2 + CostoBruto1
			CalculoCredito (CostoBruto1, Credito);
			CalculoIVA(CostoBruto1, IVA);
			CostoNeto1 = CostoBruto1+IVA1+Credito1
			CostoNeto2= CostoNeto2 + CostoNeto1
			CantidadYogur = CantidadYogur + Cantidad1
			 Iva2 = IVA2 + IVA1
			Credito2 = Credito2 + Credito1
			Cantidad2= Cantidad2+Cantidad1
			Cantidad2= Cantidad2+Cantidad1
			
			break;
			case 4: //natilla
			System.out.println("¿Cuantas cajas de leche desea llevar?");
			Cantidad1 = Integer.parseInt(entrada.readLine());
			CostoBruto1 = Leche * Cantidad1
			CostoBruto2= CostoBruto2 + CostoBruto1
			CalculoCredito (CostoBruto1, Credito);
			CalculoIVA(CostoBruto1, IVA);
			CostoNeto1 = CostoBruto1+IVA1+Credito1
			CostoNeto2= CostoNeto2 + CostoNeto1
			CantidadNatilla= CantidadNatilla + Cantidad1
			IVA2 = IVA2 + IVA1
			Credito2 = Credito2 + Credito1
			Cantidad2= Cantidad2+Cantidad1
			Cantidad2= Cantidad2+Cantidad1
			break;
			default:
			System.out.println("No válido, intente ingresando otro dígito");
			}
			System.out.println("");
			ImprimeMenú3();
			ImprimeOpción3();
			}
			CantidadLeche1 = CantidadLeche1 + CantidadLeche;
			CantidadLecheLarga1 = CantidadLecheLarga1 + CantidadlecheLarga;
			CantidadYogur1 = CantidadYogur1 + Cantidadyogur;
			CantidadNatilla1 = CantidadNatilla1 + CantidadNatilla;
			System.out.println("Factura N�?+Factura+ “Tipo de venta: Crédito�?);
			System.out.println("Leche�?       +CantidadLeche+     +CantidadLeche*Leche);
			System.out.println("Leche de larga duración�?	+CantidadLecheLarga);
			System.out.println("Yogur�?		+CantidadYogur);
			System.out.println("Natilla�?		+CantidadNatilla);
			System.out.println("Importe crédito 2%�?		+Credito2");
			System.out.println("IVA 13%�?			 +IVA2");
			System.out.println("TOTAL�?			            +CostoNeto2");
			}
		case 2: //compra en efectivo
		Factura = Factura + 1
		ImprimeMenú3();
		ImprimeOpción3();
		while (Opción != 5){
		switch(Opción){
			case 1: //leche
	            
			System.out.println("¿Cuantas cajas de leche desea llevar?");
			Cantidad1 = Integer.parseInt(entrada.readLine());
			CostoBruto1 = Leche * Cantidad1
			CostoBruto2= CostoBruto2 + CostoBruto1
			CalculoIVA(CostoBruto1, IVA);
			CostoNeto1 = CostoBruto1+IVA1
			CostoNeto2= CostoNeto2 + CostoNeto1
			CantidadLeche = CantidadLeche + Cantidad1
			Iva2 = IVA2 + IVA1
			Cantidad2= Cantidad2+Cantidad1
			System.out.println("Leche"		+Cantidad1+ 		+CostoBruto1+);
			
			break;
			case 2: //leche de larga duración 
			System.out.println("¿Cuantas cajas de leche de larga duración desea llevar?");
			Cantidad1 = Integer.parseInt(entrada.readLine());
			CostoBruto1 = Leche * Cantidad1
			CostoBruto2= CostoBruto2 + CostoBruto1
			CalculoIVA(CostoBruto1, IVA);
			CostoNeto1 = CostoBruto1+IVA1
			CostoNeto2= CostoNeto2 + CostoNeto1
			CantidadLecheLarga = CantidadLecheLarga + Cantidad1
			Iva2 = IVA2 + IVA1
			Cantidad2= Cantidad2+Cantidad1
			Cantidad2= Cantidad2+Cantidad1
			System.out.println("Leche de larga duración "  +Cantidad1+  +CostoBruto1+);
			break;
			case 3: //yogur 
			System.out.println("¿Cuantas cajas de yogur desea llevar?");
			Cantidad1 = Integer.parseInt(entrada.readLine());
			CostoBruto1 = Leche * Cantidad1
			CostoBruto2= CostoBruto2 + CostoBruto1
			CalculoIVA(CostoBruto1, IVA);
			CostoNeto1 = CostoBruto1+IVA1
			CostoNeto2= CostoNeto2 + CostoNeto1
			CantidadYogur= CantidadYogur + Cantidad1
			 Iva2 = IVA2 + IVA1
			Cantidad2= Cantidad2+Cantidad1
			Cantidad2= Cantidad2+Cantidad1
			System.out.println("yogur"		+Cantidad1+ 		+CostoBruto1+);
			break;
			case 4: //natilla
			System.out.println("¿Cuantas cajas de Natilla desea llevar?");
			Cantidad1 = Integer.parseInt(entrada.readLine());
			CostoBruto1 = Natilla * Cantidad1
			CostoBruto2= CostoBruto2 + CostoBruto1
			CalculoIVA(CostoBruto1, IVA);
			CostoNeto1 = CostoBruto1+IVA1
			CostoNeto2= CostoNeto2 + CostoNeto1
			CantidadNatilla= CantidadNatilla + Cantidad1
			Iva2 = IVA2 + IVA1
			Cantidad2= Cantidad2+Cantidad1
			Cantidad2= Cantidad2+Cantidad1
			System.out.println("Leche"		+Cantidad1+ 		+CostoBruto1+);
			break;
			default:
			System.out.println("No válido, intente ingresando otro dígito");
			}
			System.out.println("");
			ImprimeMenú3();
			ImprimeOpción3();
			CantidadLeche1 = CantidadLeche1 + CantidadLeche
			CantidadLecheLarga1 = CantidadLecheLarga1 + CantidadlecheLarga
			CantidadYogur1 = CantidadYogur1 + Cantidadyogur
			CantidadNatilla1 = CantidadNatilla1 + CantidadNatilla
			System.out.println("Factura N�?+Factura+ “Tipo de venta: Crédito�?);
			System.out.println("Leche�?       +CantidadLeche+     +CantidadLeche*Leche);
			System.out.println("Leche de larga duración�?	+CantidadLecheLarga);
			System.out.println("Yogur�?		+CantidadYogur);
			System.out.println("Natilla�?		+CantidadNatilla);
			System.out.println("IVA 13%�?			 +IVA2");
			System.out.println("TOTAL�?			            +CostoNeto2");
			}

		break;
		default:
		System.out.println("No válido, intente ingresando otro dígito");
		}
		System.out.println("");
		ImprimeMenú2();
		ImprimeOpción2();
		}
			CostoBruto3= CostoBruto3 + CostoBruto2
			CostoNeto3= CostoNeto3 + CostoNeto2
			Credito3 =   Credito3 + Credito2

		
			System.out.println("Leche"	+CantidadLeche+ +CantidadLeche*Leche+);
			System.out.println("LecheLarga" +CantidadLecheLarga+   +CantidadLecheLarga*LecheLarga+);
			System.out.println("Yogur"	+CantidadYogur+ +CantidadYogur*Yogur+);
                                    System.out.println("Natilla"	+CantidadNatilla+ +CantidadNatilla*Yogur+);
			System.out.println("Importe crédito 2% �?		 +Credito3");
			System.out.println("TOTAL�?		 +CostoNeto3");                                            if (CostoNeto3 <1000001) {  System.out.println("Comisión  " + CostoNeto3*0.03); }  
if (CostoNeto3 >1000000 {  System.out.println("Comisión  " + CostoNeto3*0.04); } 
			}


default:
System.out.println("No válido, intente ingresando otro dígito");
}

ImprimeMenú1();
ImprimeOpción1();
}
System.out.println("Saliendo del programa...");
System.out.println("Gracias por preferirnos.");

}
private static void ImprimeMenú1(){
System.out.println("BIENVENIDO");
System.out.println("Compañía distribuidora de productos lácteos Rica Leche S.A.�?); 
System.out.println("1) Ingresar nuevo cliente");
System.out.println("2) Salir");

}
private static void ImprimeOpción1() throws IOException{
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
Opción1 = Integer.parseInt(entrada.readLine());

}


private static void ImprimeMenú2(){
System.out.println("Seleccione el tipo de compra que desea�?); 
System.out.println("1) Compra al crédito");
System.out.println("1) Compra de contado");
System.out.println("3) Regresar");

}
private static void ImprimeOpción2() throws IOException{
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
Opción2 = Integer.parseInt(entrada.readLine());

}


}
private static void ImprimeMenú3(){
System.out.println("Ingrese el producto que desea");
System.out.println("1) Leche");
System.out.println("2) Leche de larga duración");
System.out.println("3) Yogurt");
System.out.println("4) Natilla");
System.out.println("5) Regresar");

}
private static void ImprimeOpción3() throws IOException{
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
Opción3 = Integer.parseInt(entrada.readLine());

}

Public PreguntaCantidad() throws IOException { 
System.out.println("Digite la cantidad de artículos que desea comprar");
 BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in)); 
Cantidad1 = Integer.parseInt(br1.readLine()); 
Return  (Cantidad1)
} 

 private static void CalculoIVA (CostoBruto1, IVA) { 
 IVA1 = CostoBruto1 * IVA1;  
} 

 private static void CalculoCredito (CostoBruto1, Credito) { 
Credito1 = IVA1 * Credito; 
 } 

 } 
    
    

