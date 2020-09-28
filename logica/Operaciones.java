
package logica;

import java.util.Scanner;


public class Operaciones {
    
    int a;
    int b;
    double res;
    double res2;
    Scanner c=new Scanner(System.in);
    
    public void suma(){
        System.out.println("Dame tu primer número:");
        a=c.nextInt();
        System.out.println("Dame tu segundo número:");
        b=c.nextInt();
        
        res=a+b;
        System.out.println("El resultado es:"+res);
        
        
    }
    
    public void resta(){
        System.out.println("Dame tu primer número:");
        a=c.nextInt();
        System.out.println("Dame tu segundo número:");
        b=c.nextInt();
        
        res=a-b;
        System.out.println("El resultado es:"+res);
        
    }
    
    public void multiplicacion(){
        System.out.println("Dame tu primer número:");
        a=c.nextInt();
        System.out.println("Dame tu segundo número:");
        b=c.nextInt();
        
        res=a*b;
        System.out.println("El resultado es:"+res);
        
    }
    
    public void division(){
        System.out.println("Dame tu primer número:");
        a=c.nextInt();
        System.out.println("Dame tu segundo número:");
        b=c.nextInt();
        
        res=a/b;
        System.out.println("El resultado es:"+res);
        res2=a%b;
        System.out.println("El residuo es:" +res2);
        
    }
}
