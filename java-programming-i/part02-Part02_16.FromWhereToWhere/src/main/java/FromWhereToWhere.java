
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Where to go?");
        int go = Integer.valueOf(scanner.nextLine());
        System.out.println("Where to start?");
        int start = Integer.valueOf(scanner.nextLine());
        for (int i = start; i <= go; i++){
            System.out.println(i);
        }
    }
}
