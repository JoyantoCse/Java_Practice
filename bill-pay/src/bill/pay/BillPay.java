
package bill.pay;

import java.util.Scanner;


public class BillPay {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number is:");
        int Units = obj.nextInt();
        //Units=280;
       double billpay =0;
       if( Units<100){
           billpay = Units*1.20;
           System.out.println("the unit into 100 UNit:"); 
       }
       else if( Units <300){
           billpay = 100*1.20+(Units-100)*2;
           
       }
       else if(Units>300)
       {
           billpay =100*1.20+200*2+(Units-300)*3;
       }
        System.out.println(" BillPay to : "+billpay);
    }
    
}
