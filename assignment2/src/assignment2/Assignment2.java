/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;
import java.util.Scanner; 

/**
 *
 * @author sandesh
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             
        int n=8, fact=1;
        for(int i=1;i<=n;i++)
            fact=fact*i;
        System.out.println("factorial is"+fact);
        
        
        
        
        
        n=876;
        int temp=0;
        System.out.println(n);
        while(n!=0){
            temp=10*temp+n%10;
            n/=10;
        }
        System.out.println(temp);
        
        
        
        
        int low=0,high=1;
        System.out.print(low+" ");
        while(high<30){
            System.out.print(high+" ");
            high=low+high;
            low=high-low;
                    
           
        }
         System.out.println("");
         
         
         
         

         
            n=153;temp=0;
            int k=n,h=n,digitpower;
            while(k!=0){
                digitpower=1;
                while(h!=0){
                    digitpower*=k%10;
                    h/=10;
                }
                h=n;
                k/=10;
                temp+=digitpower;
                       
            }
            
            if( temp==n)
                System.out.println("armstrong");
            else
                System.out.println("not armstrong");
            
            
            
            
            
            
            
            Scanner reader = new Scanner(System.in);  // Reading from System.io
             
             int mydoc =15;
             System.out.println("enter 3 numbers");
             int int1 = reader.nextInt(); 
             int int2 = reader.nextInt(); 
              int int3 = reader.nextInt(); 
              
              if (int1<int2) {
                  int1=int2;
                }
              if (int1<int3) {
                  int1=int3;
            
                }
              System.out.println("largest number is:"+int1);
              
              
             
             int largest=int3>(k=int1>int2?int1:int2)?int3:k;
             System.out.print(largest);
        
    }
    
}
