
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String user1 = "alex";
        String user2 = "emma";
        String pass1 = "sunshine";
        String pass2 = "haskell";
        
        System.out.println("Enter username: ");
        String login = scanner.nextLine();
        System.out.println("Enter password: ");
        String senha = scanner.nextLine();
        
        if(login.equals(user1) && senha.equals(pass1)){
            System.out.println("You have successfully logged in!");
        }else if(login.equals(user2) && senha.equals(pass2)){
            System.out.println("You have successfully logged in!");
        }else{
            System.out.println("Incorrect username or password!");
        }

    }
}
