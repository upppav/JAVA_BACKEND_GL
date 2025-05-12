import java.util.HashMap;
import java.util.Map;

public class LibraryManagement {
    private Map<String,Integer> libraryMap;
    public LibraryManagement() {
        this.libraryMap = new HashMap<>();
    }
    //add book
    public void addBook(String name, int quantity) {
        this.libraryMap.put(name, quantity);
        System.out.println("book added");
    }
    //search book
    public Integer searchBook(String name) {
        if (this.libraryMap.containsKey(name)) {
            return this.libraryMap.get(name);
        }
        else{
            System.out.println("Book with name " + name + " not exists");
            return null;
        }
    }
    //display book
    public void displayBook(String name) {
        if (this.libraryMap.containsKey(name)) {
            System.out.println("Book with name " + name + " is available with quantity ");

        }
        else{
            System.out.println("Book with name " + name + " not exists");
        }
    }
    //display all books
    public Map<String,Integer> display()
    {
        return this.libraryMap;
    }
    public static void main(String[] args) {
        LibraryManagement libraryManagement = new LibraryManagement();
        libraryManagement.addBook("uppav", 1);
        libraryManagement.addBook("pav", 2);
        libraryManagement.addBook("up", 3);
        libraryManagement.displayBook("uppav");
        libraryManagement.displayBook("pav");
        libraryManagement.displayBook("up");
        System.out.println(libraryManagement.display());

    }
}
