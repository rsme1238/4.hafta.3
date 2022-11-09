
package pkg4.hafta.pkg3;

import java.util.Scanner;


public class Hafta3 {

    
    public static void main(String[] args) {
          Scanner input =new Scanner(System.in);
       
      
        System.out.println("Write here the A value ");
        int a = input.nextInt();
        int b=0;
        
        if(a>0){
        int k=  a % 10;
         b = (b*10) +k;
         a= a/10;
        
        }
        System.out.println("Value B is: "+b);
        
    }

    
}
