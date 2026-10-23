import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = -1; 
        String name = "";
        
        while(true){
            String input = scanner.nextLine();
            
            // IsEmpty() combinado com trim() garante que linhas só com espaços também parem o programa
            if (input == null || input.trim().isEmpty()) {
                break;
            }
            
            String[] pieces = input.split(",");
            
            // Segurança: só processa se a linha realmente foi dividida em pelo menos 2 partes
            if (pieces.length < 2) {
                continue; // Pula essa linha inválida para não quebrar o código
            }

            // trim() remove espaços extras ao redor do nome ou da idade se houver
            String currentName = pieces[0].trim();
            int age = Integer.valueOf(pieces[1].trim());

            if (age > oldest) {
                oldest = age;
                name = currentName;
            }
        }
        
        System.out.println("Name of the oldest: " + name);
    }
}
