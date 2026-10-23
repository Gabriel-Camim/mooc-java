
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number: ");
        int num = Integer.valueOf(scanner.nextLine());
        
        if (num < 0){
            int conv = (num * -1);
            System.out.println(conv);
        }else{
            System.out.println(num);
        }
        

    }
}
