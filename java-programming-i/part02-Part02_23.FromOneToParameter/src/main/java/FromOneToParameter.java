import java.util.Scanner;

public class FromOneToParameter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        
        printUntilNumber(3);
        
    }
    
    public static void printUntilNumber(int i){        
        for (int cont = 1; cont <= i; cont++){
            System.out.println(cont);
        }

    }  
}
