package week5;
import java.util.Arrays;
public class Library {
    private String address;
    private Book[] books;

    public void setBookList(Book[] book){
        this.books = books;
    }
    public Book[] getBookList(){
        return this.books;
    }
    public String toString(){
        return Arrays.toString(this.books);
    }
    

    public static void main(String[] args) throws Exception {
        Book book1 = new Book();
        book1.setBookName("Harry Potter");
        System.out.println("after setter , Book1 Name: " + book1.getBookName());

        Book book2 = new Book();
        book2.setBookName("Java");
        System.out.println("Book2 : " + book2.getBookName());

        Book[] booklist = new Book[]{book1, book2};
        
        Library library1 = new Library();
        library1.setBookList(booklist);
        System.out.println(Arrays.toString(library1.getBookList()));

    }
}
