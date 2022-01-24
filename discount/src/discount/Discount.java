
package discount;

import java.util.Scanner;


public class Discount {

    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);
       
  
        //System.out.println(" Enter the discount cost:");
        //int num = obj.nextInt();
        System.out.println(" List Price plese:");
        int Main__= obj.nextInt();
        System.out.println(" discount Price Please:");
        int list_price= obj.nextInt();
      //50int list_price=50,discout_rate;
      
         int Num= list_price*Main__/100;
       
         int total_dis = Main__-Num;
        
        System.out.println("Hert pprice:"+total_dis);
        
     
    }
    
}
