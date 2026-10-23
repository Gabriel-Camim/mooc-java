/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lil Camin's
 */
public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;
    
    public Person(String initialName){
        this.age = 0;
        this.name = initialName;
        this.weight = 0;
        this.height = 0;
    }
    public void setHeight(int newHeight){
        this.height = newHeight;
    }
    public void setWeight(int newWeight){
        this.weight = newWeight;
    }
    public double bodyMassIndex(){
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }
    public void printPerson(){
        System.out.println(this.name + ", age " + this.age + " years");
    }
    public void growOlder() {
        if (this.age < 30) {
            this.age = this.age + 1;
        }
    }
    public boolean isOfLegalAge(){
        return this.age >= 18;
    }
    // the added method
    public int returnAge() {
        return this.age;
    }
    public String getName() {
        return this.name;
    }
}
