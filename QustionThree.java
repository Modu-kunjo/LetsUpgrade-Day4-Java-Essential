
package qustionthree;
import java.util.Scanner;
public class QustionThree {
    
    public static void main(String[] args) {
      int[] arr = new int[5];
      int acc = 0;
      
      Scanner input = new Scanner(System.in);
      
      for(int x=0; x<5; x++){
          System.out.println("Enter a number: ");
          arr[x] = input.nextInt();
          acc += arr[x];  
      }
      System.out.println("the sum is: " + acc);
    }
    
}
