
package main;

import java.util.Scanner;
import logica.Operaciones;

public class Principal {

  
    public static void main(String[] args) {
        int opc;
        double res=01;
        Scanner c=new Scanner(System.in);
        Operaciones objO=new Operaciones();
        
        do{
        System.out.println("¿Que operación quieres realizar?");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Salir");
        opc=c.nextInt();
        
        
        
        switch(opc){
            
            case 1:
                objO.suma();
                
            break;
            
            case 2:
                objO.resta();
            break;
            
            case 3:
                objO.multiplicacion();
            break;
            
            case 4:
                objO.division();
            break;
            
            case 5:
                System.exit(0);
            break;    
            
            default: System.out.println("Opción incorrecta");
        }
        
        do{
        System.out.println("¿Quieres realizar otra operación? 1. Si 2. No");
        opc=c.nextInt();
        
             switch(opc){
                 case 1:
                 opc=1;
             break;
                 case 2:
                 System.exit(0);
                 break;
                 default: System.out.println("Elige otra opción");
             }
        
        }while(opc>1);
        
        }while(opc==1);
    }
    
}
