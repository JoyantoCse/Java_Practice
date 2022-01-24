
package example;

import java.util.Scanner;

 
public class Example {

    
    public static void main(String[] args) {
    int sum=0,num,temp;
    num=153;
    temp=num;
    while(temp!=0){
        int r = temp%10;
        sum =sum+r*r*r;
        temp= temp/10;
    }
      if (num == sum) 
      {
          System.out.println(" the number is Armstrong Numbr:");
      }
      else{
          System.out.println(" the number is not Armstrong:");
      }
    }

}
