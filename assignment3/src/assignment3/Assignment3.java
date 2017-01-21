/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;
import java.util.Scanner;

/**
 *
 * @author sandesh
 */
public class Assignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*Scanner getint = new Scanner(System.in);
        System.out.println("enter three numbers");
       int int1=getint.nextInt();
       int int2=getint.nextInt();
       int int3=getint.nextInt();
       
       int k;
        System.out.println("largest number is "+(int3>(k=int1>int2?int1:int2)?int3:k));
        
        */
        //check palindrome
        
        int a=16461;
        int b=a;
        int c=0;
        
        while (b!=0) {
            
            c=c*10 +b%10;
            b/=10;
        }
        if (a==c) {
            System.out.println("palindrome");
        }
        else
            System.out.println("not palindrome");
        
        
        
        
        int n=5;
        n--;
        int x=0,y;
        
        for(y=n;y>=0;y--){
            for(x=0;x<=2*n;){
                if((x<=2*n-y)&&(x>=y)){
                    System.out.print("* ");
                    x+=2;
                }
                else{
                    System.out.print(" ");
                    x++;
                }
                    
            }
               System.out.println(" "); 
            }
            
            
            
        for(y=4;y>=-4;y--){
            for(x=0;x<=2*n;){
                if(y>=-x && y<=x && x<=2*n+y && x<=2*n-y){
                    System.out.print("* ");
                    x+=2;
                }
                else{
                    System.out.print(" ");
                    x++;
                }
            }
            System.out.println("");
        }
       
        
        
         System.out.println("");
        n++;
        
        for(y=n-1;y>=0;y--){
            for(x=0;x<=2*(2*n-1);){
                if((y>=(8-x)/2)&&(y>=(x-8)/2)&&x%2==0){ 
                    System.out.print("*");
                    x++;
                }
                else{
                    System.out.print(" ");
                    x++;
                }
                  
            }
            System.out.println("");
                
            }
       
        
        
        
        
        
        
         System.out.println("");
       
        
        for(y=0;y>=-(2*n-1);y--){
            for(x=0;x<=2*(2*n-1); x++){
                if((y>=(-x)/2-4)&&(y>=(x)/2-12)&&x%2==0 && y<=x/2-4 &&y<=-x/2+4) 
                    System.out.print("*");
                else
                    System.out.print(" ");   
            }
            System.out.println("");
                
            }
       
    }
    
}
