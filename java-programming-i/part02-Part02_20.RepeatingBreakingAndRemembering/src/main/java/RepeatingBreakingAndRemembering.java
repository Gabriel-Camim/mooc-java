
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Give numbers:");

        
        int sum = 0;
        int cont = 0;
        int even = 0;
        int odd = 0;
        
        while (true){          
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1){
                break;
            }
            sum += input;
            cont++;
            
            if (input % 2 != 0){
                odd++;
            }else{
                even++;
            }            
        }
        double avg = cont > 0 ? (double) sum / cont : 0.0;
        
        System.out.println("Thx! Bye!");
        System.out.println("sum: " + sum);
        System.out.println("Numbers: " + cont);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
  

    }
}
