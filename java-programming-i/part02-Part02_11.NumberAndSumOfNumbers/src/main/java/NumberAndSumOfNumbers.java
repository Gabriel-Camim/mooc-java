
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sumNum = 0;
        int numNum = 0;
        
        while (true){
            System.out.println("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0){
                System.out.println("Number of numbers: " + numNum);
                System.out.println("Sum of the numbers: " + sumNum);
                break;                
            }else if(num > 0){
                numNum = numNum + 1;
                sumNum = sumNum + num;
            }else if(num < 0){
                numNum = numNum + 1;
                sumNum = sumNum + num;
            }
        }
    }
}
