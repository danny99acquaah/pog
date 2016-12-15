/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estarazinone;

/**
 *
 * @author studente
 */
import java.util.Arrays;
import java.util.Random;
public class Fabrica_dei_numeri {
   private int a[]=new int[100];
    
   public void generandom(){
       for (int i = 0; i < 100; i++) {
           a[i] = (int)(Math.random() * 100);
       }
   }
   
   
 
    public void stamparray(){
        
        for (int i = 0; i < 100; i++) {
            System.out.print(a[i]);   
        }
    }
    public void numeromax(){
        
        int d=0;
        for (int i = 0; i < 100; i++) {
            if (a[i]>d) {
                d = a[i];
            }
        }
    System.out.println("Il valore massimo e': " + d);
    }
   public void numeromin(){
       
        int f=a[0];
        for (int i = 0; i < 100; i++) {
            if (f>a[i]) {
                f = a[i];
            }
   }
       System.out.println("IL valore minimo e':"+f);
   }
   
   public void numeromedio(){
       int c=0;
       for (int i = 0; i < 100; i++) {
           c = a[i]+c;
            
               
   }
c=c/100;
       System.out.println("Il numeromedio e':"+c);
   
   }
public void percentualeparidispari(){
    int x=0;
    int y=0;
    for (int i = 0; i < 100; i++){
        if (a[i] % 2==0) {
            x++;
            
            
        }else{
            y++;
        }
        
    }
    
    System.out.println("la percentuale dei numeri pari: "+x+"%");
    System.out.println("la percentuale dei numeri dispari: "+y+"%");
}
public void bubblesort(){
    
    for (int i = 0; i <=a.length; i++) {
     
        for (int j = 0; j <a.length-1; j++) {
            if (a[j]>a[j +1]) {
                int s=a[j];
                a[j]=a[j+1];
                a[j+1]=s;
                
                
                
            
                
            }
            
            
            
        }
       
    }
    System.out.println("array ordinato:"+Arrays.toString(a));
}

}


