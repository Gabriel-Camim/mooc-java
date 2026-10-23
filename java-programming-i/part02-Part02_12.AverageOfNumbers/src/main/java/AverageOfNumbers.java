
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sumNum = 0;
        int numNum = 0;
        
        while (true){
            System.out.println("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0){
                double avg = (double) sumNum / numNum;
                System.out.println("Average of the numbers: " + avg);
                break;
            }else if (num > 0){
                sumNum = sumNum + num;
                numNum = numNum + 1;
            }else if(num < 0){
                sumNum = sumNum + num;
                numNum = numNum + 1;
            }
        }
        

    }
}
