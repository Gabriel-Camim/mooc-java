import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();
        
        try(Scanner scan = new Scanner(Paths.get(file))){
            while(scan.hasNextLine()){
                
                String row = scan.nextLine();  
                if(row.isEmpty()){
                    continue;
                }
                String[] parts = row.split(",".trim());
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                
                System.out.println(parts[0] + ", age: " + parts[1] + " years");
            }
            
        }catch(Exception e){
            
        }
    }
}
