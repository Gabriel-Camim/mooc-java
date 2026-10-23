
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();
        
        int games = 0;
        int wins = 0;
        int loss = 0;
        
        try(Scanner scanner = new Scanner(Paths.get(file))){
            while(scanner.hasNextLine()){
                String row = scanner.nextLine();
                String[] pieces = row.split(",");
                
                String home = pieces[0];
                String vis = pieces[1];
                int homePoints = Integer.valueOf(pieces[2]);
                int visPoints = Integer.valueOf(pieces[3]);
                
                
                if(row.contains(team)){
                    games++;
                    if(pieces[0].equals(team)){
                        if(homePoints > visPoints){
                            wins++;
                        }else{
                            loss++;
                        }                   
                    }else if(pieces[1].equals(team)){
                        if(homePoints > visPoints){
                            loss++;
                        }else{
                            wins++;
                        }           
                    }
                    
                }                                           
            }
            System.out.println("Games: " + games);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + loss);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }

}
