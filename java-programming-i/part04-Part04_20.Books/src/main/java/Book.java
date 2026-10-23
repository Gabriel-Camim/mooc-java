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
    private String title;
    private int pages;
    private int year;
    
    public Book (String livro, int paginas, int publicacao) {
    this.pages = paginas;
    this.title = livro;
    this.year = publicacao;
    }
    
    public String getName(){
        return title;
    }
    
    public String toString(){
        String toString = (this.title + ", " + this.pages + " pages, " + this.year);
        return toString;
    }
}
