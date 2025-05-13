import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Book {
    public String name;
    public int quantity;
    public int year;
    public Book(String name, int quantity, int year) {
        this.name = name;
        this.quantity = quantity;
        this.year = year;
    }
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", year=" + year +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getYear() {
        return year;
    }

    public Book() {
    }

    public void setYear(int year) {
        this.year = year;
    }
    public static void main(String[] args) {
        List<Book> book = new ArrayList<>();
                book.add(new Book("uppav", 1, 2020));
       book.add(new Book("pav",2,2021));
        book.add(new Book("rev",3,2000));
        Collections.sort(book, (b1,b2)->b1.getName().compareTo(b2.getName()));
        System.out.println(book);

    }
}
