/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lil Camin's
 */
public class Book {
    private int pages;
    private String name;
    private String author;
    
    public Book(String author, String name, int pages){
        this.author = author;
        this.name = name;
        this.pages = pages;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getName(){
        return this.name;
    }
    public int getPages(){
        return this.pages;
    }
    public String toString(){
        return this.author + ", " + this.name + ", " + this.pages + " pages";
    }
    
}
