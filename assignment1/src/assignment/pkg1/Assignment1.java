/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1;

/**
 *
 * @author sandesh
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=40,b=6667;
        System.out.println("sum is"+(a+b));
        
        
        if(b%2==0)
            System.out.println("even");
        else 
            System.out.println("odd");
        
        
        
        
        
        int t=a;
          a=b;
          b=t;
          System.out.println(a+" "+b);
          
          
          
          a=a+b;
          b=a-b;
          a=a-b;
          System.out.println(a+" "+b);
          
          
          boolean isprime=true;
          int rootof=625;
          int low=1,high=rootof;
          while(high-low>1)
          { int mid=(low+high)/2;
              if(mid*mid>=rootof)
              high=mid;
          else 
              low=mid;
              }
          for(int j=1;j<high;j++)
          {if(rootof%j==0)
          {isprime=false;
            break;
          }
           }
          if(isprime)
              System.out.println("prime");
          else
               System.out.println("not prime");
              
          
          
          int x=0,y=9;
          for(int i=1;i<=9;i++)
          {int k=x>y?x:y;
        
           for(int j=0;j<=k; j++)
               System.out.print(" ");
            for(int j=1;j<=2*(9-k)-1;j++)
                System.out.print("*");
            System.out.println(" ");
            x++;y--;
          }
    }
    
    
}
