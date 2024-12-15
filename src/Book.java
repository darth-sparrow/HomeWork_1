import java.time.Year;

public class Book {
    private String title;
    private String author;
    private Integer year;
    private boolean isAvailable;

    public Book(String title, String author, Integer year, boolean isAvailable){
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = isAvailable;
    }

    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true;
    }

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.year = Year.now().getValue();
        this.isAvailable = true;
    }

    public String getAuthor(){
        return author;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    public void borrowBook(){
        isAvailable = false;
    }

    public void returnBook(){
        isAvailable = true;
    }

    public void displayInfo(){
        System.out.println(title + " " + author + " " + year + " " + (isAvailable ? "В наличии" : "Выдана"));
    }
}