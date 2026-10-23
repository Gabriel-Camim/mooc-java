import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> livros = new ArrayList<>();
        
        while(true){
            System.out.println("Title: ");
            String livro = scanner.nextLine();
                if(livro.isEmpty()){
                    break;
                }
            System.out.println("Pages: ");
            int paginas = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int publicacao = Integer.valueOf(scanner.nextLine());
            
            livros.add(new Book(livro, paginas, publicacao));
        }
        System.out.println("What information will be printed? ");
        String information = scanner.nextLine();
        if(information.equals("everything")){
            for(Book livro: livros )
                System.out.println(livro);
        }else if(information.equals("name")){
            for(Book livro: livros)
                System.out.println(livro.getName());
        }
        
        
        
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

    }
}
