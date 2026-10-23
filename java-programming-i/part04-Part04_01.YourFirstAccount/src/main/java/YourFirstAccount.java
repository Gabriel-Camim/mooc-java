
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account camim = new Account("Gabriel Camim", 100.00);
        
        System.out.println("Estado inicial:");
        System.out.println(camim);
        camim.deposit(20);
        System.out.println(camim.toString());
    }
}
