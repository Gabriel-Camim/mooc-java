
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number: ");
        int num = Integer.valueOf(scanner.nextLine());
        
        int cont = 0;
        int fac = 1;
        int now = 0;
        int next = 0;
        
        
        while (cont < num){
            
            
            next = cont + 1;
            fac = fac * next;
            cont++;
            
        }
        System.out.println(fac);
    }
}
