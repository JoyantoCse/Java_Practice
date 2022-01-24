
package prime_number;

public class Prime_Number {

    
    public static void main(String[] args) {
      
        int num=10,count =0;
        for( int i=2;i<num-1;i++){
            if(num%i==0){
                count ++;
                break;
               
            }
            if( count==0){
                System.out.println(" the number is prime");
            }
            else{
                System.out.println(" the number is not prime:");
            }
            
        }
    }
    
}
