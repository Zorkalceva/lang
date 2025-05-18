import java.util.Scanner;

abstract class Book {
    protected String title;
    protected String author;
    protected int year;
    
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    
    public abstract void displayInfo();
    
    public void checkOut() {
        System.out.println("Книга \"" + title + "\" взята в аренду.");
    }
}

class FictionBook extends Book {
    private String genre;
    
    public FictionBook(String title, String author, int year, String genre) {
        super(title, author, year);
        this.genre = genre;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Художественная книга: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Год издания: " + year);
        System.out.println("Жанр: " + genre);
    }
}

class ScienceBook extends Book {
    private String field;
    
    public ScienceBook(String title, String author, int year, String field) {
        super(title, author, year);
        this.field = field;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Научная книга: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Год издания: " + year);
        System.out.println("Область науки: " + field);
    }
}

public class Library {
    public static void main(String[] args) {
        Book[] books = {
            new FictionBook("Преступление и наказание", "Фёдор Достоевский", 1866, "Рома"),
            new ScienceBook("Краткая история времени", "Стивен Хокинг", 1988, "Космология")
        };
        
        System.out.println("=== Каталог книг ===");
        for (Book book : books) {
            book.displayInfo();
            book.checkOut();
            System.out.println("-------------------");
        }
    }
}