
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("First number? ");
        int from = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number? ");
        int to = Integer.valueOf(scanner.nextLine());
        
        int next = 0;
        int sum = from;
        
        for (int i = from; i < to; i++){
            next = i + 1;
            sum = sum + next;
            
        }
        System.out.println("The sum is " + sum);
    }
}
