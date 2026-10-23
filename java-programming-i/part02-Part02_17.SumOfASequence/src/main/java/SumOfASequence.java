import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Last number? ");
        int num = Integer.valueOf(scanner.nextLine());
        int next = 0;
        int cont = 1;
        int sum = 1;
        
        while (cont < num){

            next = cont + 1;
            sum = sum + next;
            cont++;

        }
        System.out.println("The sum is " + sum);
    }
}
