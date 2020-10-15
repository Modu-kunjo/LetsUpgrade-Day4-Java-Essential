package questiontwo;
import java.util.Scanner;
public class QuestionTwo {
    public static void main(String[] args) {
        int[] arr = new int[5];
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Five number to print the odd ones: ");
        for(int i=0; i<5; i++){
            arr[i] = input.nextInt();
        }
        
        System.out.println("odd numbers are: ");
        for(int i=0; i<5; i++){
            if(arr[i] % 2 != 0){
                System.out.println(arr[i]);
            }
        }
        
        
    }
    
}
