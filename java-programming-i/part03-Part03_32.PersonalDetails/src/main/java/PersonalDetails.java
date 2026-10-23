
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int linha = 0;
        int maior = 0;
        int last = 0;
        String name = "";
        
        while(true){
            String input = scanner.nextLine();
            linha++;
            if(input == null || input.trim().isEmpty()){
                linha--;
                break;
            }
            String[] pieces = input.split(",".trim());
            for(int i = 0; i < pieces.length -1; i++){
                sum = sum + Integer.valueOf(pieces[1]);
                last = pieces[0].length();
                if(last > maior){
                    maior = pieces[0].length();
                    name = pieces[0];
                }
            }
            
            
        }
        Double avg = (1.0 * sum) / (linha);
            System.out.println("Longest name: " + name);
            System.out.println("Average of the birth years: " + avg);


    }
}
