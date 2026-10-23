import java.util.ArrayList;

public class Statistics {
    private int count;
    private ArrayList<Integer> numbers = new ArrayList<>();
    
    public Statistics() {
        // initialize the variable numberCount here
        this.count = 0;
        
    }

    public void addNumber(int number) {
        // write code here
        this.count++;
        numbers.add(number);
        
    }

    public int getCount() {
        // write code here
        return count;
    }
    public int sum(){
        int sum = 0;
        for(int i = 0; i < numbers.size(); i++){
            sum += numbers.get(i);
        }
        return sum;
    }
    public double average(){
        if (numbers.size() == 0) {
            return 0.0;
        }
        double avg = (double) sum() /  numbers.size();
        
        
        return avg;
    }
    

}
