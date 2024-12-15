public class Main {
    static Library lib;
    static{
        lib = new Library();
        lib.addBook(new Book("Пиковая дама", "Пушкин А.С", 2020, true));
        lib.addBook(new Book("Евгений Онегин", "Пушкин А.С"));
    }
    public static void main(String[] args){
        var book_1 = new Book("Руслан и Людмила", "Пушкин А.С", 2021);
        var book_2 = new Book("Мастер и Маргарита", "Булгаков М.А.");

        lib.addBook(book_1);
        lib.addBook(book_2);
        lib.printAvailableBooks();

        book_2.borrowBook();
        lib.printAvailableBooks();

        book_2.returnBook();
        lib.printAvailableBooks();


        var authorsBooks = lib.findBooksByAuthor("Пушкин А.С");
        if(authorsBooks == null)
            System.out.println("Книги автора не найдены");
        else{
            System.out.println("Результат поиска:");
            for(Book book : authorsBooks)
                book.displayInfo();
        }
    }
}