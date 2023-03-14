
package examen1_mejorado_abdenagolopez;



import java.util.Scanner;

public class menu {
    
    
    public byte opcion;
    
    public Scanner leer = new Scanner(System.in); 
        
    public  menu() {
    
            
        opcion = 10;
        
        
    }
         public  void mostrar() {
            
        
     do {
        
                
            System.out.println("1.Ingresar datos");
            System.out.println("2.Inicializar arreglos");
            System.out.println("3.Estadisticas");
            System.out.println("4.Salir");
          
            System.out.println("Digite una opcion"); 
                
            opcion  = leer.nextByte();    
          
              switch (opcion) {
                  case 1: opciones.agregar();
                      
                      break;
                      
                      
                   case 2: opciones.inicializar();
                      
                      break;   
                      
                      
                      
                      
                  case 3: opciones.imprimir();
                      
                      break;    
                      
                      
                  case 4:  System.out.println("Saliendo del programa" ); 
                      opciones.imprimir2();
                  
                  
                      break; 
                      
    default:
                      throw new AssertionError();
              }
   
          
            
            
    } while (opcion !=4);
     
        }
     
}
