
package rent;

import java.util.Scanner;


public class Rent {

 
    public static void main(String[] args) {
      Scanner obj =new Scanner(System.in);
      
        System.out.println("Enter the monthly fixeed cost per month:");
        int n= obj.nextInt();
      
        int t_m=n;
       // System.out.println(t_m);
        System.out.println(" Every per benfit numbeer:");
        int m =obj.nextInt();
        int all= t_m +m*500;
        System.out.println(" The total cost is: "+all);
        
    }
    
}
