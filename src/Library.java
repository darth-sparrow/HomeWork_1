import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library(){
        books = new ArrayList<Book>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public ArrayList<Book> findBooksByAuthor(String author){
        var findedBooks = new ArrayList<Book>();
        for(Book book : books){
            if(book.getAuthor().equals(author))
                findedBooks.add(book);
        }
        return findedBooks;
    }

    public void printAvailableBooks(){
        System.out.println("Список доступных книг:");
        for(Book book : books)
            if(book.isAvailable())
                book.displayInfo();
        System.out.println();
    }
}