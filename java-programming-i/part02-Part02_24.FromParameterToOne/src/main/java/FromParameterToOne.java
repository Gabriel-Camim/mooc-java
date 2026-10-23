

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(3);
    }
    
    public static void printFromNumberToOne(int i){
        for(int cont = i; cont > 0; cont--){
            System.out.println(cont);
        }
    }

}
