
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numSum = 0;
        int sumNumPos = 0;
        boolean pos = false;
        
        while (true){
            System.out.println("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());
            if (num > 0){
                numSum = numSum + 1;
                sumNumPos = sumNumPos + num;   
                pos = true;
            }else if(num == 0 && pos == true){
                double avg = (double) sumNumPos / numSum;
                System.out.println(avg);
                break;
            }else if(num == 0 && pos == false){
                System.out.println("Cannot calculate the average");
                break;
            }
        }

    }
}
