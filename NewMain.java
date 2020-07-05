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
           int Opci贸n1, Opci贸n2, Opci贸n3;
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

   
ImprimeMen煤1();
ImprimeOpci贸n1();

while (Opci贸n != 2){
switch(Opci贸n1){
	case 1: //Ingresa nuevo cliente
	ImprimeMen煤2();
	ImprimeOpci贸n2();
	while (Opci贸n2 != 3){
	switch(Opci贸n){
		case 1:  //compra a cr茅dito
		Factura = Factura + 1
		ImprimeMen煤3();
		ImprimeOpci贸n3();
		while (Opci贸n != 5){
		switch(Opci贸n){
			case 1: //leche
	            
			System.out.println("驴Cuantas cajas de leche desea llevar?");
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
			case 2: //leche de larga duraci贸n 
			System.out.println("驴Cuantas cajas de leche de larga duraci贸n desea llevar?");
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
			System.out.println("驴Cuantas cajas de yogur desea llevar?");
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
			System.out.println("驴Cuantas cajas de leche desea llevar?");
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
			System.out.println("No v谩lido, intente ingresando otro d铆gito");
			}
			System.out.println("");
			ImprimeMen煤3();
			ImprimeOpci贸n3();
			}
			CantidadLeche1 = CantidadLeche1 + CantidadLeche;
			CantidadLecheLarga1 = CantidadLecheLarga1 + CantidadlecheLarga;
			CantidadYogur1 = CantidadYogur1 + Cantidadyogur;
			CantidadNatilla1 = CantidadNatilla1 + CantidadNatilla;
			System.out.println("Factura N鈥?+Factura+ 鈥淭ipo de venta: Cr茅dito鈥?);
			System.out.println("Leche鈥?       +CantidadLeche+     +CantidadLeche*Leche);
			System.out.println("Leche de larga duraci贸n鈥?	+CantidadLecheLarga);
			System.out.println("Yogur鈥?		+CantidadYogur);
			System.out.println("Natilla鈥?		+CantidadNatilla);
			System.out.println("Importe cr茅dito 2%鈥?		+Credito2");
			System.out.println("IVA 13%鈥?			 +IVA2");
			System.out.println("TOTAL鈥?			            +CostoNeto2");
			}
		case 2: //compra en efectivo
		Factura = Factura + 1
		ImprimeMen煤3();
		ImprimeOpci贸n3();
		while (Opci贸n != 5){
		switch(Opci贸n){
			case 1: //leche
	            
			System.out.println("驴Cuantas cajas de leche desea llevar?");
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
			case 2: //leche de larga duraci贸n 
			System.out.println("驴Cuantas cajas de leche de larga duraci贸n desea llevar?");
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
			System.out.println("Leche de larga duraci贸n "  +Cantidad1+  +CostoBruto1+);
			break;
			case 3: //yogur 
			System.out.println("驴Cuantas cajas de yogur desea llevar?");
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
			System.out.println("驴Cuantas cajas de Natilla desea llevar?");
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
			System.out.println("No v谩lido, intente ingresando otro d铆gito");
			}
			System.out.println("");
			ImprimeMen煤3();
			ImprimeOpci贸n3();
			CantidadLeche1 = CantidadLeche1 + CantidadLeche
			CantidadLecheLarga1 = CantidadLecheLarga1 + CantidadlecheLarga
			CantidadYogur1 = CantidadYogur1 + Cantidadyogur
			CantidadNatilla1 = CantidadNatilla1 + CantidadNatilla
			System.out.println("Factura N鈥?+Factura+ 鈥淭ipo de venta: Cr茅dito鈥?);
			System.out.println("Leche鈥?       +CantidadLeche+     +CantidadLeche*Leche);
			System.out.println("Leche de larga duraci贸n鈥?	+CantidadLecheLarga);
			System.out.println("Yogur鈥?		+CantidadYogur);
			System.out.println("Natilla鈥?		+CantidadNatilla);
			System.out.println("IVA 13%鈥?			 +IVA2");
			System.out.println("TOTAL鈥?			            +CostoNeto2");
			}

		break;
		default:
		System.out.println("No v谩lido, intente ingresando otro d铆gito");
		}
		System.out.println("");
		ImprimeMen煤2();
		ImprimeOpci贸n2();
		}
			CostoBruto3= CostoBruto3 + CostoBruto2
			CostoNeto3= CostoNeto3 + CostoNeto2
			Credito3 =   Credito3 + Credito2

		
			System.out.println("Leche"	+CantidadLeche+ +CantidadLeche*Leche+);
			System.out.println("LecheLarga" +CantidadLecheLarga+   +CantidadLecheLarga*LecheLarga+);
			System.out.println("Yogur"	+CantidadYogur+ +CantidadYogur*Yogur+);
                                    System.out.println("Natilla"	+CantidadNatilla+ +CantidadNatilla*Yogur+);
			System.out.println("Importe cr茅dito 2% 鈥?		 +Credito3");
			System.out.println("TOTAL鈥?		 +CostoNeto3");                                            if (CostoNeto3 <1000001) {  System.out.println("Comisi贸n  " + CostoNeto3*0.03); }  
if (CostoNeto3 >1000000 {  System.out.println("Comisi贸n  " + CostoNeto3*0.04); } 
			}


default:
System.out.println("No v谩lido, intente ingresando otro d铆gito");
}

ImprimeMen煤1();
ImprimeOpci贸n1();
}
System.out.println("Saliendo del programa...");
System.out.println("Gracias por preferirnos.");

}
private static void ImprimeMen煤1(){
System.out.println("BIENVENIDO");
System.out.println("Compa帽铆a distribuidora de productos l谩cteos Rica Leche S.A.鈥?); 
System.out.println("1) Ingresar nuevo cliente");
System.out.println("2) Salir");

}
private static void ImprimeOpci贸n1() throws IOException{
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
Opci贸n1 = Integer.parseInt(entrada.readLine());

}


private static void ImprimeMen煤2(){
System.out.println("Seleccione el tipo de compra que desea鈥?); 
System.out.println("1) Compra al cr茅dito");
System.out.println("1) Compra de contado");
System.out.println("3) Regresar");

}
private static void ImprimeOpci贸n2() throws IOException{
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
Opci贸n2 = Integer.parseInt(entrada.readLine());

}


}
private static void ImprimeMen煤3(){
System.out.println("Ingrese el producto que desea");
System.out.println("1) Leche");
System.out.println("2) Leche de larga duraci贸n");
System.out.println("3) Yogurt");
System.out.println("4) Natilla");
System.out.println("5) Regresar");

}
private static void ImprimeOpci贸n3() throws IOException{
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
Opci贸n3 = Integer.parseInt(entrada.readLine());

}

Public PreguntaCantidad() throws IOException { 
System.out.println("Digite la cantidad de art铆culos que desea comprar");
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
    
    

