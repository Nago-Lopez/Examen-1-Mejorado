
package examen1_mejorado_abdenagolopez;

import java.util.Scanner;
import java.util.ArrayList;

public class opciones {
    
    
   static  long [] factura = new long [10]; 
   static  long [] cedula = new long [10]; 
   static String [] nombre = new String [10];
   static float [] localidad = new float [10];      
   static  float [] cantidad = new float [10];  
   static double precioEntrada[]= new double [10];  
   static String [] tipoentrada = new String [10];
   static  float [] servicios = new float [10];   
   static double subtotal[]= new double [10];  
   static double total[]= new double [10];
   static ArrayList<Float> CantSol = new ArrayList<Float>();
   static ArrayList<Float> CantEO = new ArrayList<Float>();
   static ArrayList<Float> CantP = new ArrayList<Float>();
    
   static int indice = 0;
   private static Scanner leer = new Scanner(System.in); 
    



  public static void agregar() {

 char continuar = 'n';
    
    Scanner leer = new Scanner(System.in); 
    
        do {
            
            if (indice > 9) {
                
                System.out.println("Arreglo esta lleno");
                continuar = 'n';
                
                
            } else {
            
            System.out.println("Digite el numero de factura: ");
            factura[indice] = leer.nextLong();     
                
            System.out.println("Digite la cedula del comprador: ");
            cedula[indice] = leer.nextLong();   
                
            System.out.println("Digite el nombre del comprador: ");
            nombre[indice] = leer.next();
            
            System.out.println("Digite el numero de la localidad deseada: \n 1- Sol Norte/Sur 2- Sombra Este/Oeste 3-Preferencial ");
            localidad[indice] = leer.nextFloat();
            
                       
            System.out.println("Digite cantidad de entradas (maximo 4 por comprador)");
            cantidad[indice] = leer.nextFloat();

            } 
            if (localidad[indice] == 1 && cantidad[indice] > 4) 
                 {
                     cantidad[indice] = 4;
                     precioEntrada[indice] = cantidad[indice] * 10500;
                     tipoentrada[indice] = "Sol Norte/Sur";
                     servicios[indice] = cantidad[indice] * 1000;
                     subtotal[indice] = precioEntrada[indice];
                     total[indice] = subtotal[indice] + servicios[indice];
                     
                      for (int i=1; i<=cantidad[indice]; i++){
                          
                      CantSol.add(cantidad[indice]);
                                          
                      }
                
                     
                    } else if (localidad[indice] == 2 && cantidad[indice] > 4)   
                 {
                   cantidad[indice] = 4;
                   precioEntrada[indice] = cantidad[indice] * 20500;
                   tipoentrada[indice] = "Sombra Este/Oeste";
                   servicios[indice] = cantidad[indice] * 1000;
                   subtotal[indice] = precioEntrada[indice];
                   total[indice] = subtotal[indice] + servicios[indice];
                    for (int i=1; i<=cantidad[indice]; i++){
                          
                      CantEO.add(cantidad[indice]);
                                             
                      }
                   
                
                } else if (localidad[indice] == 3 && cantidad[indice] > 4) 
                 {
                    cantidad[indice] = 4;
                    precioEntrada[indice] = cantidad[indice] * 25500;
                    tipoentrada[indice] = "Preferencial";
                    servicios[indice] = cantidad[indice] * 1000;
                    subtotal[indice] = precioEntrada[indice];
                    total[indice] = subtotal[indice] + servicios[indice];
                    
                     for (int i=1; i<=cantidad[indice]; i++){
                          
                      CantP.add(cantidad[indice]);
                                                
                      }
                    
             
            } else if (localidad[indice] == 1 && cantidad[indice] <= 4) 
                 {
                     precioEntrada[indice] = cantidad[indice] * 10500;
                     tipoentrada[indice] = "Sol Norte/Sur";
                     servicios[indice] = cantidad[indice] * 1000;
                     subtotal[indice] = precioEntrada[indice];
                     total[indice] = subtotal[indice] + servicios[indice];
                     for (int i=1; i<=cantidad[indice]; i++){
                          
                      CantSol.add(cantidad[indice]);
                         
                     }
                    
                      
                      
                    } else if (localidad[indice] == 2 && cantidad[indice] <= 4)   
                 {
                   precioEntrada[indice] = cantidad[indice] * 20500;
                   tipoentrada[indice] = "Sombra Este/Oeste";
                   servicios[indice] = cantidad[indice] * 1000;
                   subtotal[indice] = precioEntrada[indice];
                   total[indice] = subtotal[indice] + servicios[indice];
                   
                    for (int i=1; i<=cantidad[indice]; i++){
                          
                      CantEO.add(cantidad[indice]);
                                           
                      }
                
                } else if (localidad[indice] == 3 && cantidad[indice] <= 4) 
                 {
                    precioEntrada[indice] = cantidad[indice] * 25500;
                    tipoentrada[indice] = "Preferencial";
                    servicios[indice] = cantidad[indice] * 1000;
                    subtotal[indice] = precioEntrada[indice];
                    total[indice] = subtotal[indice] + servicios[indice];
                    
                     for (int i=1; i<=cantidad[indice]; i++){
                          
                      CantP.add(cantidad[indice]);
                                             
                      }
                    
            }
            
             indice ++;
            
            System.out.println("Desea ingresar otro comprador (s/n)");
            continuar = leer.next().charAt(0);
            
            } while (continuar!= 'n');  
        
          for (int i = 0; i < nombre.length; i++) {
      if (total[i] != 0) {     
         System.out.println("Numero de Factura: "+ factura[i] + " Cedula: " + cedula[i] + " Nombre: " + nombre[i]+ " Localidad: " + tipoentrada[i] + 
                 " Cantidad de entradas: "+ cantidad[i] +" Subtotal : " + subtotal[i]+ " Cargo por servicios : " + servicios[i]+  
                 " Total a pagar : " + total[i]); 
            }
          }
  }
  
  public static void inicializar() {
        
        for (int i = 0; i < indice ; i++) {
            
factura[i] = 0; 
cedula[i] = 0; 
nombre[i] = "";
localidad[i] = 0;      
cantidad[i] = 0;   
tipoentrada[i] = "";
subtotal[i] = 0;
servicios[i] = 0;  
total[i] = 0;


        }
        
       System.out.println("**Arreglos inicializados**");
       
    }
  
  
  public static void imprimir() {  
    
         System.out.println("Cantidad Entradas Localidad Sol Norte/Sur: "+ CantSol.size() + " Acumulado Dinero Localidad Sol Norte/Sur: " + (CantSol.size()*10500 +CantSol.size()*1000 )+ 
                 " Cantidad Entradas Localidad Sombra Este/Oeste: " + CantEO.size()+ " Acumulado Dinero Localidad Sombra Este/Oeste: " + (CantEO.size()*20500 +CantEO.size()*1000 ) + 
                 " Cantidad Entradas Localidad Preferencial: "+ CantP.size() +" Acumulado Dinero Localidad Preferencial : " + (CantP.size()*25500 +CantP.size()*1000 )); 
      }
  
  
  
  
}/*class*/